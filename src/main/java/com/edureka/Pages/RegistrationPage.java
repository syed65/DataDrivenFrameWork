package com.edureka.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.edureka.CommonMethods.CommonMeths;

public class RegistrationPage {
	
	public static void enterUserName(String name, String propertyName) throws Exception{
		CommonMeths.handlingTextboxes(propertyName).sendKeys(name);
		}

	public static void enterEmail(String name, String propertyName) throws Exception{
		CommonMeths.handlingTextboxes(propertyName).sendKeys(name);
		}
	
	public static void enterPassword(String name, String propertyName) throws Exception{
		CommonMeths.handlingTextboxes(propertyName).sendKeys(name);
		}
	
	public static void enterConfirmPassword(String name, String propertyName) throws Exception{
		CommonMeths.handlingTextboxes(propertyName).sendKeys(name);
		}
	
	public static void enterFirstname(String name, String propertyName) throws Exception{
		CommonMeths.handlingTextboxes(propertyName).sendKeys(name);
		}
	
	public static void enterLastname(String name, String propertyName) throws Exception{
		CommonMeths.handlingTextboxes(propertyName).sendKeys(name);
		}
	
	public static void enterCompany(String name, String propertyName) throws Exception{
		CommonMeths.handlingTextboxes(propertyName).sendKeys(name);
		}
	
	public static void enterStreet(String name, String propertyName) throws Exception{
		CommonMeths.handlingTextboxes(propertyName).sendKeys(name);
		}
	
	public static void enterCountry(String name, String propertyName) throws Exception{
		CommonMeths.handlingDropdowns(propertyName, name);
		}
	
	public static void enterState(String name, String propertyName) throws Exception{
		CommonMeths.handlingDropdowns(propertyName, name);
		}
	
	public static void enterCity(String name, String propertyName) throws Exception{
		CommonMeths.handlingTextboxes(propertyName).sendKeys(name);
		}

	
	public static void zipCode(String name, String propertyName) throws Exception{
		CommonMeths.handlingTextboxes(propertyName).sendKeys(name);
		}

}
