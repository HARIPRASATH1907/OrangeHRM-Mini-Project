package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

	public static WebDriver driver;

	@FindBy(xpath="//input[@name='firstName']")
	public WebElement Firstname;

	@FindBy(xpath="//input[@name='middleName']")
	public WebElement Middlename;

	@FindBy(xpath="//input[@name='lastName']")
	public WebElement Lastname;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement SaveButton;
	
	@FindBy(xpath="//a[contains(text(),'Add Employee')]")
	public WebElement AddEmployee;
	
	

	public AddEmployeePage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}