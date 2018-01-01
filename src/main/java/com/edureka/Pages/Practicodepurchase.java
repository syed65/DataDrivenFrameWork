package com.edureka.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.edureka.CommonMethods.CommonMeths;

public class Practicodepurchase {

	public static WebElement element;
	
	public static void signUpButton(String propertyName) throws Exception{
		CommonMeths.handlingClicks(propertyName).click();
	}

}
