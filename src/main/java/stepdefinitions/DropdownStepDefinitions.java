package stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.DropdownPage;

public class DropdownStepDefinitions extends Base{

	DropdownPage dropdown = new DropdownPage();
	
	
	@When("^I am on register screen$")
	public void i_am_on_register_screen() throws Throwable {
	   
		launchChromeBrowser();
		launchApplication("http://demo.guru99.com/test/newtours/register.php");
	}

	@Then("^I select a value from the country dropdown$")
	public void i_select_a_value_from_the_country_dropdown() throws Throwable {
	   
		
		
		Select obj = new Select(driver.findElement(DropdownPage.dropdownCountry));

		obj.selectByValue("ANTARCTICA");
		
		
	}
	
	
	@Then("^I should see all the values in country dropdown$")
	public void i_should_see_all_the_values_in_country_dropdown() throws Throwable {
	    
		
		Select obj = new Select(driver.findElement(DropdownPage.dropdownCountry));

		List<WebElement> dropdownElements = obj.getOptions();
		
		System.out.println(dropdownElements);
		
		
		int expected = 264;
		
		int actual = dropdownElements.size();
		
		
		if(expected == actual) {
			
			System.out.println("Values are shown as expected");
		}else {
			
			System.out.println("Actual is "+actual);
			
			System.out.println("Expected is "+expected);
			
			System.out.println("Values are not shown as expected");
		}
		
		
		for(WebElement e: dropdownElements) {
			
			System.out.println(e.getText());
		}
		
	}
	
	
	@Then("^I should see bermuda value in the country$")
	public void i_should_see_bermuda_value_in_the_country() throws Throwable {
	    
		
		Select obj = new Select(driver.findElement(DropdownPage.dropdownCountry));

		List<WebElement> dropdownElements = obj.getOptions();
		
		int size = dropdownElements.size();
		
		
		for(int i = 0; i<size; i++) {
			
			String value = dropdownElements.get(i).getText();
			
			if(value.equals("BERMUDA")) {
				System.out.println("Bermuda is available");
				
				break;
			}
			
			
		}
		
	}

}
