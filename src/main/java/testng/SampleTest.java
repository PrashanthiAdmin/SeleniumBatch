package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest {

	@Test(invocationCount = 2)
	@Parameters({"emailid"})
	public static void display(String arg) {
		System.out.println("Hello world");
		System.out.println(arg);
	}
	

	public static void display1() {
		System.out.println("Hello world 1");
	}
	
	@Test
	public static void display2() {
		System.out.println("Hello world");
	}
	
	@Test
	public static void display3() {
		System.out.println("Hello world");
	}
	
	@Test(groups = "smoke",dataProvider = "usernames")
	public static void display4(String arg) {
		System.out.println("username is "+arg);
	}
	
	
	//@BeforeMethod
	public static void before() {
		System.out.println("This is before method");
	}
	
	//@AfterMethod
	public static void after() {
		System.out.println("This is after method");
	}
	
	@BeforeSuite
	public static void beforesuite() {
		System.out.println("This is before suite");
		
		
		
	}
	
	@AfterSuite
	public static void aftersuite() {
		System.out.println("This is after suite");
	}
	
	@Test(groups = "smoke",dataProvider = "testdata")
	public static void sendMessage1(String username, String password) {

		System.out.println("My username is " + username + " And the value is" + password);

		//System.out.println("Hello from second test");
	}
	
	@DataProvider(name = "testdata")
	public Object[][] dpMethod() {
		return new Object[][] { { "prashanthi", "prashanthi123" }, { "shirisha", "1234!@3" }, { "prathap", "1234" }

		};
	}
	
	@DataProvider(name = "usernames")
	public Object[][] usernameData() {
		return new Object[][] { { "prashanthi" }, { "shirisha" }, { "prathap"}

		};
	}

	
	
}
