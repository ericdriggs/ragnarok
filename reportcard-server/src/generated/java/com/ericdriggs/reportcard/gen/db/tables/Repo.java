/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.gen.db.tables;


import com.ericdriggs.reportcard.gen.db.Indexes;
import com.ericdriggs.reportcard.gen.db.Keys;
import com.ericdriggs.reportcard.gen.db.Reportcard;
import com.ericdriggs.reportcard.gen.db.tables.records.RepoRecord;

import java.util.Arrays;
import java.util.List;

import lombok.Generated;

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
@Generated
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Repo extends TableImpl<RepoRecord> {

    private static final long serialVersionUID = 1484137807;

    /**
     * The reference instance of <code>reportcard.repo</code>
     */
    public static final Repo REPO = new Repo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RepoRecord> getRecordType() {
        return RepoRecord.class;
    }

    /**
     * The column <code>reportcard.repo.repo_id</code>.
     */
    public final TableField<RepoRecord, Integer> REPO_ID = createField(DSL.name("repo_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>reportcard.repo.repo_name</code>.
     */
    public final TableField<RepoRecord, String> REPO_NAME = createField(DSL.name("repo_name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>reportcard.repo.org_fk</code>.
     */
    public final TableField<RepoRecord, Integer> ORG_FK = createField(DSL.name("org_fk"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>reportcard.repo</code> table reference
     */
    public Repo() {
        this(DSL.name("repo"), null);
    }

    /**
     * Create an aliased <code>reportcard.repo</code> table reference
     */
    public Repo(String alias) {
        this(DSL.name(alias), REPO);
    }

    /**
     * Create an aliased <code>reportcard.repo</code> table reference
     */
    public Repo(Name alias) {
        this(alias, REPO);
    }

    private Repo(Name alias, Table<RepoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Repo(Name alias, Table<RepoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Repo(Table<O> child, ForeignKey<O, RepoRecord> key) {
        super(child, key, REPO);
    }

    @Override
    public Schema getSchema() {
        return Reportcard.REPORTCARD;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.REPO_ORG_IDX);
    }

    @Override
    public Identity<RepoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REPO;
    }

    @Override
    public UniqueKey<RepoRecord> getPrimaryKey() {
        return Keys.KEY_REPO_PRIMARY;
    }

    @Override
    public List<UniqueKey<RepoRecord>> getKeys() {
        return Arrays.<UniqueKey<RepoRecord>>asList(Keys.KEY_REPO_PRIMARY, Keys.KEY_REPO_REPO_NAME_IDX);
    }

    @Override
    public List<ForeignKey<RepoRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RepoRecord, ?>>asList(Keys.REPO_ORG_FK);
    }

    public Org org() {
        return new Org(this, Keys.REPO_ORG_FK);
    }

    @Override
    public Repo as(String alias) {
        return new Repo(DSL.name(alias), this);
    }

    @Override
    public Repo as(Name alias) {
        return new Repo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Repo rename(String name) {
        return new Repo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Repo rename(Name name) {
        return new Repo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
