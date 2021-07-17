package waittimes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\PRASHANTHI\\MyJavaWorkSpace\\SeleniumSessions\\BrowserDrivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/guru99home/");


		driver.switchTo().frame(0);

		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Play']")));
		
		
		WebElement playButton = driver.findElement(By.xpath("//button[@aria-label='Play']"));

		playButton.click();


		driver.switchTo().defaultContent();

		WebElement agileProjectLink = driver.findElement(By.linkText("Agile Project"));

		agileProjectLink.click();
	}

}
