package JuneBatchSeleniumTraining.SeleniumJuneSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.HomePageObjects;

public class SeleniumBasicLaunch extends Base{

	public static void main(String[] args) {

		
		
		
		Base.launchChromeBrowser();
		
		HomePageObjects homepage = new HomePageObjects();
		driver.get("http://demo.guru99.com/test/login.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(homepage.inputEmailId).sendKeys("prashanthi@gmail.com");

		driver.findElement(homepage.inputPassword).sendKeys("12345");

		driver.findElement(homepage.btnSignin).click();
		
	     String expected = "Successfully Logged in";
	     
	     String actual = driver.findElement(homepage.txtSignin).getText();
	     
	     if(expected.equals(actual)) {
	    	 System.out.println("User is successfully logged in");
	     }else {
	    	 
	    	 System.out.println("Actual value is "+actual);
	    	 System.out.println("Expected value is "+expected);
	    	 System.out.println("User is not able to logged in ");
	     }
	     
		driver.close();
	}

}
