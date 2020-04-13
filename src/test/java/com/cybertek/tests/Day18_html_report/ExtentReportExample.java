package com.cybertek.tests.Day18_html_report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentHtmlReporterConfiguration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentReportExample {

    // Used to set up and build the report and build the reports
    ExtentReports report;

    // Used to create the html report
    ExtentHtmlReporter htmlReporter;

    // Used to define a test in report, do logging, mark test results
    ExtentTest test;

    @BeforeMethod
    public void setUp() {
        // Initialize the report
        report = new ExtentReports();

        // I need to point to the location where report will be create
        //System.getProperty("user.dir") --> gets my current forlder
        //+ "test-output/report.html" --> create folder test-output and in it create file report.html
        String path = System.getProperty("user.dir") + "/test-output/report.html";
        //initialize the html reporter with the given path
        htmlReporter = new ExtentHtmlReporter(path);

        //set name for the report
        htmlReporter.config().setReportName("Vytrack Automated Tests");

        //attach the html reporter to the report object
        report.attachReporter(htmlReporter);

        //Set environment information
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("Browser", "Chrome");
    }

    @Test
    public void test() {
        // We have to create a test for every test case
        test = report.createTest("VYT-123 Title verification test");
        test.info("Opening browser");
        // driver = new Chromedriver
        test.info("going to website");
        //driver.get(google.com
        test.info("verifying title");
        // assertEquals(google,google)
        test.pass("VYT-123 Title verification test");
    }

    @AfterMethod
    public void tearDown() {
        // The report will be created when we call this line.
        //if we don't call flush method it will not be generated.
        //we do this at the end of everything
        report.flush();
    }

}