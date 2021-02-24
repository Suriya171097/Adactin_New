package com.automation.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void isEnabled(WebElement element) {

		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

	public static void isSelected(WebElement element) {

		boolean selected = element.isSelected();
		System.out.println(selected);

	}

	public static void isDisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();

		System.out.println(displayed);

	}

	public static void navigateTo(String url) {

		driver.navigate().to(url);

	}

	public static void dropdown(WebElement element, String type, int index , String value, String visibletext) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("index")) {

			s.selectByIndex(index);
			
		}

		else if (type.equalsIgnoreCase("value")) {

			s.selectByValue(value);
			
		}

		else if (type.equalsIgnoreCase("visibletext")) {

			s.selectByVisibleText(visibletext);
			
		}

	}

}
