/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.db.tables.daos;


import com.ericdriggs.reportcard.db.tables.Org;
import com.ericdriggs.reportcard.db.tables.records.OrgRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrgDao extends DAOImpl<OrgRecord, com.ericdriggs.reportcard.db.tables.pojos.Org, Integer> {

    /**
     * Create a new OrgDao without any configuration
     */
    public OrgDao() {
        super(Org.ORG, com.ericdriggs.reportcard.db.tables.pojos.Org.class);
    }

    /**
     * Create a new OrgDao with an attached configuration
     */
    public OrgDao(Configuration configuration) {
        super(Org.ORG, com.ericdriggs.reportcard.db.tables.pojos.Org.class, configuration);
    }

    @Override
    public Integer getId(com.ericdriggs.reportcard.db.tables.pojos.Org object) {
        return object.getOrgId();
    }

    /**
     * Fetch records that have <code>org_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Org> fetchRangeOfOrgId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Org.ORG.ORG_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>org_id IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Org> fetchByOrgId(Integer... values) {
        return fetch(Org.ORG.ORG_ID, values);
    }

    /**
     * Fetch a unique record that has <code>org_id = value</code>
     */
    public com.ericdriggs.reportcard.db.tables.pojos.Org fetchOneByOrgId(Integer value) {
        return fetchOne(Org.ORG.ORG_ID, value);
    }

    /**
     * Fetch records that have <code>org_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Org> fetchRangeOfOrgName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Org.ORG.ORG_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>org_name IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.db.tables.pojos.Org> fetchByOrgName(String... values) {
        return fetch(Org.ORG.ORG_NAME, values);
    }

    /**
     * Fetch a unique record that has <code>org_name = value</code>
     */
    public com.ericdriggs.reportcard.db.tables.pojos.Org fetchOneByOrgName(String value) {
        return fetchOne(Org.ORG.ORG_NAME, value);
    }
}