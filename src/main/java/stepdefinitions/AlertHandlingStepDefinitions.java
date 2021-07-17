package stepdefinitions;

import org.openqa.selenium.Alert;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.AlertHandlingPage;

public class AlertHandlingStepDefinitions extends Base{

	
	
	@When("^I am on alerts screen$")
	public void i_am_on_alerts_screen() throws Throwable {
	   
		launchChromeBrowser();
		launchApplication("https://demoqa.com/alerts");
		
	}

	@When("^I click on first click me button$")
	public void i_click_on_first_click_me_button() throws Throwable {
	   try {
		driver.findElement(AlertHandlingPage.btnFirstClickMe).click();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	}

	@Then("^I should be able to accept the alert$")
	public void i_should_be_able_to_accept_the_alert() throws Throwable {
	   
		try {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Given("^I click on third click me button$")
	public void i_click_on_third_click_me_button() throws Throwable {
	    
		 try {
				driver.findElement(AlertHandlingPage.btnThirdClickMe).click();
			   }catch(Exception e) {
				   e.printStackTrace();
			   }
	}

	@Then("^I should be able to dismiss the alert$")
	public void i_should_be_able_to_dismiss_the_alert() throws Throwable {
	    
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			}catch(Exception e) {
				e.printStackTrace();
			}
	}


	@Given("^I click on fourth click me button$")
	public void i_click_on_fourth_click_me_button() throws Throwable {
		 try {
				driver.findElement(AlertHandlingPage.btnFourthClickMe).click();
			   }catch(Exception e) {
				   e.printStackTrace();
			   }
	}

	@Then("^I should be able to send the text into the alert \"([^\"]*)\"$")
	public void i_should_be_able_to_send_the_text_into_the_alert(String arg1) throws Throwable {
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(arg1);
			alert.accept();
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		
	}
	
}
