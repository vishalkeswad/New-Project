package Pages;

import java.awt.Component;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class ManagerHomePage extends TestBase {

	//object repo
	
	@FindBy(xpath = "//button[@ng-class='btnClass1']")private WebElement addCustBtn;
	@FindBy(xpath = "//button[@ng-class='btnClass2']")private WebElement openAccBtn;
	@FindBy(xpath = "//button[@ng-class='btnClass3']")private WebElement customersBtn;	
	@FindBy(xpath = "//strong[@class='mainHeading']")private WebElement xyzBankText;	
	@FindBy(xpath ="//button[@class='btn home']")private WebElement homeBtn;
	@FindBy(xpath ="//input[@placeholder='First Name']")private WebElement firstNameTextbox;
	@FindBy(xpath ="//input[@placeholder='Last Name']")private WebElement lastNameTextBox;
	@FindBy(xpath ="//input[@placeholder='Post Code']")private WebElement postalCodeTextbox;
	@FindBy(xpath ="//button[text()='Add Customer']")private WebElement addCustomerBtn;
	@FindBy(xpath ="//select[@id='userSelect']")private WebElement customerNameDropdown;
	@FindBy(xpath ="//select[@id='currency']")private WebElement currencyDropdown;
	@FindBy(xpath ="//button[@type='submit']")private WebElement processBtn;
	@FindBy(xpath ="//input[@placeholder='Search Customer']")private WebElement customerSearchBox;
	@FindBy(xpath ="//table[@class='table table-bordered table-striped']//tr")private List<WebElement>  row;
	//Constructor
	
	
	
	public ManagerHomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	
	//Verify add customer button enable or not
	
	public boolean verifyCustomerAddBtnEnable()
	{
		return addCustomerBtn.isEnabled();
	}
	
	//verify open account btn is enable
	
	public boolean verifyOpenAccountBtn()
	{
		return openAccBtn.isEnabled();
	}
	
	//verify customers btn is enable
	
	public boolean verifyCustomerBtnEnable()
	{
		return customersBtn.isEnabled();
	}
	
	//verify customer btn click
	public void verifyCustomerClickBtn()
	{
		customersBtn.click();
	}
	
	// verify XYZ bank text
	
	public String verifyXyzBankText()
	{
		return xyzBankText.getText();
	}
	
	//Verify home button is enable 
	
	public boolean verifyHomeBtnEnable()
	{
		return homeBtn.isEnabled();
	}
	
	// verify is user able to go login btn after clicking home btn
	
	public String verifyHomeBtnClick()
	{
		homeBtn.click();
		return driver.getCurrentUrl();
	}
	
	// verify add first customer process
	
	public void verifyAddCustomerProcess1()
	{
		addCustBtn.click();
		firstNameTextbox.sendKeys("Vishal");
		lastNameTextBox.sendKeys("Keswad");
		postalCodeTextbox.sendKeys("412211");
		addCustomerBtn.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
	}
	
	// verify add second customer process
	
	public void verifyAddCustomerProcess2()
	{
		addCustBtn.click();
		firstNameTextbox.sendKeys("Sneha");
		lastNameTextBox.sendKeys("Garmale");
		postalCodeTextbox.sendKeys("412253");
		addCustomerBtn.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
	}
	
	// verify add third customer process
	
	public void verifyAddCustomerProcess3()
	{
		addCustBtn.click();
		firstNameTextbox.sendKeys("Sweety");
		lastNameTextBox.sendKeys("Mohite");
		postalCodeTextbox.sendKeys("412532");
		addCustomerBtn.click();
		Alert a = driver.switchTo().alert();
		a.accept();		
			
	}
	
	
	// verify add forth customer process
		
	public void verifyAddCustomerProcess4()
	{
		addCustBtn.click();
		firstNameTextbox.sendKeys("Shital");
		lastNameTextBox.sendKeys("Lade");
		postalCodeTextbox.sendKeys("412245");
		addCustomerBtn.click();
		Alert a = driver.switchTo().alert();
		a.accept();			
    }
	
	//verify open account click btn
	
	public void verifyOpenAccountClickBtn()
	{
		openAccBtn.click();
	}
	
	//verify add customer btn click
	
	public void verifyAddCustomerBtnClick()
	{
		addCustBtn.click();
	}
	
	//verify open first account process
	
	public void verifyOpenAccountProcess1()
	{
		openAccBtn.click();
		Select s = new Select(customerNameDropdown);
		s.selectByVisibleText("Vishal Keswad");
	}
		
	// verify selection of  currency process
	
	public void verifyCurrencyDropDown()
	{
		Select s1 = new Select(currencyDropdown);
		s1.selectByVisibleText("Rupee");	
		processBtn.click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	//verify open second account process
	
		public void verifyOpenAccountProcess2()
		{
			//openAccBtn.click();
			Select s = new Select(customerNameDropdown);
			s.selectByVisibleText("Sneha Garmale");
		}
	
	//verify open third account process
		
			public void verifyOpenAccountProcess3()
			{
				//openAccBtn.click();
				Select s = new Select(customerNameDropdown);
				s.selectByVisibleText("Sweety Mohite");
			}
			
	//verify open forth account process
			
			public void verifyOpenAccountProcess4()
			{
				//openAccBtn.click();
				Select s = new Select(customerNameDropdown);
				s.selectByVisibleText("Shital Lade");
			}	
			
   // verify customers add successfully or not
			
			public void verifyCustomersName()
			{
				customersBtn.click();
				customerSearchBox.sendKeys("Vishal");
			}
			
	//verify home Btn clickable or not
			
			public void verifyHomeBtnClick2()
			{
				homeBtn.click();
			}
			
	// verify list of customers
			public void verifyListOfCustomers()
			{
				for(int i=0;i<row.size();i++)
				{
					System.out.println(row.get(i).getText());
				}
			}
			
			
			
			
}
