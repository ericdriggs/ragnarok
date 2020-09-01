/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.db.tables.daos;


import com.ericdriggs.reportcard.db.tables.Repo;
import com.ericdriggs.reportcard.db.tables.records.RepoRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RepoDao extends DAOImpl<RepoRecord, com.ericdriggs.reportcard.db.tables.pojos.Repo, Integer> {

    /**
     * Create a new RepoDao without any configuration
     */
    public RepoDao() {
        super(Repo.REPO, com.ericdriggs.reportcard.db.tables.pojos.Repo.class);
    }

    /**
     * Create a new RepoDao with an attached configuration
     */
    public RepoDao(Configuration configuration) {
        super(Repo.REPO, com.ericdriggs.reportcard.db.tables.pojos.Repo.class, configuration);
    }

    @Override
    public Integer getId(com.ericdriggs.reportcard.db.tables.pojos.Repo object) {
        return object.getRepoId();
    }

    /**
     * Fetch records that have <code>repo_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Repo> fetchRangeOfRepoId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Repo.REPO.REPO_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>repo_id IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Repo> fetchByRepoId(Integer... values) {
        return fetch(Repo.REPO.REPO_ID, values);
    }

    /**
     * Fetch a unique record that has <code>repo_id = value</code>
     */
    public com.ericdriggs.reportcard.db.tables.pojos.Repo fetchOneByRepoId(Integer value) {
        return fetchOne(Repo.REPO.REPO_ID, value);
    }

    /**
     * Fetch records that have <code>repo_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Repo> fetchRangeOfRepoName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Repo.REPO.REPO_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>repo_name IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Repo> fetchByRepoName(String... values) {
        return fetch(Repo.REPO.REPO_NAME, values);
    }

    /**
     * Fetch records that have <code>org_fk BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Repo> fetchRangeOfOrgFk(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Repo.REPO.ORG_FK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>org_fk IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Repo> fetchByOrgFk(Integer... values) {
        return fetch(Repo.REPO.ORG_FK, values);
    }
}
