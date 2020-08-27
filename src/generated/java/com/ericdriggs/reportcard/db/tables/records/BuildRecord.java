/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.db.tables.records;


import com.ericdriggs.reportcard.db.tables.Build;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BuildRecord extends UpdatableRecordImpl<BuildRecord> implements Record6<Long, Integer, Integer, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1378414841;

    /**
     * Setter for <code>reportcard.build.build_id</code>.
     */
    public BuildRecord setBuildId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>reportcard.build.build_id</code>.
     */
    public Long getBuildId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>reportcard.build.app_branch_fk</code>.
     */
    public BuildRecord setAppBranchFk(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>reportcard.build.app_branch_fk</code>.
     */
    public Integer getAppBranchFk() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>reportcard.build.app_branch_build_ordinal</code>.
     */
    public BuildRecord setAppBranchBuildOrdinal(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>reportcard.build.app_branch_build_ordinal</code>.
     */
    public Integer getAppBranchBuildOrdinal() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>reportcard.build.build_created</code>.
     */
    public BuildRecord setBuildCreated(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>reportcard.build.build_created</code>.
     */
    public LocalDateTime getBuildCreated() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>reportcard.build.build_external_identifier</code>.
     */
    public BuildRecord setBuildExternalIdentifier(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>reportcard.build.build_external_identifier</code>.
     */
    public String getBuildExternalIdentifier() {
        return (String) get(4);
    }

    /**
     * Setter for <code>reportcard.build.build_sha</code>.
     */
    public BuildRecord setBuildSha(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>reportcard.build.build_sha</code>.
     */
    public String getBuildSha() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Integer, Integer, LocalDateTime, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, Integer, Integer, LocalDateTime, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Build.BUILD.BUILD_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Build.BUILD.APP_BRANCH_FK;
    }

    @Override
    public Field<Integer> field3() {
        return Build.BUILD.APP_BRANCH_BUILD_ORDINAL;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Build.BUILD.BUILD_CREATED;
    }

    @Override
    public Field<String> field5() {
        return Build.BUILD.BUILD_EXTERNAL_IDENTIFIER;
    }

    @Override
    public Field<String> field6() {
        return Build.BUILD.BUILD_SHA;
    }

    @Override
    public Long component1() {
        return getBuildId();
    }

    @Override
    public Integer component2() {
        return getAppBranchFk();
    }

    @Override
    public Integer component3() {
        return getAppBranchBuildOrdinal();
    }

    @Override
    public LocalDateTime component4() {
        return getBuildCreated();
    }

    @Override
    public String component5() {
        return getBuildExternalIdentifier();
    }

    @Override
    public String component6() {
        return getBuildSha();
    }

    @Override
    public Long value1() {
        return getBuildId();
    }

    @Override
    public Integer value2() {
        return getAppBranchFk();
    }

    @Override
    public Integer value3() {
        return getAppBranchBuildOrdinal();
    }

    @Override
    public LocalDateTime value4() {
        return getBuildCreated();
    }

    @Override
    public String value5() {
        return getBuildExternalIdentifier();
    }

    @Override
    public String value6() {
        return getBuildSha();
    }

    @Override
    public BuildRecord value1(Long value) {
        setBuildId(value);
        return this;
    }

    @Override
    public BuildRecord value2(Integer value) {
        setAppBranchFk(value);
        return this;
    }

    @Override
    public BuildRecord value3(Integer value) {
        setAppBranchBuildOrdinal(value);
        return this;
    }

    @Override
    public BuildRecord value4(LocalDateTime value) {
        setBuildCreated(value);
        return this;
    }

    @Override
    public BuildRecord value5(String value) {
        setBuildExternalIdentifier(value);
        return this;
    }

    @Override
    public BuildRecord value6(String value) {
        setBuildSha(value);
        return this;
    }

    @Override
    public BuildRecord values(Long value1, Integer value2, Integer value3, LocalDateTime value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BuildRecord
     */
    public BuildRecord() {
        super(Build.BUILD);
    }

    /**
     * Create a detached, initialised BuildRecord
     */
    public BuildRecord(Long buildId, Integer appBranchFk, Integer appBranchBuildOrdinal, LocalDateTime buildCreated, String buildExternalIdentifier, String buildSha) {
        super(Build.BUILD);

        set(0, buildId);
        set(1, appBranchFk);
        set(2, appBranchBuildOrdinal);
        set(3, buildCreated);
        set(4, buildExternalIdentifier);
        set(5, buildSha);
    }
}
