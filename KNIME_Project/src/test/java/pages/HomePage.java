package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Base;

public class HomePage extends Base{
	    By againSignin = By.xpath("//button[@class='button primary compact']");
		By hub = By.xpath("//a[@title='KNIME Hub']");
		By welcomeText = By.xpath("//div//h2[text()='KNIME Hub']");
		By A_Logo = By.xpath("//div[@class='avatar-placeholder avatar avatar-profile']/span[text()='A']");
		By Space = By.xpath("//a[@class='clickable-item']");
		By alertCookies = By.xpath("//button[@class='accept-button button primary']");
		
		
		//By CookiesAlart = By.cssSelector("div.container.cookie-modal.modal.info div.wrapper div.inner div.controls > button.accept-button.button.primary");
		//div.container.cookie-modal.modal.info div.wrapper div.inner div.controls > button.accept-button.button.primary
		
		
		public void againSigninClick() {
			browser.findElement(againSignin).click();
		}
		public String getWelcomeText() {
			return browser.findElement(welcomeText).getText();
		}
		public void A_Logoclick() throws InterruptedException {
			Thread.sleep(50000);
			browser.findElement(A_Logo).click();
		}		
		public void Spaceclick() {
			browser.findElement(Space).click();
		}
		public void hubClick() {
			browser.findElement(hub).click();
		}
		public void alertClick() {
			browser.findElement(alertCookies).click();
		}
		public WebElement alertButton() {
			return browser.findElement(alertCookies);		
		}	
//		public void CookiesClick() {
//			browser.findElement(CookiesAlart).click();
//		}
//		public WebElement alertButton() {
//			return browser.findElement(alertCookies);	
//		}

	}
