package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.LogStatus;

import extentreporting.ExtentReportingManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends ExtentReportingManager{
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public static void launchChromeBrowser() {

		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();
		 
		 
		 driver.manage().window().maximize();
		 
		 test.log(LogStatus.PASS, "Launched chrome browser");
	}

	public static void launchFireFoxBrowser() {

		WebDriverManager.firefoxdriver().setup();

		 driver = new FirefoxDriver();
	}
	
	public static void launchApplication(String url) {
		
		try {
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 test.log(LogStatus.PASS, "Application is launched");
		}catch(Exception e) {
			 test.log(LogStatus.FAIL, "Application is not launched");

		}

	}
	
	@AfterSuite
	public static void closeBrowser() {
		driver.close();
	}

}
