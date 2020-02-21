package TesNGTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGClassWithXML {
	public String baseUrl = "http://demo.guru99.com/V1/";
	String driverPath = "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe";
	public WebDriver driver;

	@Test(groups = { "bonding", "strong_ties" })
	public void tc01LaunchURL() {

		System.out.println("launching firefox browser");
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test(groups = { "bonding" })	
	public void tc02VerifyLaunchPage() {

		String expectedTitle = "GTPL Bank Home Page";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test(groups = { "bonding", "strong_ties" })	
	public void tc03EnterCredentials() {
		String username = "mngr247102";
		String password = "jUqYvUt";
		System.out.println("u:" + username + " P:" + password);
		driver.findElement(By.name("uid")).sendKeys("mngr247102");
		driver.findElement(By.name("password")).sendKeys("jUqYvUt");
		driver.findElement(By.name("btnLogin")).click();
	}

	@Test(groups = { "strong_ties" })
	public void tc04VerifyLoggedInPage() {
		Assert.assertTrue(driver.findElement(By.className("heading3")).isDisplayed(),
				"Welcome To Manager's Page of GTPL Bank :Not Displayed");
		System.out.println("Manager's Page label is displayed");
	}

	@Test(groups = { "bonding" })		
    public void tc05VerifyHyperlinks() {	
		Assert.assertTrue(driver.findElement(By.partialLinkText("New Customer")).isEnabled(), "New Customer Page not available");
		Assert.assertTrue(driver.findElement(By.partialLinkText("Edit Customer")).isEnabled(), "Edit Customer Page not available");
		Assert.assertTrue(driver.findElement(By.partialLinkText("Delete Customer")).isEnabled(), "Delete Customer Page not available");
		Assert.assertTrue(driver.findElement(By.partialLinkText("New Account")).isEnabled(),"New Account Page not available");
		Assert.assertTrue(driver.findElement(By.partialLinkText("Delete Account")).isEnabled(), "Delete Account Page not available");
		Assert.assertTrue(driver.findElement(By.partialLinkText("Mini Statement")).isEnabled(), "Mini Statement Page not available");
		Assert.assertTrue(driver.findElement(By.partialLinkText("Customised Statement")).isEnabled(), "Customised Statement Page not available");
		Assert.assertTrue(driver.findElement(By.partialLinkText("Log out")).isEnabled(), "Log out Page not available");
	}

}
