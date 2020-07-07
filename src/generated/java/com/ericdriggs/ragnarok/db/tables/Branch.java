/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables;


import com.ericdriggs.ragnarok.db.Indexes;
import com.ericdriggs.ragnarok.db.Keys;
import com.ericdriggs.ragnarok.db.Ragnarok;
import com.ericdriggs.ragnarok.db.tables.records.BranchRecord;

import java.util.Arrays;
import java.util.List;

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
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Branch extends TableImpl<BranchRecord> {

    private static final long serialVersionUID = 1870539046;

    /**
     * The reference instance of <code>ragnarok.branch</code>
     */
    public static final Branch BRANCH = new Branch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BranchRecord> getRecordType() {
        return BranchRecord.class;
    }

    /**
     * The column <code>ragnarok.branch.id</code>.
     */
    public final TableField<BranchRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>ragnarok.branch.name</code>.
     */
    public final TableField<BranchRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ragnarok.branch.repo_fk</code>.
     */
    public final TableField<BranchRecord, UInteger> REPO_FK = createField(DSL.name("repo_fk"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>ragnarok.branch</code> table reference
     */
    public Branch() {
        this(DSL.name("branch"), null);
    }

    /**
     * Create an aliased <code>ragnarok.branch</code> table reference
     */
    public Branch(String alias) {
        this(DSL.name(alias), BRANCH);
    }

    /**
     * Create an aliased <code>ragnarok.branch</code> table reference
     */
    public Branch(Name alias) {
        this(alias, BRANCH);
    }

    private Branch(Name alias, Table<BranchRecord> aliased) {
        this(alias, aliased, null);
    }

    private Branch(Name alias, Table<BranchRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Branch(Table<O> child, ForeignKey<O, BranchRecord> key) {
        super(child, key, BRANCH);
    }

    @Override
    public Schema getSchema() {
        return Ragnarok.RAGNAROK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BRANCH_REPO_IDX);
    }

    @Override
    public Identity<BranchRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_BRANCH;
    }

    @Override
    public UniqueKey<BranchRecord> getPrimaryKey() {
        return Keys.KEY_BRANCH_PRIMARY;
    }

    @Override
    public List<UniqueKey<BranchRecord>> getKeys() {
        return Arrays.<UniqueKey<BranchRecord>>asList(Keys.KEY_BRANCH_PRIMARY, Keys.KEY_BRANCH_REPO_BRANCH_IDX, Keys.KEY_BRANCH_NAME_UNIQUE);
    }

    @Override
    public List<ForeignKey<BranchRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BranchRecord, ?>>asList(Keys.REPO_FK);
    }

    public Repo repo() {
        return new Repo(this, Keys.REPO_FK);
    }

    @Override
    public Branch as(String alias) {
        return new Branch(DSL.name(alias), this);
    }

    @Override
    public Branch as(Name alias) {
        return new Branch(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Branch rename(String name) {
        return new Branch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Branch rename(Name name) {
        return new Branch(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, String, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
