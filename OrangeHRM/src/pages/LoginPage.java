package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		public static WebDriver driver;

		@FindBy(xpath="//input[@name='username']")
		public WebElement Username;

		@FindBy(xpath="//input[@name='password']")
		public WebElement Password;

		@FindBy(xpath="//button[@type='submit']")
		public WebElement Submit;
		
		
		public LoginPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		}

