package day2_test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login_after_before_testng_01 {
	WebDriver driver;
	
	@BeforeSuite
	public void open() {
		driver=new ChromeDriver();
		System.out.println("browser opened");
	}
	
	@Test
	public void Login() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		System.out.println("Website opened");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
	}
	
	@Test
	public void Logout() {
		driver.findElement(By.linkText("Log out")).click();
		
	}
	@AfterSuite
	public void closing() {
		driver.close();
		System.out.println("Browser closed");
	}
	

}
