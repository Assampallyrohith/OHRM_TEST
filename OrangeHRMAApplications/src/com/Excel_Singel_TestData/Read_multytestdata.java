package com.Excel_Singel_TestData;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Read_multytestdata 
{
public static void main(String[] args) throws IOException 
{
	
	FileInputStream excelfile = new FileInputStream("C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\Excel_singel_testdata\\readmultytestdata.xlsx");
	//*******************not compepleted***************//
	XSSFWorkbook book = new XSSFWorkbook(excelfile);
	XSSFSheet sheetofaworkbook =  book.getSheet("sheet1");
	int rowofthesheet=sheetofaworkbook.getLastRowNum();
	for( int rowbox=0;rowbox<=rowofthesheet;rowbox++)
	{
		//System.out.println("the rowbox is "+rowbox);
	
	 XSSFRow rowofasheet=sheetofaworkbook.getRow(rowbox);
	 int rowcount =rowofasheet.getLastCellNum();
	 for(int rowindex=0;rowindex<rowcount;rowindex++)
	 {
		// System.out.println("the value of the "+rowcount);
		 
	 
	  XSSFCell cellofarow= rowofasheet.getCell(rowindex);
	 String valueofacell=cellofarow.getStringCellValue();
	  
	System.out.println(valueofacell);
	System.out.println("=================================================");
	  
	}
}
}
}