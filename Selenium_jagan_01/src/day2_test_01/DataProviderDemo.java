package day2_test_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo { 
	WebDriver driver;
	@Test(dataProvider="dataSet")
	public void login(String un,String pass) {
		System.out.println("username is===>"+un+","+"password is===>"+pass);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.linkText("logout")).click();
	}
	@DataProvider(name="dataSet")
	public Object[][] dataMethod(){
		Object[][] obj=new Object[3][2];
		obj[0][0]="Admin";
		obj[0][1]="admin123";
		
		obj[1][0]="Admin";
		obj[1][1]="admin123";
		
		obj[2][0]="Admin";
		obj[2][1]="admin123";
		
		return obj;
	}

}
