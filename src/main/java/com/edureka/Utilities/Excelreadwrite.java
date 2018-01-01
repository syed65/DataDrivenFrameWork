package com.edureka.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.edureka.ConstantValues.ConstantVariables;

public class Excelreadwrite {

	static XSSFWorkbook wb;
	static XSSFSheet ws;
	static XSSFRow r1;
	static XSSFCell c1;
	
	public static void excelPath(String path) throws Exception{
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
	}
	
	public static String readexcelValues(String sheetName, int rowNumber, int coulumnNumber){
		ws = wb.getSheet(sheetName);
		c1 = ws.getRow(rowNumber).getCell(coulumnNumber);
		if (c1.getCellType() == c1.CELL_TYPE_NUMERIC) {
			String str = NumberToTextConverter.toText(c1.getNumericCellValue());
			return str;
		}
		else {
		String cellValue = c1.getStringCellValue();
		return cellValue;
	}
}	
	public static void writeexcelValues(String sheetname, int rownumber, int columnnnumber, String value) throws Exception{
		ws = wb.getSheet(sheetname);
		c1 = ws.getRow(rownumber).getCell(columnnnumber);
		c1.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(ConstantVariables.excelPath);
		wb.write(fos);
		fos.close();
		wb = new XSSFWorkbook(new FileInputStream(ConstantVariables.excelPath));
	}
}
