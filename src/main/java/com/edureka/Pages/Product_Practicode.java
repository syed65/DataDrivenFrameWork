package com.edureka.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edureka.CommonMethods.CommonMeths;

public class Product_Practicode {
	
	public static WebElement element;
	
	public static void cpcNew(String propertyName) throws Exception{
		CommonMeths.handlingClicks(propertyName);
	}
	
	public static void continueButton(String propertyName) throws Exception{
		CommonMeths.handlingClicks(propertyName).click();
	}
}
