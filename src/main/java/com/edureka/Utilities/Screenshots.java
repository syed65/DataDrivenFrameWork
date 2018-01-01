package com.edureka.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.edureka.ConstantValues.ConstantVariables;

public class Screenshots {

	public static void getScrrenshot(TakesScreenshot tss, String picname) throws Exception{
		SimpleDateFormat df = new SimpleDateFormat("dd@MM@yy@hh@mm@ss");
		Date d = new Date();
		
		System.out.println(df.format(d));
		String screenshotPath = ConstantVariables.evidences + picname +df.format(d)  + ".JPEG";
		
		File filebrws = new File(screenshotPath);
		File filesrc = tss.getScreenshotAs(OutputType.FILE);
		
		FileUtils.moveFile(filesrc, filebrws);
	}
}
