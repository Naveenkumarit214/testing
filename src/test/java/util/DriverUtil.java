package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverUtil {

	public static WebDriver driver=null;
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--window-size=1920,1200");
		//options.setAcceptInsecureCerts(true);
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("www.google.com");
	}
	
}
