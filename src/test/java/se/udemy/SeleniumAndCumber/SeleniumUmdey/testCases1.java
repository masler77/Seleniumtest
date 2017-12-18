package se.udemy.SeleniumAndCumber.SeleniumUmdey;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
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
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);

	}

	@After
	public void end(){
		LOG.info("Closing driver");
		driver.close();
	}

	@Test
	public void case1() throws Exception{
		driver.get("http://localhost:8080/");
		Thread.sleep(3000);
		assertEquals("Linkon", driver.getTitle());
		//Wrong Password
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("xxx", Keys.TAB);

		driver.findElement(By.id("inputPassword")).click();
		driver.findElement(By.id("inputPassword")).sendKeys("zzz", Keys.ENTER);
		WebElement WrongUser_pass = driver.findElement(By.className("mr-auto"));
		Assert.assertEquals(true, WrongUser_pass.isDisplayed());

		//right passwor
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("xxx", Keys.TAB);

		driver.findElement(By.id("inputPassword")).click();
		driver.findElement(By.id("inputPassword")).clear();
		driver.findElement(By.id("inputPassword")).sendKeys("xxx", Keys.ENTER);
		Thread.sleep(2000);
		// assert on right page.
		String currentUrl= driver.getCurrentUrl();
	 	assertEquals(currentUrl, "http://localhost:8080/search");
		LOG.info("String currentUrl= driver.getCurrentUrl()",currentUrl );	
		

	}

}
