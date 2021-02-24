package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {

	public static WebDriver driver;
	
	@FindBy (xpath="//input[@name='check_all']")
	private WebElement checkAllBox;
	
	@FindBy (xpath="//input[@name='cancelall']")
	private WebElement cancelSelectedBtn;
	
	@FindBy (xpath="//input[@name='logout']")
	private WebElement logoutBtn;

	public BookedItinerary(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckAllBox() {
		return checkAllBox;
	}

	public WebElement getCancelSelectedBtn() {
		return cancelSelectedBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	
	
}
