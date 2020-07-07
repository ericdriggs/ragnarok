/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables.records;


import com.ericdriggs.ragnarok.db.tables.Repo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RepoRecord extends UpdatableRecordImpl<RepoRecord> implements Record3<UInteger, String, UInteger> {

    private static final long serialVersionUID = -753108786;

    /**
     * Setter for <code>ragnarok.repo.id</code>.
     */
    public RepoRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.repo.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>ragnarok.repo.name</code>.
     */
    public RepoRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.repo.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ragnarok.repo.org_fk</code>.
     */
    public RepoRecord setOrgFk(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ragnarok.repo.org_fk</code>.
     */
    public UInteger getOrgFk() {
        return (UInteger) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, String, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<UInteger, String, UInteger> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Repo.REPO.ID;
    }

    @Override
    public Field<String> field2() {
        return Repo.REPO.NAME;
    }

    @Override
    public Field<UInteger> field3() {
        return Repo.REPO.ORG_FK;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public UInteger component3() {
        return getOrgFk();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public UInteger value3() {
        return getOrgFk();
    }

    @Override
    public RepoRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public RepoRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public RepoRecord value3(UInteger value) {
        setOrgFk(value);
        return this;
    }

    @Override
    public RepoRecord values(UInteger value1, String value2, UInteger value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RepoRecord
     */
    public RepoRecord() {
        super(Repo.REPO);
    }

    /**
     * Create a detached, initialised RepoRecord
     */
    public RepoRecord(UInteger id, String name, UInteger orgFk) {
        super(Repo.REPO);

        set(0, id);
        set(1, name);
        set(2, orgFk);
    }
}
