/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables;


import com.ericdriggs.ragnarok.db.Indexes;
import com.ericdriggs.ragnarok.db.Keys;
import com.ericdriggs.ragnarok.db.Ragnarok;
import com.ericdriggs.ragnarok.db.tables.records.AppRecord;

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
public class App extends TableImpl<AppRecord> {

    private static final long serialVersionUID = -802814950;

    /**
     * The reference instance of <code>ragnarok.app</code>
     */
    public static final App APP = new App();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppRecord> getRecordType() {
        return AppRecord.class;
    }

    /**
     * The column <code>ragnarok.app.id</code>.
     */
    public final TableField<AppRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>ragnarok.app.name</code>.
     */
    public final TableField<AppRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ragnarok.app.branch_fk</code>.
     */
    public final TableField<AppRecord, UInteger> BRANCH_FK = createField(DSL.name("branch_fk"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>ragnarok.app</code> table reference
     */
    public App() {
        this(DSL.name("app"), null);
    }

    /**
     * Create an aliased <code>ragnarok.app</code> table reference
     */
    public App(String alias) {
        this(DSL.name(alias), APP);
    }

    /**
     * Create an aliased <code>ragnarok.app</code> table reference
     */
    public App(Name alias) {
        this(alias, APP);
    }

    private App(Name alias, Table<AppRecord> aliased) {
        this(alias, aliased, null);
    }

    private App(Name alias, Table<AppRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> App(Table<O> child, ForeignKey<O, AppRecord> key) {
        super(child, key, APP);
    }

    @Override
    public Schema getSchema() {
        return Ragnarok.RAGNAROK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.APP_BRANCH_IDX);
    }

    @Override
    public Identity<AppRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_APP;
    }

    @Override
    public UniqueKey<AppRecord> getPrimaryKey() {
        return Keys.KEY_APP_PRIMARY;
    }

    @Override
    public List<UniqueKey<AppRecord>> getKeys() {
        return Arrays.<UniqueKey<AppRecord>>asList(Keys.KEY_APP_PRIMARY, Keys.KEY_APP_BRANCH_APP_IDX, Keys.KEY_APP_NAME_UNIQUE);
    }

    @Override
    public List<ForeignKey<AppRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AppRecord, ?>>asList(Keys.BRANCH_FK);
    }

    public Branch branch() {
        return new Branch(this, Keys.BRANCH_FK);
    }

    @Override
    public App as(String alias) {
        return new App(DSL.name(alias), this);
    }

    @Override
    public App as(Name alias) {
        return new App(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public App rename(String name) {
        return new App(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public App rename(Name name) {
        return new App(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, String, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}