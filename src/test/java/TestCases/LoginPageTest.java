package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage login;
	
	@BeforeMethod(alwaysRun=true)
	public void setup()
	{
		initialization();
		login = new LoginPage();
		
	}
	
	@Test(enabled=true,groups="sanity")
	
	//Test case to verify URL
	
	public void verifyUrlTest()
	{
		 String result = login.verifyUrl();
		 Assert.assertEquals(result, "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		
	}
	
	@Test(enabled=true,groups="regression")
	
	//Test case to verify title
	
	public void verifyTitleTest()
	{
		String result = login.verifyTitle();
		Assert.assertEquals(result, "XYZ Bank");
	}
	
	
	
	
	@Test(enabled=true,groups="smoke")
	
	//Test case to verify home button is enabled or not 
	
	public void verifyHomeButtonEnableTest()
	{
		boolean result = login.verifyHomeButtonEnable();
		Assert.assertEquals(result,true);
	}
	
	@Test(enabled=true,groups= {"sanity","smoke"})
	
	// Test case to verify home button is displayed or not
	
	public void verifyHomeButtonDisplayTest()
	{
		boolean result = login.verifyHomeButtonDisplay();
		Assert.assertEquals(result, true);
	}
	
    @Test(enabled=true,groups= {"sanity","smoke"})
    
    // Test case to verify XYZ bank text
    
    public void verifyXyzBankTextTest()
    {
    	String result = login.verifyXyzBankText();
    	Assert.assertEquals(result, "XYZ Bank");
    }
	
  
    
    @Test(enabled=true,groups="functional")
    
    // Test case to verify customer login button is enable or not
    
    public void verifyCustomerLoginButtonEnableTest()
    {
    	boolean result = login.verifyCustomerLoginButtonEnable();
    	Assert.assertEquals(result, true);
    }
	
    @Test(enabled=true,groups= {"functional","regression"})
    
    //Test case to verify customer login button is display or not
    
    public void verifyCustomerLoginButtonDisplayTest()
    {
    	boolean result = login.verifyCustomerLoginButtonDisplay();
    	Assert.assertEquals(result, true);
    }
    
    
    @Test(enabled=true)
    
    //Test case to verify after clicking customer login button user should go to next page
    
    public void verifyCustomerLoginNextPageValidationTest()
    {
    	//login.verifyCustomerLoginButtonClick();
    	String result = login.verifyCustomerLoginNextPageValidation();
    	Assert.assertEquals(result,"Your Name :" );
    	
    }
    
    @Test
    
    //Test case to verify url after clicking customer login button
    
    public void verifyCustomerLoginButtonUrlTest()
    {
    	String result = login.verifyCustomerLoginButtonUrl();
    	Assert.assertEquals(result, "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
    }
    
    
    
   
    
    @Test(enabled=true)
    
    //Test case to verify bank manager login button is enable or not 
    
    public void verifyBankManagerLoginButtonEnableTest()
    {
    	boolean result = login.verifyBankManagerLoginButtonEnable();
    	Assert.assertEquals(result,true);
    	
    }
    
    @Test(enabled=true)
    
    //Test case to verify bank manager login button is displayed or not
    
    public void verifyBankManagerLoginButtonDisplayTest()
    {
    	boolean result = login.verifyBankManagerLoginButtonDisplay();
    	Assert.assertEquals(result,true);
    	
    }
    
    @Test(enabled=true)
    
    // Test case to verify after clicking bank manager login button user should go to next page
    
    public void verifyBankManagerLoginNextPageValidationTest()
    {
    //	login.verifyBankManagerLoginButtonClick();
    	boolean result = login.verifyBankManagerLoginNextPageValidation();
        Assert.assertEquals(result, true);
    	
    }
    
    @Test
    
    //Test case to verify url after clicking bank manager login button
    
    public void bankManagerNextPageUrlTest()
    {
    	String result = login.bankManagerNextPageUrl();
    	Assert.assertEquals(result, "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
    }
    
    
    
    
	@AfterMethod(alwaysRun=true)
	
	// Method to close browser
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
}
