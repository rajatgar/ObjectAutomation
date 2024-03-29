
//package com.bpo.qa.ExtentReportsListeners;
//
//import java.io.File;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//
//import org.testng.IReporter;
//import org.testng.IResultMap;
//import org.testng.ISuite;
//import org.testng.ISuiteResult;
//import org.testng.ITestContext;
//import org.testng.ITestResult;
//import org.testng.xml.XmlSuite;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.model.Test;
//
//public class ExtentReportListeners implements IReporter {
//	private static final String LogStatus = null;
//	private ExtentReports extent;
//
//	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
//			String outputDirectory) {
//		extent = new ExtentReports();
//
//		for (ISuite suite : suites) {
//			Map<String, ISuiteResult> result = suite.getResults();
//
//			for (ISuiteResult r : result.values()) {
//				ITestContext context = r.getTestContext();
//
//				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
//				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
//				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
//			}
//		}
//
//		extent.flush();
//		extent.close();
//	}
//
//	private void buildTestNodes(IResultMap tests, LogStatus status) {
//		Test test;
//
//		if (tests.size() > 0) {
//			for (ITestResult result : tests.getAllResults()) {
//				test = ((Object) extent).startTest(result.getMethod().getMethodName());
//
//				((Object) test).setStartedTime(getTime(result.getStartMillis()));
//				((Object) test).setEndedTime(getTime(result.getEndMillis()));
//
//				for (String group : result.getMethod().getGroups())
//					test.assignCategory(group);
//
//				if (result.getThrowable() != null) {
//					test.log(status, result.getThrowable());
//				} else {
//					test.log(status, "Test " + status.toString().toLowerCase()
//							+ "ed");
//				}
//
//				extent.endTest(test);
//			}
//		}
//	}
//
//	private Date getTime(long millis) {
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTimeInMillis(millis);
//		return calendar.getTime();
//	}
//}