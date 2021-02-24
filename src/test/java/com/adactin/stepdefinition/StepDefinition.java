package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.runner.Runner;
import com.automation.baseclass.Base_Class;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class {

	public static WebDriver driver = Runner.driver;

PageObjectManager pom = new PageObjectManager(driver);
	
	@Before
private void beforeHooks() {
	// TODO Auto-generated method stub

}


	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		// getUrl("http://adactinhotelapp.com/");

		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();

		getUrl(url);

	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		inputValueElement(pom.get_Login().getUserName(), username);

	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {

		inputValueElement(pom.get_Login().getPassword(), password);

	}

	@Then("^user Click On The Login Button And It Navigates To The SearchHotelPage$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage() throws Throwable {

		clickOnElement(pom.get_Login().getLoginBtn());

	}

	
	
	
	
}
