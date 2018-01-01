package com.edureka.CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.edureka.ConstantValues.ConstantVariables;
import com.edureka.Pages.LandingPage_Home;
import com.edureka.Utilities.Locators;
import com.edureka.Utilities.Log;
import com.edureka.Utilities.Screenshots;

public class CommonMeths {

	public static WebDriver driver;
	public static WebElement element;
	public static String price;
	
	public static WebDriver browserType(String bName) throws Exception{
		try {
			if (bName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ConstantVariables.chromedriverPath );
				driver = new ChromeDriver();
		} else if (bName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ConstantVariables.firefoxdriverPath);
				driver = new FirefoxDriver();
		} else if (bName.equalsIgnoreCase("internetexplorer")) {
				driver = new InternetExplorerDriver();
		}
			Log.info("Browser name found");
		} catch (Exception e) {
			Log.error("Browser not found");
			Screenshots.getScrrenshot((TakesScreenshot) driver, bName);
		}
			return driver;
		  	}

	  public static void openBrowser(String uRL) throws Exception{
		  try {
			  driver.get(uRL);
			  driver.manage().window().maximize();
			  Log.info("Website openend");
			
		} catch (Exception e) {
			Log.error("Website not opened");
			Screenshots.getScrrenshot((TakesScreenshot) driver, "website");
		}
	  }

	  public static WebElement handlingHoversing_WithoutClick(String propertyName) throws Exception{
		  try {
			  element = driver.findElement(Locators.getLocators(propertyName));
			  Actions act = new Actions(driver);
			  Action a_MemMenu = act.moveToElement(element).build();
			  a_MemMenu.perform();
			  Log.info("hovered over the webelement --->" + propertyName);
		} catch (Exception e) {
			Screenshots.getScrrenshot((TakesScreenshot) driver, propertyName);
			  Log.error("Not able to hover over the webelement --->" + propertyName);
		}
		  return element;
	  }
	  
	  public static WebElement handlingHovering_WithClick(String propertyName) throws Exception{
		  try {
			  element = driver.findElement(Locators.getLocators(propertyName));
			  Actions act = new Actions(driver);
			  Action b_join = act.moveToElement(element).click().build();
			  b_join.perform();
			  Log.info("hovered and clicked over the webelement --->" + propertyName);			
		} catch (Exception e) {
			  Log.error("Not able to hover and click the webelement --->" + propertyName);
			Screenshots.getScrrenshot((TakesScreenshot) driver, propertyName);
		}
		  return element;
	  }	  
	  
		public static WebElement handlingTextboxes(String propertyName) throws Exception{
			try {
				element = driver.findElement(Locators.getLocators(propertyName));
				  Log.info("Entered text successfully in --->" + propertyName);
			} catch (Exception e) {
				Log.info("Not able to Enter text in --->" + propertyName);
				Screenshots.getScrrenshot((TakesScreenshot) driver, propertyName);
			}

			return element;
			}

		public static WebElement handlingClicks(String propertyName) throws Exception{
			try {
				WebDriverWait wait = new WebDriverWait(driver, 40);
				element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.getLocators(propertyName))));
				  Log.info("Successfully clicked on webelement --->" + propertyName);
			} catch (Exception e) {
				Screenshots.getScrrenshot((TakesScreenshot) driver, propertyName);
				Log.error("Not able to click on --->" + propertyName);
			}
			return element;
			}
		
		public static WebElement handlingDropdowns(String propertyName, String name) throws Exception{
			try {
				element = driver.findElement(Locators.getLocators(propertyName));
				Select state = new Select(element);
				state.selectByVisibleText(name);
				  Log.info("Successfully selected value from dropdown --->" + propertyName);
			} catch (Exception e) {
				Screenshots.getScrrenshot((TakesScreenshot) driver, propertyName);
				  Log.error("Not able to select value from dropdown --->" + propertyName);
			}
			return element;
			}
		
		public static String fetchValues(String propertyName) throws Exception{
			try {
				price = driver.findElement(Locators.getLocators(propertyName)).getText();	
				  Log.info("Successfully fetected the value --->" + propertyName);
			} catch (Exception e) {
				Screenshots.getScrrenshot((TakesScreenshot) driver, propertyName);
				Log.error("Not able to fetect the value --->" + propertyName);
			}
			
			return price;
		}
		
		public static void closeBrowser() throws Exception{
			try {
				driver.quit();	
				  Log.info("Successfully closed the browser");
			} catch (Exception e) {
				Screenshots.getScrrenshot((TakesScreenshot) driver, "closebrs");
				Log.error("Not able to close the browser");
			}
			
		}
}
