package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import junit.framework.Assert;
import util.DriverUtil;

public class samplePage {

	 By search = By.name("q");
	 By DuckWikipedia = By.xpath("//h3[.='Duck - Wikipedia']");
	 //By searchButton = By.name("q");
	
	public void enterValueInsearchbox() {
		DriverUtil.driver.findElement(search).sendKeys("Duck");
	}
	public void ClickOnSearch() {
		DriverUtil.driver.findElement(search).sendKeys(Keys.ENTER);
	}
	public void VerifyLinks() {
		Assert.assertTrue(DriverUtil.driver.findElement(DuckWikipedia).isDisplayed());
	}
}
