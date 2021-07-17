package pageobjects;

import org.openqa.selenium.By;

public class HomePageObjects {

	
	public static By inputEmailId = By.id("email");
	
	public static By inputPassword = By.id("passwd");
	
	public static By btnSignin = By.id("SubmitLogin");
	
	public static By txtSignin = By.xpath("//h3[text()='Successfully Logged in...']");
}
