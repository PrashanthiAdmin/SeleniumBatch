package stepdefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.ActionsPageObjects;
import pageobjects.IFramePageObjects;

public class MouseActionsStepDefinitions extends Base{

	
	@Given("^I am in drag and drop page$")
	public void i_am_in_drag_and_drop_page() throws Throwable {
	    
		launchChromeBrowser();
		launchApplication("http://demo.guru99.com/test/drag_drop.html");
	}

	@Given("^I move to the element$")
	public void i_move_to_the_element() throws Throwable {
	    
		Actions builder = new Actions(driver);
		
		builder.moveToElement(driver.findElement(IFramePageObjects.linkAgileProject)).build().perform();
	}
	
	@Then("^I right click on the element$")
	public void i_right_click_on_the_element() throws Throwable {
		Actions builder = new Actions(driver);
		
		builder.contextClick(driver.findElement(IFramePageObjects.linkAgileProject)).build().perform();
		
	}
	
	@Then("^I do the drag and drop for debit side$")
	public void i_do_the_drag_and_drop_for_debit_side() throws Throwable {
	    
		Actions builder = new Actions(driver);
		
		WebElement source = driver.findElement(ActionsPageObjects.btn5000);
		
		WebElement target = driver.findElement(ActionsPageObjects.inputDebit);
		builder.dragAndDrop(source, target).build().perform();
	}



}
