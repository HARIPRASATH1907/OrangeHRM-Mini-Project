package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PIMPage {

	public static WebDriver driver;

	
	@FindBy(xpath="//a[contains(text(),'Add Employee')]")
	public WebElement AddEmployee;

	public PIMPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
