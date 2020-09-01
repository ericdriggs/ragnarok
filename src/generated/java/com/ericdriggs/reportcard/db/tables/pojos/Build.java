/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Build implements Serializable {

    private static final long serialVersionUID = -707528028;

    private Long          buildId;
    private Integer       appBranchFk;
    private String        buildUniqueString;
    private LocalDateTime buildCreated;

    public Build() {}

    public Build(Build value) {
        this.buildId = value.buildId;
        this.appBranchFk = value.appBranchFk;
        this.buildUniqueString = value.buildUniqueString;
        this.buildCreated = value.buildCreated;
    }

    public Build(
        Long          buildId,
        Integer       appBranchFk,
        String        buildUniqueString,
        LocalDateTime buildCreated
    ) {
        this.buildId = buildId;
        this.appBranchFk = appBranchFk;
        this.buildUniqueString = buildUniqueString;
        this.buildCreated = buildCreated;
    }

    public Long getBuildId() {
        return this.buildId;
    }

    public Build setBuildId(Long buildId) {
        this.buildId = buildId;
        return this;
    }

    public Integer getAppBranchFk() {
        return this.appBranchFk;
    }

    public Build setAppBranchFk(Integer appBranchFk) {
        this.appBranchFk = appBranchFk;
        return this;
    }

    public String getBuildUniqueString() {
        return this.buildUniqueString;
    }

    public Build setBuildUniqueString(String buildUniqueString) {
        this.buildUniqueString = buildUniqueString;
        return this;
    }

    public LocalDateTime getBuildCreated() {
        return this.buildCreated;
    }

    public Build setBuildCreated(LocalDateTime buildCreated) {
        this.buildCreated = buildCreated;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Build (");

        sb.append(buildId);
        sb.append(", ").append(appBranchFk);
        sb.append(", ").append(buildUniqueString);
        sb.append(", ").append(buildCreated);

        sb.append(")");
        return sb.toString();
    }
}
