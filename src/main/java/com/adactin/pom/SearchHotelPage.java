package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {

	public static WebDriver driver;
	
	@FindBy (xpath="//select[@name='location']")
	private WebElement locationDropdown;
	
	@FindBy (xpath="//select[@id='hotels']")
	private WebElement hotelDropdown;
	
	@FindBy (xpath="//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy (xpath="//select[@id='room_nos']")
	private WebElement numberOfRooms;

	@FindBy (xpath="//input[@id='datepick_in']")
	private WebElement checkInDate;
	
	@FindBy (xpath="//input[@id='datepick_out']")
	private WebElement checkOutDate;
	
	@FindBy (xpath="//select[@id='adult_room']")
	private WebElement adultPerRoom;
	
	@FindBy (xpath="//select[@id='child_room']")
	private WebElement childrenPerRoom;
	
	@FindBy (xpath="//input[@id='Submit']")
	private WebElement searchBtn;

	public SearchHotelPage(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocationDropdown() {
		return locationDropdown;
	}

	public WebElement getHotelDropdown() {
		return hotelDropdown;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
}
