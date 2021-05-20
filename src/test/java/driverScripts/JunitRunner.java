package driverScripts;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/sample.feature", glue = { "userStepDefintions/" }, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber/report.html" }, monochrome = true)
public class JunitRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows 10");
		Reporter.loadXMLConfig(new File("config/extent-config.xml"));
	}
}
