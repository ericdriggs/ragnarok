/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.db.tables.daos;


import com.ericdriggs.reportcard.db.tables.Build;
import com.ericdriggs.reportcard.db.tables.records.BuildRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BuildDao extends DAOImpl<BuildRecord, com.ericdriggs.reportcard.db.tables.pojos.Build, Long> {

    /**
     * Create a new BuildDao without any configuration
     */
    public BuildDao() {
        super(Build.BUILD, com.ericdriggs.reportcard.db.tables.pojos.Build.class);
    }

    /**
     * Create a new BuildDao with an attached configuration
     */
    public BuildDao(Configuration configuration) {
        super(Build.BUILD, com.ericdriggs.reportcard.db.tables.pojos.Build.class, configuration);
    }

    @Override
    public Long getId(com.ericdriggs.reportcard.db.tables.pojos.Build object) {
        return object.getBuildId();
    }

    /**
     * Fetch records that have <code>build_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Build> fetchRangeOfBuildId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Build.BUILD.BUILD_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>build_id IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Build> fetchByBuildId(Long... values) {
        return fetch(Build.BUILD.BUILD_ID, values);
    }

    /**
     * Fetch a unique record that has <code>build_id = value</code>
     */
    public com.ericdriggs.reportcard.db.tables.pojos.Build fetchOneByBuildId(Long value) {
        return fetchOne(Build.BUILD.BUILD_ID, value);
    }

    /**
     * Fetch records that have <code>app_branch_fk BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Build> fetchRangeOfAppBranchFk(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Build.BUILD.APP_BRANCH_FK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>app_branch_fk IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Build> fetchByAppBranchFk(Integer... values) {
        return fetch(Build.BUILD.APP_BRANCH_FK, values);
    }

    /**
     * Fetch records that have <code>build_unique_string BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Build> fetchRangeOfBuildUniqueString(String lowerInclusive, String upperInclusive) {
        return fetchRange(Build.BUILD.BUILD_UNIQUE_STRING, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>build_unique_string IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Build> fetchByBuildUniqueString(String... values) {
        return fetch(Build.BUILD.BUILD_UNIQUE_STRING, values);
    }

    /**
     * Fetch records that have <code>build_created BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Build> fetchRangeOfBuildCreated(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Build.BUILD.BUILD_CREATED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>build_created IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Build> fetchByBuildCreated(LocalDateTime... values) {
        return fetch(Build.BUILD.BUILD_CREATED, values);
    }
}
