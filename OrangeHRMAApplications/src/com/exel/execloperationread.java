package com.exel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class execloperationread 
{
	public  void logintest() throws IOException
	{
		 FileInputStream file = new FileInputStream("R:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\Excel_singel_testdata\\orangehrm.testdata.xlsx");
		 XSSFWorkbook workbook =new XSSFWorkbook("file");
		 XSSFSheet sheetofaworkbook =  workbook.getSheet("sheet1");
		 XSSFRow sheetofarow  = sheetofaworkbook.getRow(2);
	 XSSFCell rowofacell = sheetofarow.getCell(1);
	 rowofacell.setCellValue("the data of the excel");
	}
}

