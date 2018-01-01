package com.edureka.ConstantValues;

import com.edureka.Utilities.Excelreadwrite;

public class ConstantVariables {

	public static final String chromedriverPath = "D:\\Selenium3.0\\chromedriver_win32\\chromedriver.exe";
	public static final String firefoxdriverPath = "D:\\Selenium3.0\\geckodriver-v0.11.1-win64\\geckodriver.exe";
	public static final String excelPath = "D:\\Workspace_17June\\DataDrivenFramework_Final\\src\\main\\java\\com\\edureka\\ForFramework.xlsx";
	public static final String propertyFilePath = "D:\\Workspace_17June\\DataDrivenFramework_Final\\src\\main\\java\\com\\edureka\\Locators.properties";
	public static final String evidences = "D:\\Workspace_17June\\DataDrivenFramework_Final\\Evidences\\";
	public static final String browsertoTestin = Excelreadwrite.readexcelValues("TestData", 1, 4);
	public static final String uRL = Excelreadwrite.readexcelValues("TestData", 2, 4);
	public static final String usrName = Excelreadwrite.readexcelValues("TestData", 8, 4);
	public static final String emailID = Excelreadwrite.readexcelValues("TestData", 9, 4);
	public static final String password = Excelreadwrite.readexcelValues("TestData", 10, 4);
	public static final String confirmPassword = Excelreadwrite.readexcelValues("TestData", 11, 4);
	public static final String firstName = Excelreadwrite.readexcelValues("TestData", 12, 4);
	public static final String lastName = Excelreadwrite.readexcelValues("TestData", 13, 4);;
	public static final String company = Excelreadwrite.readexcelValues("TestData", 14, 4);
	public static final String street = Excelreadwrite.readexcelValues("TestData", 15, 4);
	public static final String country = Excelreadwrite.readexcelValues("TestData", 16, 4);
	public static final String city = Excelreadwrite.readexcelValues("TestData", 18, 4);
	public static final String zipCode = Excelreadwrite.readexcelValues("TestData", 19, 4);
	public static final String state = Excelreadwrite.readexcelValues("TestData", 17, 4);
	public static final String sheetname = "TestData";
}
