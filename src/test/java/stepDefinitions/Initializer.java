package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import core.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer extends Base {

	// Cucumber provides Hooks and we have two Hooks
	// Before Hooks and After Hooks
	// Before Hooks uses @Before tag and will run block of code before each scenario
	// in Before Hooks we usually define block of codes to initialize browser
	// manage webdriver
	// log scenario name
	// After Hooks uses @After tag and will run block of code after each scenario
	// in After Hooks we usually define block of codes to get scenario status
	// and tear down or close browser.

	@Before
	public void beforeHooks(Scenario scenario) {

		// before each scenario we can print or log the name of scenario we will execute
		logger.info("Scenario " + scenario.getName() + " Started ");
		// we write a switch statement to create object of browsers (Chrome, IE,
		// Firefox)
		// we use WebdriverManager to replace System.setProperty(driver and executable
		// file)
		String browser = getBrowserName();
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(getPageLoadTimeOut(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getImpWait(), TimeUnit.SECONDS);

	}

	@After
	public void afterHooks(Scenario scenario) {
		// tear down will close browser and all tabs after each execution.
		tearDown();
		// get status of execution and log it 
		logger.info(scenario.getName() + "   " + scenario.getStatus());
		

	}

}
