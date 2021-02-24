package com.automation.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browser) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

				driver = new ChromeDriver();

			}

			else if (browser.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");

				driver = new InternetExplorerDriver();

			}

			else if (browser.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

				driver = new FirefoxDriver();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void getUrl(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void close() {

		driver.close();

	}

	public static void quit() {

		driver.quit();
	}
	
	
	

	public static void dropdown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("index")) {

			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
			
		}

		else if (type.equalsIgnoreCase("value")) {

			s.selectByValue(value);
			
		}

		else if (type.equalsIgnoreCase("visibletext")) {

			s.selectByVisibleText(value);
			
		}

	}


}
