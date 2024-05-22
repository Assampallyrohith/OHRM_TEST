package com.Excel_Singel_TestData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_multydata_practice 
{
	public static void main(String[] args) throws IOException {
		
	
	FileInputStream excelfile = new FileInputStream("C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\Excel_singel_testdata\\readmultytestdata.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(excelfile);
	XSSFSheet sheetofaworkbook = workbook.getSheet("sheet1");
	 XSSFRow row_ofa_sheet=sheetofaworkbook.getRow(0);
	 XSSFCell rowofacell=row_ofa_sheet.getCell(0);
	 rowofacell.setCellValue("rohith");
	FileOutputStream testdataresultfile =new FileOutputStream("R:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\write_operationsusingexcel\\write_operation_singel.java");
	workbook.write(testdataresultfile);
}
}
