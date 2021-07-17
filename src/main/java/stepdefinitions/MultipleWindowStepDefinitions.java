package stepdefinitions;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.AfterSuite;

import com.relevantcodes.extentreports.LogStatus;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.MultipleWindowPageObjects;

public class MultipleWindowStepDefinitions extends Base{

	
	
	
	@Given("^I am in windows page$")
	public void i_am_in_windows_page() throws Throwable {
	    launchChromeBrowser();
	    
	    
	    try {
	    launchApplication("http://demo.guru99.com/popup.php");
	    
	    test.log(LogStatus.PASS, "launched application");
	    }catch(Exception e) {
		    test.log(LogStatus.FAIL, "unable to launch application");

	    }
	}

	@Given("^I click on click here button$")
	public void i_click_on_click_here_button() throws Throwable {
	   
		try {
		driver.findElement(MultipleWindowPageObjects.btnClickHere).click();
	    test.log(LogStatus.PASS, "click here button is clicked");

		}catch(Exception e) {
		    test.log(LogStatus.FAIL, "unable to click the click here button");

		}
	}

	@Then("^I should switch to child window$")
	public void i_should_switch_to_child_window() throws Throwable {
	    
		
		String mainWindow = driver.getWindowHandle();
		
		
		
		System.out.println("Main window is "+mainWindow);
		
		String mainWindowTitle = driver.getTitle();
		
		System.out.println("Title of main window "+mainWindowTitle);
		
		Set<String> subHandlers = driver.getWindowHandles();
		
		Iterator<String> itr = subHandlers.iterator();
		
		while(itr.hasNext()) {
			
			String childWindow = itr.next();
			
			
			
			System.out.println("Child window is "+childWindow);
			
			if(!(mainWindow.equals(childWindow))) {
				
				
				driver.switchTo().window(childWindow);
				
				String childWindowTitle = driver.getTitle();
				
				
				System.out.println("Title of child window "+childWindowTitle);
				
				try {
				driver.findElement(MultipleWindowPageObjects.inputEmailid).sendKeys("shanthi@gmail.com");
				test.log(LogStatus.PASS, "Switched to the window and entered email id");

				}catch(Exception e) {
				    test.log(LogStatus.FAIL, "unable to switch to the window");

				
			}
		}
		
		closeReport();
		}}
	
	
}



