package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class KNIMESigninPage extends Base{

		By knimeSigninLabel = By.xpath("//h2[text()='Sign in']");
	    //By knimeSigninLabel = By.xpath("/html/body/div[1]/div/div/section/div[2]/h2"); //problem
		By userIdBox = By.xpath("//input[@id='edit-name']");
		By userPasswordBox = By.id("edit-pass");
		By SigninBtn = By.id("edit-submit");
		
		public String getKNIMESigninLabel() throws InterruptedException {
			Thread.sleep(5000);
			return browser.findElement(knimeSigninLabel).getText();
		}
		public void enterUserId(String user) {
			browser.findElement(userIdBox).sendKeys(user);
		}
		public void enterUserPassword(String pass) {
			browser.findElement(userPasswordBox).sendKeys(pass);
		}
		public void clickSigninBtn() throws InterruptedException {
			browser.findElement(SigninBtn).click();
			Thread.sleep(15000);
		}
//		public String getSigninBtnText() {
//		String s = browser.findElement(SigninBtn).getAttribute("value");
//		return s;
//}

}
