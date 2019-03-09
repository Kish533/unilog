package UnilogTesting;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import unilog.BasePage;

public class UnilogTest extends BasePage {
	
	LoginPage loginpage;
	
	public UnilogTest() {
		// TODO Auto-generated constructor stub
	super();
	}	
	@BeforeMethod
	public void UrlPage() {
	initialization();
	loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginpagetitle() {
	String title =loginpage.LoginPageTitle();
	Assert.assertEquals(dri, "B2B eCommerce Software & Product Content Services | Unilog");
	
	}
	 @Test(priority=2)
	 public void unilogImage() {
		 boolean value = loginpage.UnilogLogo();
		Assert.assertTrue(value);
		 
	 }
	
	
	@Test(priority=3)
	public void ClickOnContact() {
	loginpage.ContactLinkClick();	
		
		
	}
	
	@AfterMethod
	public void teardown() {
		dri.quit();
		
	}
	
	
	

}
