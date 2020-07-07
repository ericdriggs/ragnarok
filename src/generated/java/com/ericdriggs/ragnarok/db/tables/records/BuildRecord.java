/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables.records;


import com.ericdriggs.ragnarok.db.tables.Build;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BuildRecord extends UpdatableRecordImpl<BuildRecord> implements Record4<ULong, UInteger, LocalDateTime, UInteger> {

    private static final long serialVersionUID = 232600447;

    /**
     * Setter for <code>ragnarok.build.id</code>.
     */
    public BuildRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.build.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>ragnarok.build.app_fk</code>.
     */
    public BuildRecord setAppFk(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.build.app_fk</code>.
     */
    public UInteger getAppFk() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>ragnarok.build.created</code>.
     */
    public BuildRecord setCreated(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.build.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>ragnarok.build.app_build_ordinal</code>.
     */
    public BuildRecord setAppBuildOrdinal(UInteger value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.build.app_build_ordinal</code>.
     */
    public UInteger getAppBuildOrdinal() {
        return (UInteger) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<ULong, UInteger, LocalDateTime, UInteger> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<ULong, UInteger, LocalDateTime, UInteger> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return Build.BUILD.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return Build.BUILD.APP_FK;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Build.BUILD.CREATED;
    }

    @Override
    public Field<UInteger> field4() {
        return Build.BUILD.APP_BUILD_ORDINAL;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public UInteger component2() {
        return getAppFk();
    }

    @Override
    public LocalDateTime component3() {
        return getCreated();
    }

    @Override
    public UInteger component4() {
        return getAppBuildOrdinal();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public UInteger value2() {
        return getAppFk();
    }

    @Override
    public LocalDateTime value3() {
        return getCreated();
    }

    @Override
    public UInteger value4() {
        return getAppBuildOrdinal();
    }

    @Override
    public BuildRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public BuildRecord value2(UInteger value) {
        setAppFk(value);
        return this;
    }

    @Override
    public BuildRecord value3(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public BuildRecord value4(UInteger value) {
        setAppBuildOrdinal(value);
        return this;
    }

    @Override
    public BuildRecord values(ULong value1, UInteger value2, LocalDateTime value3, UInteger value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
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
    public BuildRecord(ULong id, UInteger appFk, LocalDateTime created, UInteger appBuildOrdinal) {
        super(Build.BUILD);

        set(0, id);
        set(1, appFk);
        set(2, created);
        set(3, appBuildOrdinal);
    }
}