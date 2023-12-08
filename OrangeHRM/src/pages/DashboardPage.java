package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

		public static WebDriver driver;

		@FindBy(xpath="//span[text()='PIM']")
		public WebElement PIM;
		
		public DashboardPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
}
