package stepdefinitions;

import base.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePageObjects;

public class HomeStepDefinitions extends Base {

	HomePageObjects homepage = new HomePageObjects();

	@When("^I am on login screen$")
	public void i_am_on_login_screen() throws Throwable {

		launchChromeBrowser();

	}

	@When("^I enter email id$")
	public void i_enter_email_id() throws Throwable {

		driver.findElement(homepage.inputEmailId).sendKeys("prashanthi@gmail.com");
	}

	@When("^I enter password$")
	public void i_enter_password() throws Throwable {
		driver.findElement(homepage.inputPassword).sendKeys("1234");

	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(homepage.btnSignin).click();
	}

	@Then("^I should be able to login to the application$")
	public void i_should_be_able_to_login_to_the_application() throws Throwable {
		String expected = "Successfully Logged in";

		String actual = driver.findElement(homepage.txtSignin).getText();

		if (expected.equals(actual)) {
			System.out.println("User is successfully logged in");
		} else {

			System.out.println("Actual value is " + actual);
			System.out.println("Expected value is " + expected);
			System.out.println("User is not able to logged in ");
		}

	}

	@When("^I enter wrong email id$")
	public void i_enter_wrong_email_id() throws Throwable {

	}

	@When("^I enter wrong password$")
	public void i_enter_wrong_password() throws Throwable {

	}

	@Then("^I should not be able to login to the application$")
	public void i_should_not_be_able_to_login_to_the_application() throws Throwable {

	}

}
