package com.revature.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.revature.pages.LoginPage;
import com.revature.runners.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientLoginStepImpl {

	public static LoginPage loginpage = Runner.loginpage;
	public static WebDriver driver = Runner.driver;
	
	@Given("^The Guest is on the login Page$")
	public void the_Guest_is_on_the_login_Page() throws Throwable {
		driver.get("C:/Users/Scott/git/DoctorFinder/DoctorFinderFontEnd/login.html");
	    Thread.sleep(1000);
	}
	
	@When("^The user types \"([^\"]*)\" and \"([^\"]*)\" and clicks login button$")
	public void the_user_types_and_and_clicks_login_button(String arg1, String arg2) throws Throwable {
		loginpage.email.sendKeys(arg1);
		loginpage.password.sendKeys(arg2);
		loginpage.patientLogin.click();
		Thread.sleep(1000);
	}

	@Then("^The title of the page should be \"([^\"]*)\"$")
	public void the_title_of_the_page_should_be(String arg1) throws Throwable {
		Assert.assertEquals(arg1, driver.getTitle());
	}
	
}
