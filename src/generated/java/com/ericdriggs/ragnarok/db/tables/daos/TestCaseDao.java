/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables.daos;


import com.ericdriggs.ragnarok.db.tables.TestCase;
import com.ericdriggs.ragnarok.db.tables.records.TestCaseRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestCaseDao extends DAOImpl<TestCaseRecord, com.ericdriggs.ragnarok.db.tables.pojos.TestCase, Long> {

    /**
     * Create a new TestCaseDao without any configuration
     */
    public TestCaseDao() {
        super(TestCase.TEST_CASE, com.ericdriggs.ragnarok.db.tables.pojos.TestCase.class);
    }

    /**
     * Create a new TestCaseDao with an attached configuration
     */
    public TestCaseDao(Configuration configuration) {
        super(TestCase.TEST_CASE, com.ericdriggs.ragnarok.db.tables.pojos.TestCase.class, configuration);
    }

    @Override
    public Long getId(com.ericdriggs.ragnarok.db.tables.pojos.TestCase object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchById(Long... values) {
        return fetch(TestCase.TEST_CASE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.ericdriggs.ragnarok.db.tables.pojos.TestCase fetchOneById(Long value) {
        return fetchOne(TestCase.TEST_CASE.ID, value);
    }

    /**
     * Fetch records that have <code>test_suite_fk BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchRangeOfTestSuiteFk(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.TEST_SUITE_FK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>test_suite_fk IN (values)</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchByTestSuiteFk(Long... values) {
        return fetch(TestCase.TEST_CASE.TEST_SUITE_FK, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchByName(String... values) {
        return fetch(TestCase.TEST_CASE.NAME, values);
    }

    /**
     * Fetch records that have <code>class_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchRangeOfClassName(String lowerInclusive, String upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.CLASS_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>class_name IN (values)</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchByClassName(String... values) {
        return fetch(TestCase.TEST_CASE.CLASS_NAME, values);
    }

    /**
     * Fetch records that have <code>time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchRangeOfTime(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>time IN (values)</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchByTime(Long... values) {
        return fetch(TestCase.TEST_CASE.TIME, values);
    }

    /**
     * Fetch records that have <code>status_fk BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchRangeOfStatusFk(Byte lowerInclusive, Byte upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.STATUS_FK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>status_fk IN (values)</code>
     */
    public List<com.ericdriggs.ragnarok.db.tables.pojos.TestCase> fetchByStatusFk(Byte... values) {
        return fetch(TestCase.TEST_CASE.STATUS_FK, values);
    }
}
