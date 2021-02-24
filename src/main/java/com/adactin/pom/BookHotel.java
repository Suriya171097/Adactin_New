package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement creditCardNo;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement creditCardType;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expiryMonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expiryYear;
	
	@FindBy (xpath = "//input[@name='cc_cvv']")
	private WebElement cvvNumber;
	
	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	@FindBy(xpath="//input[@name='book_now']")
	private WebElement bookNowBtn;

	public BookHotel(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	
}
