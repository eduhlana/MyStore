package util;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {

	WebDriver driver ;
	public Report(WebDriver driver) {
		this.driver = driver;
	}
	
	public void generateReport(String scenario, String step) {

		String extentReportFile = System.getProperty("user.dir")+ "\\extentReportFile.html";
		String extentReportImage = System.getProperty("user.dir")+ "\\extentReportImage.png";

		ExtentReports extent = new ExtentReports(extentReportFile, false);

		ExtentTest extentTest = extent.startTest(scenario, step);
	

		extentTest.log(	LogStatus.INFO,	step + " : "	+ extentTest.addScreenCapture(extentReportImage));

		extent.flush();
	}
}