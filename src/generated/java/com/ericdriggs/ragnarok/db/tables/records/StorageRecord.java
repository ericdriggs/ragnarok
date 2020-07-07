/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables.records;


import com.ericdriggs.ragnarok.db.tables.Storage;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StorageRecord extends UpdatableRecordImpl<StorageRecord> implements Record8<Integer, Long, String, Byte, String, String, String, String> {

    private static final long serialVersionUID = -429425081;

    /**
     * Setter for <code>ragnarok.storage.id</code>.
     */
    public StorageRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.storage.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ragnarok.storage.build_stage_fk</code>.
     */
    public StorageRecord setBuildStageFk(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.storage.build_stage_fk</code>.
     */
    public Long getBuildStageFk() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ragnarok.storage.label</code>.
     */
    public StorageRecord setLabel(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.storage.label</code>.
     */
    public String getLabel() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ragnarok.storage.storage_type_fk</code>.
     */
    public StorageRecord setStorageTypeFk(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.storage.storage_type_fk</code>.
     */
    public Byte getStorageTypeFk() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>ragnarok.storage.s3_bucket</code>.
     */
    public StorageRecord setS3Bucket(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.storage.s3_bucket</code>.
     */
    public String getS3Bucket() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ragnarok.storage.s3_folder_path</code>.
     */
    public StorageRecord setS3FolderPath(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.storage.s3_folder_path</code>.
     */
    public String getS3FolderPath() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ragnarok.storage.s3_file_name</code>.
     */
    public StorageRecord setS3FileName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.storage.s3_file_name</code>.
     */
    public String getS3FileName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ragnarok.storage.s3_file_matcher</code>.
     */
    public StorageRecord setS3FileMatcher(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.storage.s3_file_matcher</code>.
     */
    public String getS3FileMatcher() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Long, String, Byte, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Long, String, Byte, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Storage.STORAGE.ID;
    }

    @Override
    public Field<Long> field2() {
        return Storage.STORAGE.BUILD_STAGE_FK;
    }

    @Override
    public Field<String> field3() {
        return Storage.STORAGE.LABEL;
    }

    @Override
    public Field<Byte> field4() {
        return Storage.STORAGE.STORAGE_TYPE_FK;
    }

    @Override
    public Field<String> field5() {
        return Storage.STORAGE.S3_BUCKET;
    }

    @Override
    public Field<String> field6() {
        return Storage.STORAGE.S3_FOLDER_PATH;
    }

    @Override
    public Field<String> field7() {
        return Storage.STORAGE.S3_FILE_NAME;
    }

    @Override
    public Field<String> field8() {
        return Storage.STORAGE.S3_FILE_MATCHER;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getBuildStageFk();
    }

    @Override
    public String component3() {
        return getLabel();
    }

    @Override
    public Byte component4() {
        return getStorageTypeFk();
    }

    @Override
    public String component5() {
        return getS3Bucket();
    }

    @Override
    public String component6() {
        return getS3FolderPath();
    }

    @Override
    public String component7() {
        return getS3FileName();
    }

    @Override
    public String component8() {
        return getS3FileMatcher();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getBuildStageFk();
    }

    @Override
    public String value3() {
        return getLabel();
    }

    @Override
    public Byte value4() {
        return getStorageTypeFk();
    }

    @Override
    public String value5() {
        return getS3Bucket();
    }

    @Override
    public String value6() {
        return getS3FolderPath();
    }

    @Override
    public String value7() {
        return getS3FileName();
    }

    @Override
    public String value8() {
        return getS3FileMatcher();
    }

    @Override
    public StorageRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public StorageRecord value2(Long value) {
        setBuildStageFk(value);
        return this;
    }

    @Override
    public StorageRecord value3(String value) {
        setLabel(value);
        return this;
    }

    @Override
    public StorageRecord value4(Byte value) {
        setStorageTypeFk(value);
        return this;
    }

    @Override
    public StorageRecord value5(String value) {
        setS3Bucket(value);
        return this;
    }

    @Override
    public StorageRecord value6(String value) {
        setS3FolderPath(value);
        return this;
    }

    @Override
    public StorageRecord value7(String value) {
        setS3FileName(value);
        return this;
    }

    @Override
    public StorageRecord value8(String value) {
        setS3FileMatcher(value);
        return this;
    }

    @Override
    public StorageRecord values(Integer value1, Long value2, String value3, Byte value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StorageRecord
     */
    public StorageRecord() {
        super(Storage.STORAGE);
    }

    /**
     * Create a detached, initialised StorageRecord
     */
    public StorageRecord(Integer id, Long buildStageFk, String label, Byte storageTypeFk, String s3Bucket, String s3FolderPath, String s3FileName, String s3FileMatcher) {
        super(Storage.STORAGE);

        set(0, id);
        set(1, buildStageFk);
        set(2, label);
        set(3, storageTypeFk);
        set(4, s3Bucket);
        set(5, s3FolderPath);
        set(6, s3FileName);
        set(7, s3FileMatcher);
    }
}
