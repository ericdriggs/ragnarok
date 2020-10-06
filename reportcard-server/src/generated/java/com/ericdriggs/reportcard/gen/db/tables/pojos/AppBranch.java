/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.gen.db.tables.pojos;


import java.io.Serializable;

import lombok.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppBranch implements Serializable {

    private static final long serialVersionUID = -594285350;

    private Integer appBranchId;
    private Integer appFk;
    private Integer branchFk;

    public AppBranch() {}

    public AppBranch(AppBranch value) {
        this.appBranchId = value.appBranchId;
        this.appFk = value.appFk;
        this.branchFk = value.branchFk;
    }

    public AppBranch(
        Integer appBranchId,
        Integer appFk,
        Integer branchFk
    ) {
        this.appBranchId = appBranchId;
        this.appFk = appFk;
        this.branchFk = branchFk;
    }

    public Integer getAppBranchId() {
        return this.appBranchId;
    }

    public AppBranch setAppBranchId(Integer appBranchId) {
        this.appBranchId = appBranchId;
        return this;
    }

    public Integer getAppFk() {
        return this.appFk;
    }

    public AppBranch setAppFk(Integer appFk) {
        this.appFk = appFk;
        return this;
    }

    public Integer getBranchFk() {
        return this.branchFk;
    }

    public AppBranch setBranchFk(Integer branchFk) {
        this.branchFk = branchFk;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AppBranch (");

        sb.append(appBranchId);
        sb.append(", ").append(appFk);
        sb.append(", ").append(branchFk);

        sb.append(")");
        return sb.toString();
    }
}
