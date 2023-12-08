package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage {

public static WebDriver driver;

	
	@FindBy(xpath="//a[contains(text(),'Employee List')]")
	public WebElement EmployeeList;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")
	public WebElement DropdownArrow;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	public WebElement Logout;
	
	public EmployeeListPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}


