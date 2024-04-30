package day2_test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dependency_demo {
	WebDriver driver;
	@Test
	public void openBrowser() {
		System.out.println("Browser is opened");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(dependsOnMethods= {"openBrowser"})
	public void enterUrl() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("jaganmohankinthali@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Jagan@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
