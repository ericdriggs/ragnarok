/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables.records;


import com.ericdriggs.ragnarok.db.tables.TestSuite;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestSuiteRecord extends UpdatableRecordImpl<TestSuiteRecord> implements Record10<ULong, ULong, String, Integer, Integer, Integer, Integer, Long, Byte, Byte> {

    private static final long serialVersionUID = 1477766463;

    /**
     * Setter for <code>ragnarok.test_suite.id</code>.
     */
    public TestSuiteRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.test_suite.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>ragnarok.test_suite.test_result_fk</code>.
     */
    public TestSuiteRecord setTestResultFk(ULong value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.test_suite.test_result_fk</code>.
     */
    public ULong getTestResultFk() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>ragnarok.test_suite.package</code>.
     */
    public TestSuiteRecord setPackage(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.test_suite.package</code>.
     */
    public String getPackage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ragnarok.test_suite.tests</code>.
     */
    public TestSuiteRecord setTests(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.test_suite.tests</code>.
     */
    public Integer getTests() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ragnarok.test_suite.skipped</code>.
     */
    public TestSuiteRecord setSkipped(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.test_suite.skipped</code>.
     */
    public Integer getSkipped() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ragnarok.test_suite.error</code>.
     */
    public TestSuiteRecord setError(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.test_suite.error</code>.
     */
    public Integer getError() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ragnarok.test_suite.failure</code>.
     */
    public TestSuiteRecord setFailure(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.test_suite.failure</code>.
     */
    public Integer getFailure() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ragnarok.test_suite.time</code>.
     */
    public TestSuiteRecord setTime(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.test_suite.time</code>.
     */
    public Long getTime() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>ragnarok.test_suite.is_success</code>.
     */
    public TestSuiteRecord setIsSuccess(Byte value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.test_suite.is_success</code>.
     */
    public Byte getIsSuccess() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>ragnarok.test_suite.has_skip</code>.
     */
    public TestSuiteRecord setHasSkip(Byte value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.test_suite.has_skip</code>.
     */
    public Byte getHasSkip() {
        return (Byte) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<ULong, ULong, String, Integer, Integer, Integer, Integer, Long, Byte, Byte> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<ULong, ULong, String, Integer, Integer, Integer, Integer, Long, Byte, Byte> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return TestSuite.TEST_SUITE.ID;
    }

    @Override
    public Field<ULong> field2() {
        return TestSuite.TEST_SUITE.TEST_RESULT_FK;
    }

    @Override
    public Field<String> field3() {
        return TestSuite.TEST_SUITE.PACKAGE;
    }

    @Override
    public Field<Integer> field4() {
        return TestSuite.TEST_SUITE.TESTS;
    }

    @Override
    public Field<Integer> field5() {
        return TestSuite.TEST_SUITE.SKIPPED;
    }

    @Override
    public Field<Integer> field6() {
        return TestSuite.TEST_SUITE.ERROR;
    }

    @Override
    public Field<Integer> field7() {
        return TestSuite.TEST_SUITE.FAILURE;
    }

    @Override
    public Field<Long> field8() {
        return TestSuite.TEST_SUITE.TIME;
    }

    @Override
    public Field<Byte> field9() {
        return TestSuite.TEST_SUITE.IS_SUCCESS;
    }

    @Override
    public Field<Byte> field10() {
        return TestSuite.TEST_SUITE.HAS_SKIP;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public ULong component2() {
        return getTestResultFk();
    }

    @Override
    public String component3() {
        return getPackage();
    }

    @Override
    public Integer component4() {
        return getTests();
    }

    @Override
    public Integer component5() {
        return getSkipped();
    }

    @Override
    public Integer component6() {
        return getError();
    }

    @Override
    public Integer component7() {
        return getFailure();
    }

    @Override
    public Long component8() {
        return getTime();
    }

    @Override
    public Byte component9() {
        return getIsSuccess();
    }

    @Override
    public Byte component10() {
        return getHasSkip();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public ULong value2() {
        return getTestResultFk();
    }

    @Override
    public String value3() {
        return getPackage();
    }

    @Override
    public Integer value4() {
        return getTests();
    }

    @Override
    public Integer value5() {
        return getSkipped();
    }

    @Override
    public Integer value6() {
        return getError();
    }

    @Override
    public Integer value7() {
        return getFailure();
    }

    @Override
    public Long value8() {
        return getTime();
    }

    @Override
    public Byte value9() {
        return getIsSuccess();
    }

    @Override
    public Byte value10() {
        return getHasSkip();
    }

    @Override
    public TestSuiteRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public TestSuiteRecord value2(ULong value) {
        setTestResultFk(value);
        return this;
    }

    @Override
    public TestSuiteRecord value3(String value) {
        setPackage(value);
        return this;
    }

    @Override
    public TestSuiteRecord value4(Integer value) {
        setTests(value);
        return this;
    }

    @Override
    public TestSuiteRecord value5(Integer value) {
        setSkipped(value);
        return this;
    }

    @Override
    public TestSuiteRecord value6(Integer value) {
        setError(value);
        return this;
    }

    @Override
    public TestSuiteRecord value7(Integer value) {
        setFailure(value);
        return this;
    }

    @Override
    public TestSuiteRecord value8(Long value) {
        setTime(value);
        return this;
    }

    @Override
    public TestSuiteRecord value9(Byte value) {
        setIsSuccess(value);
        return this;
    }

    @Override
    public TestSuiteRecord value10(Byte value) {
        setHasSkip(value);
        return this;
    }

    @Override
    public TestSuiteRecord values(ULong value1, ULong value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7, Long value8, Byte value9, Byte value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestSuiteRecord
     */
    public TestSuiteRecord() {
        super(TestSuite.TEST_SUITE);
    }

    /**
     * Create a detached, initialised TestSuiteRecord
     */
    public TestSuiteRecord(ULong id, ULong testResultFk, String package_, Integer tests, Integer skipped, Integer error, Integer failure, Long time, Byte isSuccess, Byte hasSkip) {
        super(TestSuite.TEST_SUITE);

        set(0, id);
        set(1, testResultFk);
        set(2, package_);
        set(3, tests);
        set(4, skipped);
        set(5, error);
        set(6, failure);
        set(7, time);
        set(8, isSuccess);
        set(9, hasSkip);
    }
}
