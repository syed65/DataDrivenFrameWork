package com.edureka.Driverscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.TakesScreenshot;

import com.edureka.CommonMethods.CommonMeths;
import com.edureka.ConstantValues.ConstantVariables;
import com.edureka.Pages.LandingPage_Home;
import com.edureka.Pages.MembershipPricing;
import com.edureka.Pages.RegistrationPage;
import com.edureka.Pages.ShoppingCart;
import com.edureka.Utilities.Excelreadwrite;
import com.edureka.Utilities.Locators;
import com.edureka.Utilities.Log;
import com.edureka.Utilities.Screenshots;

public class Driverscript {

	public static Locators obj;	
	public static void main(String[] args) throws Exception {
		DOMConfigurator.configure("log4j.xml");
		obj = new Locators(ConstantVariables.propertyFilePath);
		Excelreadwrite.excelPath(ConstantVariables.excelPath);
		
//---------------------Scenario 1, Login to website match membership price on product page UI vs Cart page----------------		
		Log.stestCasestart("TC001");
		CommonMeths.browserType(ConstantVariables.browsertoTestin);
		CommonMeths.openBrowser(ConstantVariables.uRL);
		LandingPage_Home.membershipMenu_Hovering("membershipMenu");
		LandingPage_Home.joinMembership_Hovering("joinMembershipLink");
		MembershipPricing.getMemberprice("memberprice");
		MembershipPricing.joinnowButton("joinNowbutton");
		ShoppingCart.cartPrice("cartPrice");
		
		if (MembershipPricing.priceMember.equalsIgnoreCase(ShoppingCart.totalCartamount)) {
		System.out.println("The amount matches with the membership given price");
		} else {
		System.out.println(" The amount not match with mebership proce given");
		}
		Log.sendtestcase();
//	
//-------------------------Scenario 2, Create a new account on website by giving customer details
		Log.stestCasestart("TC002");
		ShoppingCart.cartButton("cartButton");
		ShoppingCart.createanAccount("createAnaccount");
		RegistrationPage.enterUserName(ConstantVariables.usrName,"userName");
		RegistrationPage.enterEmail(ConstantVariables.emailID, "email");
		RegistrationPage.enterPassword(ConstantVariables.password, "password");
		RegistrationPage.enterConfirmPassword(ConstantVariables.confirmPassword, "confirmPassword");
		RegistrationPage.enterFirstname(ConstantVariables.firstName, "firstName");
		RegistrationPage.enterLastname(ConstantVariables.lastName, "lastName");
		RegistrationPage.enterCompany(ConstantVariables.company, "company");
		RegistrationPage.enterStreet(ConstantVariables.street, "street");
		RegistrationPage.enterCountry(ConstantVariables.country, "country");
		RegistrationPage.enterCity(ConstantVariables.city, "city");
		RegistrationPage.enterState(ConstantVariables.state, "state");
		RegistrationPage.zipCode(ConstantVariables.zipCode, "zipCode");
		
		for (int i = 1; i < 10; i++) {
			Excelreadwrite.writeexcelValues(ConstantVariables.sheetname, i, 5, "Pass");
						
		}
		Log.sendtestcase();

//-------------------------Scenario 3, Order a practicode course and add it in the shopping cart		
		
		
	}
}
