package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	//verify home button
	//Verify XYZ bank text
	//Verify customer login button
	//verify bank manager login button
	
	
	//Object Repo
	
	@FindBy(xpath = "//button[@class='btn home']")private WebElement homeButton;
	@FindBy(xpath = "//strong[@class='mainHeading']")private WebElement xyzBank;
	@FindBy(xpath = "//button[text()='Customer Login']")private WebElement customerLogin;
	@FindBy(xpath = "//button[text()='Bank Manager Login']")private WebElement bankmanagerLoginButton;
	@FindBy(xpath = "//label[text()='Your Name :']")private WebElement nextPageText;
	@FindBy(xpath = "//button[@ng-class='btnClass1']")private WebElement nextPageAddCustBtn;
	@FindBy(xpath = "//button[@ng-class='btnClass2']")private WebElement nextPageOpenAccBtn;
	@FindBy(xpath = "//button[@ng-class='btnClass3']")private WebElement nextPageCustomersBtn;
	
	//Constructor
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Methods
	
	//verify URL
	
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	
	// verify title
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	
	
	//verify home button is enable or not
	
	public boolean verifyHomeButtonEnable()
	{
		return homeButton.isEnabled();
	}
	
	//verify home button is display or not
	
	public boolean verifyHomeButtonDisplay()
	{
		return homeButton.isDisplayed();
	}
	
	//verify XYZ bank text
	
	public String verifyXyzBankText()
	{
		return xyzBank.getText();
	}
	

	//verify customer button is enable or not 
	
	public boolean verifyCustomerLoginButtonEnable()
	{
		return customerLogin.isEnabled();
	}
	
	//verify customer button is display or not
	
	public boolean verifyCustomerLoginButtonDisplay()
	{
		return customerLogin.isDisplayed();
	}
	
	//Verify customer login button click
	
	public void verifyCustomerLoginButtonClick()
	{
		customerLogin.click();
	}
	
	// verify after clicking customer login button user should go to next page
	
	public String verifyCustomerLoginNextPageValidation()
	{
		customerLogin.click();
		return nextPageText.getText();
		
	}
	
	//verify url after clicking customer login button
	
	public String verifyCustomerLoginButtonUrl()
	{
		verifyCustomerLoginNextPageValidation();
		return driver.getCurrentUrl();
	}
	
	
	// verify bank manager login button is enable or not
	
	public boolean verifyBankManagerLoginButtonEnable()
	{
		return bankmanagerLoginButton.isEnabled();
	}
	
	// verify bank manager login button is displayed or not
	
	public boolean verifyBankManagerLoginButtonDisplay()
	{
		return bankmanagerLoginButton.isDisplayed();
	}
	
	//verify bank manager login button click
	
	public void verifyBankManagerLoginButtonClick()
	{
		bankmanagerLoginButton.click();
	}
	
	
	//verify after clicking bank manager login button user should go to next page
	
	public boolean verifyBankManagerLoginNextPageValidation()
	{
		bankmanagerLoginButton.click();
		return nextPageAddCustBtn.isDisplayed();
		
	}
	
	//verify manager login next page url
	
	public String bankManagerNextPageUrl()
	{
		verifyBankManagerLoginNextPageValidation();
		return driver.getCurrentUrl();
	}
	
	
	//verify customer click btn
	
	public void verifyCustomerLoginBtnClick()
	{
		customerLogin.click();
	}
}
