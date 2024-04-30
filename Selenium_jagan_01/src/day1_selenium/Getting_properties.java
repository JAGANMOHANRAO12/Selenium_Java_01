package day1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getting_properties {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		System.out.println(email.getAttribute("id"));
		WebElement pass=driver.findElement(By.id("pass"));
		System.out.println(pass.getTagName());
		driver.close();
		
	}

}
