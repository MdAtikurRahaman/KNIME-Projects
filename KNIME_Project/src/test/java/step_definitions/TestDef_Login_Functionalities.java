package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PrivateSpacePage;
import pages.KNIMESigninPage;
import pages.HomePage;
import pages.LandingPage;

public class TestDef_Login_Functionalities extends Base {

	LandingPage landingPage = new LandingPage();
	KNIMESigninPage knimeSigninPage = new KNIMESigninPage();
	HomePage homePage = new HomePage();
	PrivateSpacePage privateSpacePage = new PrivateSpacePage();

	@Given("I am in landing page")
	public void i_am_in_landing_page() {
		landingPage.navigateURL();
	}

	@When("I click on Signin Menu")
	public void i_click_on_Signin_Menu() throws InterruptedException {
		landingPage.click_Login_Btn();
	}

	@Then("verify I am in KNIME Signin Page")
	public void verify_I_am_in_KNIME_Signin_Page() throws InterruptedException {
		assertEquals("Sign in", knimeSigninPage.getKNIMESigninLabel());
	}

	@Then("I enter Login Id")
	public void i_enter_Login_Id() {
		knimeSigninPage.enterUserId("atik.java7104@gmail.com");
	}

	@Then("I enter Password")
	public void i_enter_Password() {
		knimeSigninPage.enterUserPassword("Atikurrahaman123");
	}

//	@Then("Click on Signin Button")
//	public void click_on_Signin_Button() throws InterruptedException {
//		knimeSigninPage.clickSigninBtn();
//		//assertEquals("Sign in", knimeSigninPage.getSigninBtnText());
//	}

	@Then("Click on Signin Button")
	public void click_on_Signin_Button() throws InterruptedException {
	knimeSigninPage.clickSigninBtn();
}
	@Then("Click on Hub Menu")
		public void click_on_Hub_Menu() throws InterruptedException {
			homePage.hubClick();

			By cookies_accept = By.xpath("//button[@class=\"accept-button button primary\"]");
	   
	        WebDriverWait wait = new WebDriverWait(browser, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
	        browser.findElement(cookies_accept).click();
	        browser.findElement(By.xpath("//*[@id=\'et-boc\']/div/div/div[4]/div/div/div[2]/div[1]")).click();
		}
//        Actions a = new Actions(browser);
//		a.sendKeys(Keys.ESCAPE).build().perform();
//	
	@Then("Click Signin again")
	public void click_Signin_again() {
		homePage.againSigninClick();
	}
	
	@Then("Verify Welcome Text")
	public void verify_Welcome_Text() {
		assertEquals("KNIME Hub", homePage.getWelcomeText());
	}

	@Then("I click on A Button")
	public void i_click_on_A_Button() throws InterruptedException {
		homePage.A_Logoclick();
	}

	@Then("I click on Space Button")
	public void i_click_on_Space_Button() {
		homePage.Spaceclick();
	}

	@Then("Verify your space test")
	public void verify_your_space_test() {
		privateSpacePage.getWelcomeText();
	}

	@Then("I click Create New Space")
	public void i_click_Create_New_Space() {
		assertEquals("Create new space", privateSpacePage.getCreateNewSpaceText());
	}

	@Then("I click on Private Button")
	public void I_click_on_Private_Button() {
		privateSpacePage.PrivateSpaceclick();
	}

	@Then("Verify search box put space name and enter")
	public void verify_search_box_put_space_name_and_enter() {
		privateSpacePage.SearchBoxclick("AtikSpace");
	}

	@Then("I click on Burger Menu")
	public void i_click_on_Burger_Menu() {
		privateSpacePage.Bargermenuclick();
	}

	@Then("I click Delete Space")
	public void i_click_Delete_Space() {
		privateSpacePage.DeleteSpacelick();
	}

}
