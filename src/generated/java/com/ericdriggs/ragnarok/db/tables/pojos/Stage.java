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
public class Stage implements Serializable {

    private static final long serialVersionUID = -573939593;

    private final UInteger id;
    private final String   name;
    private final UInteger appFk;

    public Stage(Stage value) {
        this.id = value.id;
        this.name = value.name;
        this.appFk = value.appFk;
    }

    public Stage(
        UInteger id,
        String   name,
        UInteger appFk
    ) {
        this.id = id;
        this.name = name;
        this.appFk = appFk;
    }

    public UInteger getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public UInteger getAppFk() {
        return this.appFk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stage (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(appFk);

        sb.append(")");
        return sb.toString();
    }
}
