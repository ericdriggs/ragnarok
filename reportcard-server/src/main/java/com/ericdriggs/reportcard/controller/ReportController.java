package com.ericdriggs.reportcard.controller;

import com.ericdriggs.reportcard.model.ReportMetaData;
import com.ericdriggs.reportcard.model.TestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/reports")
@SuppressWarnings("unused")
public class ReportController {

    @Autowired
    public ReportController(ReportControllerUtil reportControllerUtil) {
        this.reportControllerUtil = reportControllerUtil;
    }

    private final ReportControllerUtil reportControllerUtil;

    @PostMapping("")
    public ResponseEntity<TestResult> postXml(@RequestPart("reportMetaData") ReportMetaData reportMetaData, @RequestParam("files") MultipartFile[] files) {
        TestResult inserted = reportControllerUtil.doPostXml(reportMetaData, files);
        return new ResponseEntity<>(inserted, HttpStatus.OK);
    }

    @PostMapping("junit")
    public ResponseEntity<TestResult> postXmlJunit(ReportMetaData reportMetaData, @RequestParam("file") MultipartFile file) {
        TestResult inserted = reportControllerUtil.doPostXmlJunit(reportMetaData, file);
        return new ResponseEntity<>(inserted, HttpStatus.OK);
    }

    @PostMapping("surefire")
    public ResponseEntity<TestResult> postXmlSurefire(ReportMetaData reportMetaData, @RequestParam("files") MultipartFile[] files) {
        TestResult inserted = reportControllerUtil.doPostXmlSurefire(reportMetaData, files);
        return new ResponseEntity<>(inserted, HttpStatus.OK);
    }

    @GetMapping(path = "{testResultId}", produces = "application/json")
    public ResponseEntity<TestResult> getTestResult(@PathVariable String testResultId) {
        return new ResponseEntity<>(reportControllerUtil.getTestResult(Long.valueOf(testResultId)), HttpStatus.OK);
    }

}