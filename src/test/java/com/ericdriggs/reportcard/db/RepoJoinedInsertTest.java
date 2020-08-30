package com.ericdriggs.reportcard.db;

import com.ericdriggs.reportcard.ReportCardService;
import com.ericdriggs.reportcard.db.tables.pojos.Repo;
import com.ericdriggs.reportcard.model.BuildStagePath;
import com.ericdriggs.reportcard.model.BuildStagePathRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;

import static org.junit.jupiter.api.Assertions.*;

@Profile("test")
//@EnableConfigurationProperties
public class RepoJoinedInsertTest extends AbstractDbTest {

    @Autowired
    public RepoJoinedInsertTest(ReportCardService reportCardService ) {
        super(reportCardService);
    }

    //Fails
    @Test
    public void getRepoFromRecord() {
        Repo repo = reportCardService.getRepoFromRecord("default", "default");
        assertNotNull(repo);
    }

    //Works
    @Test
    public void getRepoFromRepoRecord() {
        Repo repo = reportCardService.getRepoFromRepoRecord("default", "default");
        assertNotNull(repo);
    }
}
