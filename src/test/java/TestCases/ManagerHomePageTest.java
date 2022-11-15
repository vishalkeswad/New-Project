package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Pages.ManagerHomePage;
import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class ManagerHomePageTest extends TestBase{

	ManagerHomePage manager;
	LoginPage login;
	
	@BeforeMethod
	
	public void setup()
	{
		initialization();
		login = new LoginPage();
		manager = new ManagerHomePage();
		
	}
	
	
	@Test(enabled=false)
	
	// Test case to verify customer add button is enable or not
	
	public void verifyCustomerAddBtnEnableTest()
	{
		boolean result = manager.verifyCustomerAddBtnEnable();
		Assert.assertEquals(result, true);
	}
	
	@Test(enabled=false)
	
	// Test case to verify open account button is enable or not
	
	public void verifyOpenAccountBtnTest()
	{
		login.verifyBankManagerLoginButtonClick();
		boolean result = manager.verifyOpenAccountBtn();
		Assert.assertEquals(result, true);
	}
	
	@Test(enabled=false)
	
	//Test case to verify customers button is enable or not
	
	public void verifyCustomerBtnEnableTest()
	{
		login.verifyBankManagerLoginButtonClick();
		boolean result = manager.verifyCustomerBtnEnable();
		Assert.assertEquals(result,true);
	}
	
	@Test(enabled=false)
	
	//Test case to verify XYZ bank Text
	
	public void verifyXyzBankTextTest()
	{
		login.verifyBankManagerLoginButtonClick();
		String result = manager.verifyXyzBankText();
		Assert.assertEquals(result,"XYZ Bank");
	}
	
	@Test(enabled=false)
	
	//Test case to verify home btn is enable or not 
	
	public void verifyHomeBtnEnableTest()
	{
		login.verifyBankManagerLoginButtonClick();
		boolean result = manager.verifyHomeBtnEnable();
		Assert.assertEquals(result,true);	 
	}
	
	@Test(enabled=false)
	
	// Test case to verify user is able to go to login page after clicking home button
	
	public void verifyHomeBtnClickTest()
	{
		login.verifyBankManagerLoginButtonClick();
		String Result = manager.verifyHomeBtnClick();
		Assert.assertEquals(Result, "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");	
	}
	
	@Test(enabled=false)
	
	// Test case to verify add first customer process
	
	public void verifyAddCustomerProcess1Test()
	{
		login.verifyBankManagerLoginButtonClick();
		manager.verifyAddCustomerProcess1();
	}
	
	@Test(enabled=false)
	
	// Test case to verify add second account process
	
	public void verifyAddCustomerProcess2Test()
	{
		login.verifyBankManagerLoginButtonClick();
		manager.verifyAddCustomerProcess2();
	}
	
	@Test(enabled=false)

	
	// Test case to verify add second account process
	
	public void verifyAddCustomerProcess3Test()
	{
		login.verifyBankManagerLoginButtonClick();
		manager.verifyAddCustomerProcess3();
	}
	
	
     @Test(enabled=false)
	
	// Test case to verify add second account process
	
	public void verifyAddCustomerProcess4Test()
	{
		login.verifyBankManagerLoginButtonClick();
		manager.verifyAddCustomerProcess4();
	}
	
	@Test(enabled=false)
	
	//Test case to verify open account process1
	
	public void verifyOpenAccountProcess1Test()
	{
		login.verifyBankManagerLoginButtonClick();
		manager.verifyAddCustomerProcess1();
		manager.verifyOpenAccountProcess1();
		manager.verifyCurrencyDropDown();
		
	}
	
	@Test(enabled=false)
	
	//Test case to verify open account process2
	
	public void verifyOpenAccountProcessTest()
	{
		login.verifyBankManagerLoginButtonClick();
		manager.verifyAddCustomerProcess1();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess1();
		manager.verifyAddCustomerBtnClick();
		manager.verifyAddCustomerProcess2();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess2();
		manager.verifyAddCustomerBtnClick();
		manager.verifyAddCustomerProcess3();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess3();
		manager.verifyAddCustomerBtnClick();
		manager.verifyAddCustomerProcess4();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess4();
	}
	
	@Test(enabled=false)
	
//Test case to verify customer added  or not
	
	public void verifyCustomersNameTest()
	{
		login.verifyBankManagerLoginButtonClick();
		manager.verifyAddCustomerProcess1();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess1();
		manager.verifyAddCustomerBtnClick();
		manager.verifyAddCustomerProcess2();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess2();
		manager.verifyAddCustomerBtnClick();
		manager.verifyAddCustomerProcess3();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess3();
		manager.verifyAddCustomerBtnClick();
		manager.verifyAddCustomerProcess4();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess4();
		manager.verifyCustomersName();
		
	}
	
	@Test(enabled=true) 
	//Test case to verify list of customers
	
	public void verifyListOfCustomersTest() throws Exception
	{
		login.verifyBankManagerLoginButtonClick();
		manager.verifyAddCustomerProcess1();
		manager.verifyOpenAccountClickBtn();
		manager.verifyOpenAccountProcess1();
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
		Thread.sleep(5000);
		manager.verifyCustomerClickBtn();
		Thread.sleep(5000);
		manager.verifyListOfCustomers();
		Thread.sleep(5000);
		
	}
	
	
	
	@AfterMethod
	
	// Close browser
	
	public void closeBrowser()
	{
		driver.close();
	}
}
