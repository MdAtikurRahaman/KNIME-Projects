package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import base.Base;

public class PrivateSpacePage extends Base{

	By YourSpacesText = By.xpath("//div//h2[text()='Your spaces']");
	By CreateNewSpaceText = By.xpath("//div//h3[text()='Create new space']");
	By PrivateSpace = By.xpath("//div//button[@class='button compact']");
	By SearchBox = By.xpath("//div//textarea[@class='text']");
	By Bargermenu = By.xpath("//line[@transform='matrix(3 0 0 3 16 8)']");
	By DeleteSpace = By.xpath("//button[@class='modal-trigger button with-border compact']");
	
	
	public String getWelcomeText() {
		return browser.findElement(YourSpacesText).getText();
	}
	public String getCreateNewSpaceText() {
		return browser.findElement(CreateNewSpaceText).getText();
	}
	public void PrivateSpaceclick() {
		click(PrivateSpace);
		//browser.findElement(PrivateSpace).click();
	}
	public void SearchBoxclick(String AtikSpace) {
		browser.findElement(SearchBox).sendKeys(AtikSpace + Keys.ENTER);
	}
	public void Bargermenuclick() {
		browser.findElement(Bargermenu).click();
	}
	public void DeleteSpacelick() {
		browser.findElement(DeleteSpace).click();
	}

}
