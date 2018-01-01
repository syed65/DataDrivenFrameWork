package com.edureka.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.edureka.CommonMethods.CommonMeths;

public class ShoppingCart {

	public static WebElement element;
	public static String totalCartamount;
	public static String cartPrice;
	public static String newCartprice;
	
	public static String cartPrice(String propertyName) throws Exception{
	cartPrice = CommonMeths.fetchValues(propertyName);  //"$160.00";
	System.out.println(cartPrice);
	String[] newPrice = cartPrice.split("\\.");
	totalCartamount = newPrice[0];
	System.out.println(totalCartamount);
	return totalCartamount;
	}
	

	public static void cartButton(String propertyName) throws Exception{
		CommonMeths.handlingClicks(propertyName).click();
	}
	
	public static void createanAccount(String propertyName) throws Exception{
		CommonMeths.handlingClicks(propertyName).click();
	}

	public static String newCartPrice(String propertyName) throws Exception{
	newCartprice = CommonMeths.fetchValues(propertyName);
	System.out.println(newCartprice);
	return newCartprice;
	}

}
