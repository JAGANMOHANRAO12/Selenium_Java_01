package day1_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anchor_count_selenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		List<WebElement> allLinkss=driver.findElements(By.tagName("a"));
		int counts=allLinkss.size();
		for(int i=0;i<counts;i++) {
			System.out.println(allLinkss.get(i).getText());
		}
		System.out.println(counts);

	}

}
