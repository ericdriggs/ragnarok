/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.db.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Repo implements Serializable {

    private static final long serialVersionUID = -474839944;

    private Integer repoId;
    private String  repoName;
    private Integer orgFk;

    public Repo() {}

    public Repo(Repo value) {
        this.repoId = value.repoId;
        this.repoName = value.repoName;
        this.orgFk = value.orgFk;
    }

    public Repo(
        Integer repoId,
        String  repoName,
        Integer orgFk
    ) {
        this.repoId = repoId;
        this.repoName = repoName;
        this.orgFk = orgFk;
    }

    public Integer getRepoId() {
        return this.repoId;
    }

    public Repo setRepoId(Integer repoId) {
        this.repoId = repoId;
        return this;
    }

    public String getRepoName() {
        return this.repoName;
    }

    public Repo setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    public Integer getOrgFk() {
        return this.orgFk;
    }

    public Repo setOrgFk(Integer orgFk) {
        this.orgFk = orgFk;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Repo (");

        sb.append(repoId);
        sb.append(", ").append(repoName);
        sb.append(", ").append(orgFk);

        sb.append(")");
        return sb.toString();
    }
}
