/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.gen.db.tables.daos;


import com.ericdriggs.reportcard.gen.db.tables.TestCase;
import com.ericdriggs.reportcard.gen.db.tables.records.TestCaseRecord;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestCaseDao extends DAOImpl<TestCaseRecord, com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase, Long> {

    /**
     * Create a new TestCaseDao without any configuration
     */
    public TestCaseDao() {
        super(TestCase.TEST_CASE, com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase.class);
    }

    /**
     * Create a new TestCaseDao with an attached configuration
     */
    public TestCaseDao(Configuration configuration) {
        super(TestCase.TEST_CASE, com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase.class, configuration);
    }

    @Override
    public Long getId(com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase object) {
        return object.getTestCaseId();
    }

    /**
     * Fetch records that have <code>test_case_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchRangeOfTestCaseId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.TEST_CASE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>test_case_id IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchByTestCaseId(Long... values) {
        return fetch(TestCase.TEST_CASE.TEST_CASE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>test_case_id = value</code>
     */
    public com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase fetchOneByTestCaseId(Long value) {
        return fetchOne(TestCase.TEST_CASE.TEST_CASE_ID, value);
    }

    /**
     * Fetch records that have <code>test_suite_fk BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchRangeOfTestSuiteFk(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.TEST_SUITE_FK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>test_suite_fk IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchByTestSuiteFk(Long... values) {
        return fetch(TestCase.TEST_CASE.TEST_SUITE_FK, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchByName(String... values) {
        return fetch(TestCase.TEST_CASE.NAME, values);
    }

    /**
     * Fetch records that have <code>class_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchRangeOfClassName(String lowerInclusive, String upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.CLASS_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>class_name IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchByClassName(String... values) {
        return fetch(TestCase.TEST_CASE.CLASS_NAME, values);
    }

    /**
     * Fetch records that have <code>time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchRangeOfTime(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>time IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchByTime(BigDecimal... values) {
        return fetch(TestCase.TEST_CASE.TIME, values);
    }

    /**
     * Fetch records that have <code>test_status_fk BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchRangeOfTestStatusFk(Byte lowerInclusive, Byte upperInclusive) {
        return fetchRange(TestCase.TEST_CASE.TEST_STATUS_FK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>test_status_fk IN (values)</code>
     */
    public List<com.ericdriggs.reportcard.gen.db.tables.pojos.TestCase> fetchByTestStatusFk(Byte... values) {
        return fetch(TestCase.TEST_CASE.TEST_STATUS_FK, values);
    }
}