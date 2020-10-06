/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.gen.db.tables;


import com.ericdriggs.reportcard.gen.db.Indexes;
import com.ericdriggs.reportcard.gen.db.Keys;
import com.ericdriggs.reportcard.gen.db.Reportcard;
import com.ericdriggs.reportcard.gen.db.tables.records.AppBranchRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppBranch extends TableImpl<AppBranchRecord> {

    private static final long serialVersionUID = 60820529;

    /**
     * The reference instance of <code>reportcard.app_branch</code>
     */
    public static final AppBranch APP_BRANCH = new AppBranch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppBranchRecord> getRecordType() {
        return AppBranchRecord.class;
    }

    /**
     * The column <code>reportcard.app_branch.app_branch_id</code>.
     */
    public final TableField<AppBranchRecord, Integer> APP_BRANCH_ID = createField(DSL.name("app_branch_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>reportcard.app_branch.app_fk</code>.
     */
    public final TableField<AppBranchRecord, Integer> APP_FK = createField(DSL.name("app_fk"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reportcard.app_branch.branch_fk</code>.
     */
    public final TableField<AppBranchRecord, Integer> BRANCH_FK = createField(DSL.name("branch_fk"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>reportcard.app_branch</code> table reference
     */
    public AppBranch() {
        this(DSL.name("app_branch"), null);
    }

    /**
     * Create an aliased <code>reportcard.app_branch</code> table reference
     */
    public AppBranch(String alias) {
        this(DSL.name(alias), APP_BRANCH);
    }

    /**
     * Create an aliased <code>reportcard.app_branch</code> table reference
     */
    public AppBranch(Name alias) {
        this(alias, APP_BRANCH);
    }

    private AppBranch(Name alias, Table<AppBranchRecord> aliased) {
        this(alias, aliased, null);
    }

    private AppBranch(Name alias, Table<AppBranchRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> AppBranch(Table<O> child, ForeignKey<O, AppBranchRecord> key) {
        super(child, key, APP_BRANCH);
    }

    @Override
    public Schema getSchema() {
        return Reportcard.REPORTCARD;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.APP_BRANCH_APP_BRANCH_APP_FK_IDX, Indexes.APP_BRANCH_APP_BRANCH_BRANCH_FK_IDX);
    }

    @Override
    public Identity<AppBranchRecord, Integer> getIdentity() {
        return Keys.IDENTITY_APP_BRANCH;
    }

    @Override
    public UniqueKey<AppBranchRecord> getPrimaryKey() {
        return Keys.KEY_APP_BRANCH_PRIMARY;
    }

    @Override
    public List<UniqueKey<AppBranchRecord>> getKeys() {
        return Arrays.<UniqueKey<AppBranchRecord>>asList(Keys.KEY_APP_BRANCH_PRIMARY);
    }

    @Override
    public List<ForeignKey<AppBranchRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AppBranchRecord, ?>>asList(Keys.APP_BRANCH_APP_FK, Keys.APP_BRANCH_BRANCH_FK);
    }

    public App app() {
        return new App(this, Keys.APP_BRANCH_APP_FK);
    }

    public Branch branch() {
        return new Branch(this, Keys.APP_BRANCH_BRANCH_FK);
    }

    @Override
    public AppBranch as(String alias) {
        return new AppBranch(DSL.name(alias), this);
    }

    @Override
    public AppBranch as(Name alias) {
        return new AppBranch(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AppBranch rename(String name) {
        return new AppBranch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AppBranch rename(Name name) {
        return new AppBranch(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}