package com.edureka.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class Locators {

	public static Properties prop;
	
	public Locators(String propertyfilepath) throws Exception{
		prop = new Properties();
		File f = new File(propertyfilepath);
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		fis.close();
		
	}
	
	public static By getLocators(String propertyType) throws Exception{ // propertyName = firstName
		String propertyValue = prop.getProperty(propertyType); //propertyValue = xpath://[@id=1234]
		String locatorType = propertyValue.split(":")[0]; //locatorType = xpath
		String locatorValue = propertyValue.split(":")[1]; //locatorvalue = //[@id=1234]
		
		if (locatorType.equalsIgnoreCase("id")) {
			return By.id(locatorValue);
		} else if (locatorType.equalsIgnoreCase("Name")) {
			return By.name(locatorValue);
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			return By.xpath(locatorValue);  //by.xpath("//[@id=1234]")
		} else if (locatorType.equalsIgnoreCase("Linktext")) {
			return By.linkText(locatorValue);
		} else if (locatorType.equalsIgnoreCase("partiallinktext")) {
			return By.partialLinkText(locatorValue);
		} else if (locatorType.equalsIgnoreCase("tagname")) {
			return By.tagName(locatorValue);
		} else if (locatorType.equalsIgnoreCase("CssSelector")) {
			return By.cssSelector(locatorValue);
		} else {
			throw new Exception("No such locator type exists");
		}
			
	}
}
