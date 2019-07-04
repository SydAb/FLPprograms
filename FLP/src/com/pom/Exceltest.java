package com.pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/com/Excel/Excell.java");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		 XSSFRow row = sheet.getRow(0);
		 XSSFCell cell = row.getCell(0);
		 
		 
		 System.out.println(cell.getStringCellValue());
		// System.out.println(sheet.getRow(0).getCell(0));
	
		 workbook.close();


	}

}
