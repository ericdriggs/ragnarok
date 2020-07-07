/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables;


import com.ericdriggs.ragnarok.db.Indexes;
import com.ericdriggs.ragnarok.db.Keys;
import com.ericdriggs.ragnarok.db.Ragnarok;
import com.ericdriggs.ragnarok.db.tables.records.BuildStageRecord;

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
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BuildStage extends TableImpl<BuildStageRecord> {

    private static final long serialVersionUID = 1909278869;

    /**
     * The reference instance of <code>ragnarok.build_stage</code>
     */
    public static final BuildStage BUILD_STAGE = new BuildStage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BuildStageRecord> getRecordType() {
        return BuildStageRecord.class;
    }

    /**
     * The column <code>ragnarok.build_stage.id</code>.
     */
    public final TableField<BuildStageRecord, ULong> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>ragnarok.build_stage.build_fk</code>.
     */
    public final TableField<BuildStageRecord, ULong> BUILD_FK = createField(DSL.name("build_fk"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>ragnarok.build_stage.stage_fk</code>.
     */
    public final TableField<BuildStageRecord, UInteger> STAGE_FK = createField(DSL.name("stage_fk"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>ragnarok.build_stage</code> table reference
     */
    public BuildStage() {
        this(DSL.name("build_stage"), null);
    }

    /**
     * Create an aliased <code>ragnarok.build_stage</code> table reference
     */
    public BuildStage(String alias) {
        this(DSL.name(alias), BUILD_STAGE);
    }

    /**
     * Create an aliased <code>ragnarok.build_stage</code> table reference
     */
    public BuildStage(Name alias) {
        this(alias, BUILD_STAGE);
    }

    private BuildStage(Name alias, Table<BuildStageRecord> aliased) {
        this(alias, aliased, null);
    }

    private BuildStage(Name alias, Table<BuildStageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> BuildStage(Table<O> child, ForeignKey<O, BuildStageRecord> key) {
        super(child, key, BUILD_STAGE);
    }

    @Override
    public Schema getSchema() {
        return Ragnarok.RAGNAROK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BUILD_STAGE_BUILD_IDX, Indexes.BUILD_STAGE_STAGE_FK_IDX);
    }

    @Override
    public Identity<BuildStageRecord, ULong> getIdentity() {
        return Keys.IDENTITY_BUILD_STAGE;
    }

    @Override
    public UniqueKey<BuildStageRecord> getPrimaryKey() {
        return Keys.KEY_BUILD_STAGE_PRIMARY;
    }

    @Override
    public List<UniqueKey<BuildStageRecord>> getKeys() {
        return Arrays.<UniqueKey<BuildStageRecord>>asList(Keys.KEY_BUILD_STAGE_PRIMARY);
    }

    @Override
    public List<ForeignKey<BuildStageRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BuildStageRecord, ?>>asList(Keys.FK_BUILD, Keys.FK_STAGE);
    }

    public Build build() {
        return new Build(this, Keys.FK_BUILD);
    }

    public Stage stage() {
        return new Stage(this, Keys.FK_STAGE);
    }

    @Override
    public BuildStage as(String alias) {
        return new BuildStage(DSL.name(alias), this);
    }

    @Override
    public BuildStage as(Name alias) {
        return new BuildStage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BuildStage rename(String name) {
        return new BuildStage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BuildStage rename(Name name) {
        return new BuildStage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<ULong, ULong, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
