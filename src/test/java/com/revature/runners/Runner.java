package com.revature.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.LoginPage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.junit.Assertions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.revature.steps")
// features is the location of feature file, glue is the location of your step implementations
public class Runner {

	public static WebDriver driver;
	public static LoginPage loginpage;
	
	@BeforeClass
	public static void setUp() {
		File file = new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		loginpage = new LoginPage(driver);
		
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
