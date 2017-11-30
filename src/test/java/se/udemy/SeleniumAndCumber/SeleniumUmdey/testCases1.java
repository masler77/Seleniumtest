package se.udemy.SeleniumAndCumber.SeleniumUmdey;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.udemy.SeleniumAndCumber.SeleniumUmdey.util.DriverFactory;
public class testCases1 {
WebDriver driver;

//  WebElement searchBoxElement = driver.findElement(By.id("q"));
WebElement searchBoxElement;

String browserType = "Firefox";
private static final Logger LOG = LoggerFactory.getLogger(testCases1.class); 

	@Before
	public void start(){
	driver = DriverFactory.open("chrome");

	}

	@After
	public void end(){
		LOG.info("Closing driver");
		driver.close();
	}

	@Test
	public void case1() throws Exception{
	driver.get("http://www.google.com");
//	driver.findElement(By.id("q")).sendKeys("Magnus Leray adress");
	driver.findElement(By.id("lst-ib")).click();
	driver.findElement(By.id("lst-ib")).sendKeys("Magnus leray", Keys.ENTER);
	Thread.sleep(3000);
		LOG.info(driver.getCurrentUrl());	
	
	
	}
	
}
