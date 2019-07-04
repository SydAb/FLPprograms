package com.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfile {

	public static void main(String[] args) throws IOException {


        FileInputStream file = new FileInputStream("./Excelfiles/Syedsel.xlsx");
        
        XSSFWorkbook book = new XSSFWorkbook(file);
        
        XSSFSheet sheet = book.getSheet("Sheet1");
        
        Row row = sheet.getRow(0);
        
        org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
        
        String val = cell.getStringCellValue();
        
        System.out.println(val);
	
        sheet.getRow(0).createCell(1).setCellValue("Abrar");

        FileOutputStream fil = new FileOutputStream("./Excelfiles/Writefile.xlsx");
	    book.close();
	    
	    
	    
	    
	    

	}

}
