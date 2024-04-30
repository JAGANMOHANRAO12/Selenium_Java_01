package day1_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drage_and_down_selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@value=Sign in']")).click();
		
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println("msg is"+msg);
		Thread.sleep(2000);
		alert.accept();
	}

}
