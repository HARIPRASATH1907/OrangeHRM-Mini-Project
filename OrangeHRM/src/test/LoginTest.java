package test;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.EmployeeListPage;
import pages.LoginPage;
import pages.PIMPage;
import utilities.TestSetup;

public class LoginTest {
	
		public static Properties prop;
		public static WebDriver driver;
		String Name;
		TestSetup obj=new TestSetup();
		@Test //LOGIN PAGE
		public void validlogin() throws InterruptedException {
		LoginPage login=new LoginPage(driver);
		String Url=prop.getProperty("URL") ;
		String UserName=prop.getProperty("Username") ;
		String PassWord=prop.getProperty("Password") ;
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 login.Username.sendKeys(UserName);
		 login.Password.sendKeys(PassWord);
		 login.Submit.click();
		
		 
		 
		//DASHBOARD PAGE
	    DashboardPage Dbpage=new DashboardPage(driver);
		Actions act=new Actions(driver);
		act.moveToElement(Dbpage.PIM).click().build().perform();
		
		//PIM PAGE
		PIMPage pim=new PIMPage(driver);
		pim.AddEmployee.click();
		
		//ADDEMPLOYEE PAGE
		AddEmployeePage addemployee=new AddEmployeePage(driver);
		for(int i=1;i<=3;i++) 
		{
			String FN=prop.getProperty("emp"+ i +".firstname") ;
			String LN=prop.getProperty("emp"+ i +".lastname") ;
			String MN=prop.getProperty("emp"+ i +".middlename") ;
			addemployee.Firstname.sendKeys(FN);
			addemployee.Lastname.sendKeys(LN);
			addemployee.Middlename.sendKeys(MN);
			addemployee.SaveButton.click();
			Thread.sleep(10);
			addemployee.AddEmployee.click();
		}
		
		//EMPLOYEE LIST PAGE
		Thread.sleep(10);
		EmployeeListPage emplist=new EmployeeListPage(driver);
		emplist.EmployeeList.click();
		List<WebElement> EmpNames=driver.findElements(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']"));
		for(WebElement Employee:EmpNames)
		{
		 Name=Employee.getText();
		
        for(int i=1;i<=3;i++) 
        {
			String FN=prop.getProperty("emp"+ i +".firstname") ;
			String LN=prop.getProperty("emp"+ i +".lastname") ;
			String MN=prop.getProperty("emp"+ i +".middlename") ;
			String FNMN=FN+" " + MN;
			
			if(Name.equals(FNMN))
			{
				System.out.println(Name + " "+LN);
			}
        }
		}
		
		emplist.DropdownArrow.click();
		emplist.Logout.click();
		}
		
		
		
		
		 @BeforeClass
		  public void beforeClass() {
			this.driver=obj.driver;
		    this.prop=obj.prop;
		  }

		}

