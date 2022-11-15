package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CustomerHomePage;
import Pages.LoginPage;
import Pages.ManagerHomePage;

public class CustomerHomePageTest extends TestBase {

	CustomerHomePage customer;
	LoginPage login;
	ManagerHomePage manager;
	
	@BeforeMethod
	
	public void setup()
	{
		initialization();
		customer = new CustomerHomePage();
		login = new LoginPage();
		manager = new ManagerHomePage();
		
	}
	
	
	@Test(enabled=true)
	
	// Test case to verify deposit process for first user
	
	public void verifyDepositProcessTest() throws Exception
	{
		login.verifyBankManagerLoginButtonClick();
		manager.verifyAddCustomerProcess1();
		Thread.sleep(5000);
		manager.verifyOpenAccountClickBtn();
		Thread.sleep(5000);
		manager.verifyOpenAccountProcess1();
		Thread.sleep(5000);
		manager.verifyCurrencyDropDown();
		manager.verifyAddCustomerBtnClick();
		manager.verifyAddCustomerProcess2();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess2();
		manager.verifyCurrencyDropDown();
		manager.verifyAddCustomerBtnClick();
		manager.verifyAddCustomerProcess3();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess3();
		manager.verifyCurrencyDropDown();
		manager.verifyAddCustomerBtnClick();
		manager.verifyAddCustomerProcess4();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess4();
		manager.verifyCurrencyDropDown();
    	manager.verifyCustomersName();
    	Thread.sleep(10000);
		manager.verifyHomeBtnClick2();
		login.verifyCustomerLoginBtnClick();
		customer.verifyDepositProcess();
		customer.verifyDepositBtnClick();
	}
	
	@Test(enabled=false)
	public void verifyDepositProcess2()
	{
		login.verifyCustomerLoginBtnClick();
		customer.verifyDepositProcess();
		customer.verifyDepositBtnClick();
	}
	
	
	
	
	
	
	@AfterMethod
	
	// Close browser
	
	public void closeBrowser()
	{
		driver.close();
	}
	
}
