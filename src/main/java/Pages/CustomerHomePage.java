package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class CustomerHomePage extends TestBase{

	
	// Object repo
	
	@FindBy(xpath ="//select[@id='userSelect']")private WebElement yourNameDropdown;
	@FindBy(xpath ="//button[text()='Login']")private WebElement loginBtn;
	@FindBy(xpath ="//button[@ng-class='btnClass2']")private WebElement depositBtn;
	
	
	//Constructor 
	
	public CustomerHomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods 
	
	//verify deposit process
	
	public void verifyDepositProcess()
	{
		Select s = new Select(yourNameDropdown);
		s.selectByVisibleText("Vishal Keswad");
		loginBtn.click();
	}
	
	//verify deposit Btn click
	
	public void verifyDepositBtnClick()
	{
		depositBtn.click();
	}
	
}
