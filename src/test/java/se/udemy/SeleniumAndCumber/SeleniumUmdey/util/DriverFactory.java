package  se.udemy.SeleniumAndCumber.SeleniumUmdey.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import se.udemy.SeleniumAndCumber.SeleniumUmdey.testCases1;

public class DriverFactory {
	private static final Logger LOG = LoggerFactory.getLogger(DriverFactory.class); 
	WebDriver driver;
	// This method returns a webdriver

	public static WebDriver open(String browserType){

		if(browserType.equalsIgnoreCase("Firefox")){
			LOG.info("Starting FireFox WebDriver");
			System.setProperty("webdriver.gecko.driver", "C:/dev/udemy/SeleniumUmdey/src/webdrivers/geckodriver.exe");
			return  new FirefoxDriver();
		}else if(browserType.equalsIgnoreCase("Chrome")){
			LOG.info("Starting ChromeWebdriver");
			System.setProperty("webdriver.chrome.driver", "C:/dev/udemy/SeleniumUmdey/src/webdrivers/ver/chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--test-type");
			options.addArguments("--ignore-certificate-errors");
			capabilities.setCapability("chrome.binary", "<Path to binary>");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
			return new ChromeDriver(capabilities);
		}else if(browserType.equalsIgnoreCase("Edge")){
			LOG.info("Starting EdgeWebdriver");
			System.setProperty("webdriver.edge.driver", "C:/dev/udemy/SeleniumUmdey/src/webdrivers/MicrosoftWebDriver.exe");
			return new EdgeDriver();


		}
		
		return null;
	}
}
