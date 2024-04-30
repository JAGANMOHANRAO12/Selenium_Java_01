package day2_test_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Before_After_Suite {
	WebDriver driver;
	
	@BeforeSuite
	public void test1() {
		driver=new ChromeDriver();
		System.out.println("browser opened");
	}
	
	@Test
	public void test2() {
		driver.get("https://facebook.com/");
		System.out.println("Website opened");
	}
	
	@Test
	public void test5() {
		driver.get("https://facebook.com/");
		System.out.println("Website opened");
	}
	
	@AfterSuite
	public void test3() {
		driver.close();
		System.out.println("Browser closed");
	}	
}
