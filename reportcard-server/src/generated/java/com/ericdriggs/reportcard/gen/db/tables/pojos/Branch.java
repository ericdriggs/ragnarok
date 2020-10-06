/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.gen.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Branch implements Serializable {

    private static final long serialVersionUID = 1337225885;

    private Integer branchId;
    private String  branchName;
    private Integer repoFk;

    public Branch() {}

    public Branch(Branch value) {
        this.branchId = value.branchId;
        this.branchName = value.branchName;
        this.repoFk = value.repoFk;
    }

    public Branch(
        Integer branchId,
        String  branchName,
        Integer repoFk
    ) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.repoFk = repoFk;
    }

    public Integer getBranchId() {
        return this.branchId;
    }

    public Branch setBranchId(Integer branchId) {
        this.branchId = branchId;
        return this;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public Branch setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    public Integer getRepoFk() {
        return this.repoFk;
    }

    public Branch setRepoFk(Integer repoFk) {
        this.repoFk = repoFk;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Branch (");

        sb.append(branchId);
        sb.append(", ").append(branchName);
        sb.append(", ").append(repoFk);

        sb.append(")");
        return sb.toString();
    }
}