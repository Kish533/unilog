package unilog;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public static WebDriver dri;
	public static Properties pro;
	public static String browser;
	
	public void initialization() {
		try {
			
			pro = new Properties();
			FileInputStream fil = new FileInputStream("L:\\oxygen\\Repositry\\testng.properties");
			pro.load(fil);
			} catch (Exception e) {
				}
		if(browser.equals("chrome")) {
			dri = new ChromeDriver();
			}
		else if(browser.equals("FF")) {
			dri = new FirefoxDriver();
		}
		
		dri.get(pro.getProperty("url"));
		dri.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dri.manage().window().maximize();
		
	}
	

}
