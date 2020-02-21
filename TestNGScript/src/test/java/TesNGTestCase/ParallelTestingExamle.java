package TesNGTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTestingExamle {
	String baseUrl = "https://www.google.com/";
	WebDriver driver1, driver2;
	

	@Test
	public void method1() {
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe"); driver1 = new
		 * FirefoxDriver(); driver1.get(baseUrl); driver1.findElement(By.xpath(
		 * "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"))
		 * .sendKeys("Amazon Share value"); driver1.findElement(By.xpath(
		 * "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		 */
		System.out.println("Thread: " + Thread.currentThread().getId());
	}

	@Test
	public void method2() {
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe"); driver2 = new
		 * FirefoxDriver(); driver2.get(baseUrl); driver2.findElement(By.xpath(
		 * "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"))
		 * .sendKeys("Microsoft Share value"); driver2.findElement(By.xpath(
		 * "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		 */
		System.out.println("Thread: " + Thread.currentThread().getId());
	}

}
