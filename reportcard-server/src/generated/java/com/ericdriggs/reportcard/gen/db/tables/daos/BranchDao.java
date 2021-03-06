/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.gen.db.tables.daos;


import com.ericdriggs.reportcard.gen.db.tables.Branch;
import com.ericdriggs.reportcard.gen.db.tables.records.BranchRecord;

import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BranchDao extends DAOImpl<BranchRecord, com.ericdriggs.reportcard.gen.db.tables.pojos.Branch, Integer> {

    /**
     * Create a new BranchDao without any configuration
     */
    public BranchDao() {
        super(Branch.BRANCH, com.ericdriggs.reportcard.gen.db.tables.pojos.Branch.class);
    }

    /**
     * Create a new BranchDao with an attached configuration
     */
    public BranchDao(Configuration configuration) {
        super(Branch.BRANCH, com.ericdriggs.reportcard.gen.db.tables.pojos.Branch.class, configuration);
    }

    @Override
    public Integer getId(com.ericdriggs.reportcard.gen.db.tables.pojos.Branch object) {
        return object.getBranchId();
    }

    /**
     * Fetch records that have <code>branch_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.Branch> fetchRangeOfBranchId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Branch.BRANCH.BRANCH_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>branch_id IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.Branch> fetchByBranchId(Integer... values) {
        return fetch(Branch.BRANCH.BRANCH_ID, values);
    }

    /**
     * Fetch a unique record that has <code>branch_id = value</code>
     */
    public com.ericdriggs.reportcard.gen.db.tables.pojos.Branch fetchOneByBranchId(Integer value) {
        return fetchOne(Branch.BRANCH.BRANCH_ID, value);
    }

    /**
     * Fetch records that have <code>branch_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.Branch> fetchRangeOfBranchName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Branch.BRANCH.BRANCH_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>branch_name IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.Branch> fetchByBranchName(String... values) {
        return fetch(Branch.BRANCH.BRANCH_NAME, values);
    }

    /**
     * Fetch records that have <code>repo_fk BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.Branch> fetchRangeOfRepoFk(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Branch.BRANCH.REPO_FK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>repo_fk IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.Branch> fetchByRepoFk(Integer... values) {
        return fetch(Branch.BRANCH.REPO_FK, values);
    }
}
