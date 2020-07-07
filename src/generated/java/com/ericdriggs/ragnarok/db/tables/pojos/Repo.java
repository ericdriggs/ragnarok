/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Repo implements Serializable {

    private static final long serialVersionUID = -1824983428;

    private final UInteger id;
    private final String   name;
    private final UInteger orgFk;

    public Repo(Repo value) {
        this.id = value.id;
        this.name = value.name;
        this.orgFk = value.orgFk;
    }

    public Repo(
        UInteger id,
        String   name,
        UInteger orgFk
    ) {
        this.id = id;
        this.name = name;
        this.orgFk = orgFk;
    }

    public UInteger getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public UInteger getOrgFk() {
        return this.orgFk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Repo (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(orgFk);

        sb.append(")");
        return sb.toString();
    }
}
