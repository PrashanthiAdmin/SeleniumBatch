package stepdefinitions;

import base.Base;
import cucumber.api.java.en.Given;
import pageobjects.IFramePageObjects;

public class IFrameHandlingStepDefinitions extends Base{

	
	@Given("^I am in iframe page$")
	public void i_am_in_iframe_page() throws Throwable {

		
		launchChromeBrowser();
		launchApplication("http://demo.guru99.com/test/guru99home/");
	}

	@Given("^I click on playbutton$")
	public void i_click_on_playbutton() throws Throwable {
	   
		try {
		driver.switchTo().frame(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		driver.findElement(IFramePageObjects.btnPlay).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(IFramePageObjects.linkAgileProject).click();
		
	}

}
