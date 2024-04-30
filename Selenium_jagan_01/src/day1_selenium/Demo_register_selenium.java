package day1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_register_selenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/register");
		driver.manage().window().maximize();
		WebElement f1=driver.findElement(By.id("firstname"));
		f1.sendKeys("Jagan Mohan Rao");
		WebElement l1=driver.findElement(By.id("lastname"));
		l1.sendKeys("Kinthali");
		WebElement u1=driver.findElement(By.id("userName"));
		u1.sendKeys("jaganmohanrao");
		WebElement p1=driver.findElement(By.id("password"));
		p1.sendKeys("Jagan@123");
		driver.findElement(By.id("g-recaptcha")).click();
		driver.findElement(By.id("register")).click();
		driver.findElement(By.id("gotologin")).click();
		driver.close();
	}

}
