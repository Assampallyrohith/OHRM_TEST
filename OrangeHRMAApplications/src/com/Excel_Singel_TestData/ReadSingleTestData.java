package com.Excel_Singel_TestData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleTestData {

	
	public static void main(String[] args) throws IOException {
		// Identify the File(Excel File) in the System
		
		FileInputStream file= new FileInputStream("C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\Excel_singel_testdata\\singel data.xlsx");
		// Identify the WorkBook in the File
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet testDataSheet = workbook.getSheet("Sheet1");
		
		Row sheetOfaRow=testDataSheet.getRow(1);
		Cell rowcell = sheetOfaRow .getCell(1);
	      //   cell  row1  sheetOfaRow.getCell(1);
		// sheetOfaRow=testDataSheet.getRow();
		
		 
		 
		
		
		  String gettingsrtingvalue=rowcell.getStringCellValue();
		  System.out.println(gettingsrtingvalue);
		 // System.out.println("--------------------------------------------------");
		  
	}

}
