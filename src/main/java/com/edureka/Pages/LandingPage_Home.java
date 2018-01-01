package com.edureka.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.edureka.CommonMethods.CommonMeths;
import com.edureka.ConstantValues.ConstantVariables;

public class LandingPage_Home {

	public static void membershipMenu_Hovering(String propertyName) throws Exception{
		  CommonMeths.handlingHoversing_WithoutClick(propertyName);
	  }
	  
	  public static void joinMembership_Hovering(String propertyName) throws Exception{
		  CommonMeths.handlingHovering_WithClick(propertyName);
	  }	  
	
	  public static void resourceMenu_Hovering(String propertyName) throws Exception{
		  CommonMeths.handlingHoversing_WithoutClick(propertyName);
	  }
	  
	  public static void practicodeMenu_Hovering(String propertyName) throws Exception{
		  CommonMeths.handlingHovering_WithClick(propertyName);
	  }

}
