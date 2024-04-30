package day1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String expected="Facebook – log in or sign up";
		if(title.equals(expected)) {
			System.out.println("Done");
 		}
		driver.findElement(By.id("email")).sendKeys("jaganmohankinthali@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("jagan@123");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("jagan");
		driver.findElement(By.name("lastname")).sendKeys("kinthali");
		driver.findElement(By.name("reg_email__")).sendKeys("jaganmohan@gmail.com");
		driver.findElement(By.partialLinkText("Forgotten")).click();		
		
	}

}
