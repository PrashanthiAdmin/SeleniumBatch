package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.relevantcodes.extentreports.LogStatus;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.WebtablePage;

public class WebTableHandlingStepdefinitions extends Base {

	@Given("^I am in ipo center filings page \"([^\"]*)\"$")
	public void i_am_in_ipo_center_filings_page(String arg1) throws Throwable {

		launchChromeBrowser();
		launchApplication(arg1);
	}

	@Then("^I should be able to find fifth row second cell$")
	public void i_should_be_able_to_find_fifth_row_second_cell() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,900)");
		
		
		String actual = "";
		try {
			Thread.sleep(2000);
			actual = driver.findElement(WebtablePage.cellSecond).getText();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String expected = "Xometry, Inc.";

		if (actual.equals(expected)) {

			test.log(LogStatus.PASS, "Fifth row cell value is matching");
		} else {
			test.log(LogStatus.INFO, "Actual value is"+actual);
			test.log(LogStatus.INFO, "Expected value is"+expected);

			test.log(LogStatus.FAIL, "Fifth row cell value is not matching");

		}

		//closeReport();
		//driver.close();
	}
	
	@Then("^I should be able to read all the cells$")
	public void i_should_be_able_to_read_all_the_cells() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,900)");
		
		Thread.sleep(3000);	

		WebElement table = driver
				.findElement(WebtablePage.thirdTable);

		
	
		
		
		List<String> expectedHeaders = new ArrayList<String>();
		
		expectedHeaders.add("FILE DATE");
		expectedHeaders.add("ISSUER");
		expectedHeaders.add("TICKER");
		expectedHeaders.add("INDUSTRY");
		expectedHeaders.add("BOOKRUNNER(S)");
		expectedHeaders.add("EXCHANGE");
		expectedHeaders.add("CURR. AMT. FILED ($MM)");
		expectedHeaders.add("CURR. SHRS. FILED ($MM)");
		expectedHeaders.add("CURR. FILE PRICE/RANGE($)");
		
	List<WebElement> headers = table.findElements(By.tagName("th"));
		
		int headersSize = headers.size();
				

		List<String> actualHeaders = new ArrayList<String>();
		
		
		for(int i = 0; i<headersSize; i++) {
			
			String headertext = headers.get(i).getText();
					
			
			
			actualHeaders.add(i,headertext);
			
		}
		
		
		boolean comparison = expectedHeaders.containsAll(actualHeaders);
		
		System.out.println(comparison);
		System.out.println("actual "+actualHeaders);
		System.out.println("expected "+expectedHeaders);
			
		
	


		

		

		closeReport();
		//driver.close();
	}

}
