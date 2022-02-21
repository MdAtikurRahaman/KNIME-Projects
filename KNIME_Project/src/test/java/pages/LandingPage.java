package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class LandingPage extends Base{

	public void navigateURL() {
		browser.get("https://www.knime.com");
	}
	
	By Signinbtn = By.xpath("//div/a[text()='Sign in']");

	public void click_Login_Btn() throws InterruptedException {
		Thread.sleep(10000);
		browser.findElement(Signinbtn).click();
	}
}
