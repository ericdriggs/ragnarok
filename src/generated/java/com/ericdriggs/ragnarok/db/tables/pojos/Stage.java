/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Stage implements Serializable {

    private static final long serialVersionUID = 498193646;

    private final Integer id;
    private final String  name;
    private final Integer appFk;

    public Stage(Stage value) {
        this.id = value.id;
        this.name = value.name;
        this.appFk = value.appFk;
    }

    public Stage(
        Integer id,
        String  name,
        Integer appFk
    ) {
        this.id = id;
        this.name = name;
        this.appFk = appFk;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAppFk() {
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
