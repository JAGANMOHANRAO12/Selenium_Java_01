package day1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover_selenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement minitv=driver.findElement(By.linkText("Amazon miniTV"));
		WebElement fresh=driver.findElement(By.linkText("Fresh"));
		
		Actions acts=new Actions(driver);
		acts.moveToElement(minitv).build().perform();
		acts.moveToElement(fresh).build().perform();

	}

}
