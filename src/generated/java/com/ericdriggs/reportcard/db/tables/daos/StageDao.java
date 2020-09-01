/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.db.tables.daos;


import com.ericdriggs.reportcard.db.tables.Stage;
import com.ericdriggs.reportcard.db.tables.records.StageRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StageDao extends DAOImpl<StageRecord, com.ericdriggs.reportcard.db.tables.pojos.Stage, Integer> {

    /**
     * Create a new StageDao without any configuration
     */
    public StageDao() {
        super(Stage.STAGE, com.ericdriggs.reportcard.db.tables.pojos.Stage.class);
    }

    /**
     * Create a new StageDao with an attached configuration
     */
    public StageDao(Configuration configuration) {
        super(Stage.STAGE, com.ericdriggs.reportcard.db.tables.pojos.Stage.class, configuration);
    }

    @Override
    public Integer getId(com.ericdriggs.reportcard.db.tables.pojos.Stage object) {
        return object.getStageId();
    }

    /**
     * Fetch records that have <code>stage_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Stage> fetchRangeOfStageId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Stage.STAGE.STAGE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stage_id IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Stage> fetchByStageId(Integer... values) {
        return fetch(Stage.STAGE.STAGE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>stage_id = value</code>
     */
    public com.ericdriggs.reportcard.db.tables.pojos.Stage fetchOneByStageId(Integer value) {
        return fetchOne(Stage.STAGE.STAGE_ID, value);
    }

    /**
     * Fetch records that have <code>stage_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Stage> fetchRangeOfStageName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Stage.STAGE.STAGE_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>stage_name IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Stage> fetchByStageName(String... values) {
        return fetch(Stage.STAGE.STAGE_NAME, values);
    }

    /**
     * Fetch records that have <code>app_branch_fk BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Stage> fetchRangeOfAppBranchFk(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Stage.STAGE.APP_BRANCH_FK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>app_branch_fk IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Stage> fetchByAppBranchFk(Integer... values) {
        return fetch(Stage.STAGE.APP_BRANCH_FK, values);
    }
}
