package com.revature.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.revature.pages.LoginPage;
import com.revature.runners.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DoctorLoginStepImpl {

	public static LoginPage loginpage = Runner.loginpage;
	public static WebDriver driver = Runner.driver;
	
	@Given("^The Guest is on the login page$")
	public void the_Guest_is_on_the_login_page() throws Throwable {
		driver.get("C:/Users/Scott/git/DoctorFinder/DoctorFinderFontEnd/login.html");
	    Thread.sleep(1000);
	}

	@When("^The User types in \"([^\"]*)\" and The User types in \"([^\"]*)\"$")
	public void the_User_types_in_and_The_User_types_in(String arg1, String arg2) throws Throwable {
		loginpage.email.sendKeys(arg1);
		loginpage.password.sendKeys(arg2);
		loginpage.doctorLogin.click();
		Thread.sleep(1000);
	}

	@Then("^The new title of the page should be \"([^\"]*)\"$")
	public void the_new_title_of_the_page_should_be(String arg1) throws Throwable {
		Assert.assertEquals(arg1, driver.getTitle());
	}
	
}
