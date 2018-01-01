package com.edureka.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edureka.CommonMethods.CommonMeths;

public class MembershipPricing {
	
	public static WebElement element;
	public static String priceMember;
	
	public static String getMemberprice(String propertyName) throws Exception{
		priceMember = CommonMeths.fetchValues(propertyName);
		return priceMember;
	}
	
	public static void joinnowButton(String propertyName) throws Exception{
		CommonMeths.handlingClicks(propertyName).click();
	}
}
