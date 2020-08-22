/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.db.tables;


import com.ericdriggs.reportcard.db.Indexes;
import com.ericdriggs.reportcard.db.Keys;
import com.ericdriggs.reportcard.db.Reportcard;
import com.ericdriggs.reportcard.db.tables.records.TestCaseRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestCase extends TableImpl<TestCaseRecord> {

    private static final long serialVersionUID = 1964570671;

    /**
     * The reference instance of <code>reportcard.test_case</code>
     */
    public static final TestCase TEST_CASE = new TestCase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestCaseRecord> getRecordType() {
        return TestCaseRecord.class;
    }

    /**
     * The column <code>reportcard.test_case.id</code>.
     */
    public final TableField<TestCaseRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>reportcard.test_case.test_suite_fk</code>.
     */
    public final TableField<TestCaseRecord, Long> TEST_SUITE_FK = createField(DSL.name("test_suite_fk"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>reportcard.test_case.name</code>.
     */
    public final TableField<TestCaseRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * The column <code>reportcard.test_case.class_name</code>.
     */
    public final TableField<TestCaseRecord, String> CLASS_NAME = createField(DSL.name("class_name"), org.jooq.impl.SQLDataType.VARCHAR(8096).nullable(false), this, "");

    /**
     * The column <code>reportcard.test_case.time</code>.
     */
    public final TableField<TestCaseRecord, Long> TIME = createField(DSL.name("time"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>reportcard.test_case.status_fk</code>.
     */
    public final TableField<TestCaseRecord, Byte> STATUS_FK = createField(DSL.name("status_fk"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>reportcard.test_case</code> table reference
     */
    public TestCase() {
        this(DSL.name("test_case"), null);
    }

    /**
     * Create an aliased <code>reportcard.test_case</code> table reference
     */
    public TestCase(String alias) {
        this(DSL.name(alias), TEST_CASE);
    }

    /**
     * Create an aliased <code>reportcard.test_case</code> table reference
     */
    public TestCase(Name alias) {
        this(alias, TEST_CASE);
    }

    private TestCase(Name alias, Table<TestCaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestCase(Name alias, Table<TestCaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TestCase(Table<O> child, ForeignKey<O, TestCaseRecord> key) {
        super(child, key, TEST_CASE);
    }

    @Override
    public Schema getSchema() {
        return Reportcard.REPORTCARD;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TEST_CASE_FK_TEST_CASE_STATUS_IDX, Indexes.TEST_CASE_FK_TEST_CASE_TEST_SUITE_IDX);
    }

    @Override
    public Identity<TestCaseRecord, Long> getIdentity() {
        return Keys.IDENTITY_TEST_CASE;
    }

    @Override
    public UniqueKey<TestCaseRecord> getPrimaryKey() {
        return Keys.KEY_TEST_CASE_PRIMARY;
    }

    @Override
    public List<UniqueKey<TestCaseRecord>> getKeys() {
        return Arrays.<UniqueKey<TestCaseRecord>>asList(Keys.KEY_TEST_CASE_PRIMARY);
    }

    @Override
    public List<ForeignKey<TestCaseRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TestCaseRecord, ?>>asList(Keys.FK_TEST_CASE_TEST_SUITE, Keys.FK_TEST_CASE_TEST_STATUS);
    }

    public TestSuite testSuite() {
        return new TestSuite(this, Keys.FK_TEST_CASE_TEST_SUITE);
    }

    public TestStatus testStatus() {
        return new TestStatus(this, Keys.FK_TEST_CASE_TEST_STATUS);
    }

    @Override
    public TestCase as(String alias) {
        return new TestCase(DSL.name(alias), this);
    }

    @Override
    public TestCase as(Name alias) {
        return new TestCase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TestCase rename(String name) {
        return new TestCase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TestCase rename(Name name) {
        return new TestCase(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, String, String, Long, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}