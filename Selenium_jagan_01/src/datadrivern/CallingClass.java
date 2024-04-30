package datadrivern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		OrangeHrmLoginFactory pf=new OrangeHrmLoginFactory(driver);
		pf.url();
		pf.enterUser("Admin");
		pf.enterPass("admin123");
		pf.Login();
	}

}
