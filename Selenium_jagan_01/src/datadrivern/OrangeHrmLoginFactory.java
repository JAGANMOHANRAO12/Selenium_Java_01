package datadrivern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLoginFactory {
		public static WebDriver driver;
		OrangeHrmLoginFactory(WebDriver driver){
			OrangeHrmLoginFactory.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(name="username") WebElement userName;
		@FindBy(name="password") WebElement passWord;
		@FindBy(xpath="//button[@type='submit']") WebElement btn;
		public void url() throws InterruptedException {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
		}
		public void enterUser(String un) {
			userName.sendKeys(un);
		}
		public void enterPass(String pass) {
			passWord.sendKeys(pass);
		}
		public void Login() {
			btn.click();
		}
}
