package waittimes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplictWaitSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\PRASHANTHI\\MyJavaWorkSpace\\SeleniumSessions\\BrowserDrivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame(0);
		
		WebElement playButton = driver.findElement(By.xpath("//button[@aria-label='Play']"));
		
		playButton.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		WebElement agileProjectLink = driver.findElement(By.linkText("Agile Project"));
		
		agileProjectLink.click();
	}

}
