/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.gen.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Org implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer orgId;
    private String  orgName;

    public Org() {}

    public Org(Org value) {
        this.orgId = value.orgId;
        this.orgName = value.orgName;
    }

    public Org(
        Integer orgId,
        String  orgName
    ) {
        this.orgId = orgId;
        this.orgName = orgName;
    }

    /**
     * Getter for <code>reportcard.org.org_id</code>.
     */
    public Integer getOrgId() {
        return this.orgId;
    }

    /**
     * Setter for <code>reportcard.org.org_id</code>.
     */
    public Org setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
     * Getter for <code>reportcard.org.org_name</code>.
     */
    public String getOrgName() {
        return this.orgName;
    }

    /**
     * Setter for <code>reportcard.org.org_name</code>.
     */
    public Org setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Org (");

        sb.append(orgId);
        sb.append(", ").append(orgName);

        sb.append(")");
        return sb.toString();
    }
}
