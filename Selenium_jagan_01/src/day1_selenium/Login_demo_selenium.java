package day1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_demo_selenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		WebElement u11=driver.findElement(By.id("userName"));
		u11.sendKeys("jaganmohanrao");
		WebElement p11=driver.findElement(By.id("password"));
		p11.sendKeys("Jagan@123");
		driver.findElement(By.id("login")).click();
	}

}
