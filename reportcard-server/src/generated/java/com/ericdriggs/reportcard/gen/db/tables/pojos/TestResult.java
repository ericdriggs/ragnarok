/*
 * This file is generated by jOOQ.
 */
package com.ericdriggs.reportcard.gen.db.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestResult implements Serializable {

    private static final long serialVersionUID = -963229717;

    private Long          testResultId;
    private Long          buildStageFk;
    private Integer       tests;
    private Integer       skipped;
    private Integer       error;
    private Integer       failure;
    private BigDecimal    time;
    private LocalDateTime testResultCreated;
    private Boolean       isSuccess;
    private Boolean       hasSkip;

    public TestResult() {}

    public TestResult(TestResult value) {
        this.testResultId = value.testResultId;
        this.buildStageFk = value.buildStageFk;
        this.tests = value.tests;
        this.skipped = value.skipped;
        this.error = value.error;
        this.failure = value.failure;
        this.time = value.time;
        this.testResultCreated = value.testResultCreated;
        this.isSuccess = value.isSuccess;
        this.hasSkip = value.hasSkip;
    }

    public TestResult(
        Long          testResultId,
        Long          buildStageFk,
        Integer       tests,
        Integer       skipped,
        Integer       error,
        Integer       failure,
        BigDecimal    time,
        LocalDateTime testResultCreated,
        Boolean       isSuccess,
        Boolean       hasSkip
    ) {
        this.testResultId = testResultId;
        this.buildStageFk = buildStageFk;
        this.tests = tests;
        this.skipped = skipped;
        this.error = error;
        this.failure = failure;
        this.time = time;
        this.testResultCreated = testResultCreated;
        this.isSuccess = isSuccess;
        this.hasSkip = hasSkip;
    }

    public Long getTestResultId() {
        return this.testResultId;
    }

    public TestResult setTestResultId(Long testResultId) {
        this.testResultId = testResultId;
        return this;
    }

    public Long getBuildStageFk() {
        return this.buildStageFk;
    }

    public TestResult setBuildStageFk(Long buildStageFk) {
        this.buildStageFk = buildStageFk;
        return this;
    }

    public Integer getTests() {
        return this.tests;
    }

    public TestResult setTests(Integer tests) {
        this.tests = tests;
        return this;
    }

    public Integer getSkipped() {
        return this.skipped;
    }

    public TestResult setSkipped(Integer skipped) {
        this.skipped = skipped;
        return this;
    }

    public Integer getError() {
        return this.error;
    }

    public TestResult setError(Integer error) {
        this.error = error;
        return this;
    }

    public Integer getFailure() {
        return this.failure;
    }

    public TestResult setFailure(Integer failure) {
        this.failure = failure;
        return this;
    }

    public BigDecimal getTime() {
        return this.time;
    }

    public TestResult setTime(BigDecimal time) {
        this.time = time;
        return this;
    }

    public LocalDateTime getTestResultCreated() {
        return this.testResultCreated;
    }

    public TestResult setTestResultCreated(LocalDateTime testResultCreated) {
        this.testResultCreated = testResultCreated;
        return this;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public TestResult setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    public Boolean getHasSkip() {
        return this.hasSkip;
    }

    public TestResult setHasSkip(Boolean hasSkip) {
        this.hasSkip = hasSkip;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TestResult (");

        sb.append(testResultId);
        sb.append(", ").append(buildStageFk);
        sb.append(", ").append(tests);
        sb.append(", ").append(skipped);
        sb.append(", ").append(error);
        sb.append(", ").append(failure);
        sb.append(", ").append(time);
        sb.append(", ").append(testResultCreated);
        sb.append(", ").append(isSuccess);
        sb.append(", ").append(hasSkip);

        sb.append(")");
        return sb.toString();
    }
}
