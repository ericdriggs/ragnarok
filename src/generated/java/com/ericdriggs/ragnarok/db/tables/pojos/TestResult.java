/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.ragnarok.db.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestResult implements Serializable {

    private static final long serialVersionUID = 1148768004;

    private final ULong    id;
    private final ULong    buildStageFk;
    private final UInteger tests;
    private final UInteger skipped;
    private final UInteger error;
    private final UInteger failure;
    private final Long     time;
    private final Byte     isSuccess;
    private final Byte     hasSkip;

    public TestResult(TestResult value) {
        this.id = value.id;
        this.buildStageFk = value.buildStageFk;
        this.tests = value.tests;
        this.skipped = value.skipped;
        this.error = value.error;
        this.failure = value.failure;
        this.time = value.time;
        this.isSuccess = value.isSuccess;
        this.hasSkip = value.hasSkip;
    }

    public TestResult(
        ULong    id,
        ULong    buildStageFk,
        UInteger tests,
        UInteger skipped,
        UInteger error,
        UInteger failure,
        Long     time,
        Byte     isSuccess,
        Byte     hasSkip
    ) {
        this.id = id;
        this.buildStageFk = buildStageFk;
        this.tests = tests;
        this.skipped = skipped;
        this.error = error;
        this.failure = failure;
        this.time = time;
        this.isSuccess = isSuccess;
        this.hasSkip = hasSkip;
    }

    public ULong getId() {
        return this.id;
    }

    public ULong getBuildStageFk() {
        return this.buildStageFk;
    }

    public UInteger getTests() {
        return this.tests;
    }

    public UInteger getSkipped() {
        return this.skipped;
    }

    public UInteger getError() {
        return this.error;
    }

    public UInteger getFailure() {
        return this.failure;
    }

    public Long getTime() {
        return this.time;
    }

    public Byte getIsSuccess() {
        return this.isSuccess;
    }

    public Byte getHasSkip() {
        return this.hasSkip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TestResult (");

        sb.append(id);
        sb.append(", ").append(buildStageFk);
        sb.append(", ").append(tests);
        sb.append(", ").append(skipped);
        sb.append(", ").append(error);
        sb.append(", ").append(failure);
        sb.append(", ").append(time);
        sb.append(", ").append(isSuccess);
        sb.append(", ").append(hasSkip);

        sb.append(")");
        return sb.toString();
    }
}