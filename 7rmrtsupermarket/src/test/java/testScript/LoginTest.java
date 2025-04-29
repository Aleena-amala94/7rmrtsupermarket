package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import utility.ExcelUtility;


public class LoginTest extends Base {
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws Exception 
	{
		
	String username = ExcelUtility.readStringData(1, 0, "loginpage");
	String password = ExcelUtility.readStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);//parameterized construction need to create constructor in page class
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		boolean isdashboardloaded = loginpage.isHomePageLoaded();
		Assert.assertTrue(isdashboardloaded);

}
	public void verifyWhetherUserIsAbleToLoginUsingCorrectUsernameAndIncorrectPassword() throws Exception
	{
		
		String username=ExcelUtility.readStringData(2, 0,"loginpage");
		String password=ExcelUtility.readStringData(2, 1,"loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		loginpage.redAlert();
		boolean alert=loginpage.redAlert();
		Assert.assertTrue(alert);
		
		
	}
	@Test
	public void verifyWhetherUserIsAbleToLoginUsinginCorrectUsernameAndcorrectPassword() throws Exception
	{
		
		String username=ExcelUtility.readStringData(3, 0, "loginpage");
		String password=ExcelUtility.readStringData(3, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		loginpage.redAlert();
		boolean alert=loginpage.redAlert();
		Assert.assertTrue(alert);
	}
	@Test
	public void verifyWhetherUserIsAbleToLoginUsinginCorrectUsernameAndincorrectPassword() throws Exception
	{
		
		String username=ExcelUtility.readStringData(4, 0, "loginpage");
		String password=ExcelUtility.readStringData(4, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		loginpage.redAlert();
		boolean alert=loginpage.redAlert();
		Assert.assertTrue(alert);
	}
	
}
