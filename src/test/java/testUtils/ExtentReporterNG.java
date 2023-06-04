package testUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	
static ExtentReports extent;
public static ExtentReports generateReport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("//Users//jvachhani//eclipse-workspace//TFH_Android//reports//index.html");
		reporter.config().setReportName("Together For Her App Automation Report");
		reporter.config().setDocumentTitle("TFH Android Report");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Created By", "Jay Vachhani");
		
		return extent;
	}
}
