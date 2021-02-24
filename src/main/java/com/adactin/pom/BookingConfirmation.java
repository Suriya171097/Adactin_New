package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {

	public static WebDriver driver;
	
	@FindBy (xpath="//input[@name='my_itinerary']")
	private WebElement itineraryBtn;

	public BookingConfirmation(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getItineraryBtn() {
		return itineraryBtn;
	}
	
}
