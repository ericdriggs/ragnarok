/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables;


import com.ericdriggs.ragnarok.db.Indexes;
import com.ericdriggs.ragnarok.db.Keys;
import com.ericdriggs.ragnarok.db.Ragnarok;
import com.ericdriggs.ragnarok.db.tables.records.StorageRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class Storage extends TableImpl<StorageRecord> {

    private static final long serialVersionUID = 1307568682;

    /**
     * The reference instance of <code>ragnarok.storage</code>
     */
    public static final Storage STORAGE = new Storage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StorageRecord> getRecordType() {
        return StorageRecord.class;
    }

    /**
     * The column <code>ragnarok.storage.id</code>.
     */
    public final TableField<StorageRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>ragnarok.storage.build_stage_fk</code>.
     */
    public final TableField<StorageRecord, ULong> BUILD_STAGE_FK = createField(DSL.name("build_stage_fk"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>ragnarok.storage.label</code>.
     */
    public final TableField<StorageRecord, String> LABEL = createField(DSL.name("label"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ragnarok.storage.storage_type_fk</code>.
     */
    public final TableField<StorageRecord, Byte> STORAGE_TYPE_FK = createField(DSL.name("storage_type_fk"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>ragnarok.storage.s3_bucket</code>.
     */
    public final TableField<StorageRecord, String> S3_BUCKET = createField(DSL.name("s3_bucket"), org.jooq.impl.SQLDataType.VARCHAR(63).nullable(false), this, "");

    /**
     * The column <code>ragnarok.storage.s3_folder_path</code>.
     */
    public final TableField<StorageRecord, String> S3_FOLDER_PATH = createField(DSL.name("s3_folder_path"), org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false), this, "");

    /**
     * The column <code>ragnarok.storage.s3_file_name</code>.
     */
    public final TableField<StorageRecord, String> S3_FILE_NAME = createField(DSL.name("s3_file_name"), org.jooq.impl.SQLDataType.VARCHAR(8096), this, "");

    /**
     * The column <code>ragnarok.storage.s3_file_matcher</code>.
     */
    public final TableField<StorageRecord, String> S3_FILE_MATCHER = createField(DSL.name("s3_file_matcher"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>ragnarok.storage</code> table reference
     */
    public Storage() {
        this(DSL.name("storage"), null);
    }

    /**
     * Create an aliased <code>ragnarok.storage</code> table reference
     */
    public Storage(String alias) {
        this(DSL.name(alias), STORAGE);
    }

    /**
     * Create an aliased <code>ragnarok.storage</code> table reference
     */
    public Storage(Name alias) {
        this(alias, STORAGE);
    }

    private Storage(Name alias, Table<StorageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Storage(Name alias, Table<StorageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Storage(Table<O> child, ForeignKey<O, StorageRecord> key) {
        super(child, key, STORAGE);
    }

    @Override
    public Schema getSchema() {
        return Ragnarok.RAGNAROK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.STORAGE_BUILD_STAGE_IDX);
    }

    @Override
    public Identity<StorageRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_STORAGE;
    }

    @Override
    public UniqueKey<StorageRecord> getPrimaryKey() {
        return Keys.KEY_STORAGE_PRIMARY;
    }

    @Override
    public List<UniqueKey<StorageRecord>> getKeys() {
        return Arrays.<UniqueKey<StorageRecord>>asList(Keys.KEY_STORAGE_PRIMARY);
    }

    @Override
    public List<ForeignKey<StorageRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StorageRecord, ?>>asList(Keys.FK_REPORT_BUILD_STAGE);
    }

    public BuildStage buildStage() {
        return new BuildStage(this, Keys.FK_REPORT_BUILD_STAGE);
    }

    @Override
    public Storage as(String alias) {
        return new Storage(DSL.name(alias), this);
    }

    @Override
    public Storage as(Name alias) {
        return new Storage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Storage rename(String name) {
        return new Storage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Storage rename(Name name) {
        return new Storage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<UInteger, ULong, String, Byte, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}