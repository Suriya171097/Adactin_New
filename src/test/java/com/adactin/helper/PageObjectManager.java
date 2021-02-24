package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotelPage;

public class PageObjectManager {

	public static WebDriver driver;

	private LoginPage login;
	private SearchHotelPage hotelSearch;

	public PageObjectManager(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public LoginPage get_Login() {

		login = new LoginPage(driver);
		return login;

	}

	
	public SearchHotelPage get_HotelSearch() {

		hotelSearch= new SearchHotelPage(driver);
		return hotelSearch;
		
	}
	
	
}
