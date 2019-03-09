package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import unilog.BasePage;

public class LoginPage extends BasePage {

	
	@FindBy(xpath = "//img[@title='Unilog Content Solutions Pvt Ltd']")
	WebElement UnilogLogo;
	
	@FindBy(xpath = "//a[contains(),(text(),'CONTACT']")
	WebElement Contact_Link;
	
	
	
	public LoginPage() {
		PageFactory.initElements(dri, this);
	}
	
	
	public String LoginPageTitle() {
		return dri.getTitle();
		
		}
	public boolean UnilogLogo() {
		return UnilogLogo.isDisplayed();
		
	}
	
	
	
	
	public contactspage ContactLinkClick() {
		
		Contact_Link.click();
		return new contactspage(); 
		
		}
	
	
	
}
