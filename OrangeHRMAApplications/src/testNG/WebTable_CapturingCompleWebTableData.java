package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class WebTable_CapturingCompleWebTableData extends base_testNG{
	@Test
	public void capturingCompleWebTableData() throws IOException
	{

	// First Row of First Cell Property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]


	// Last Row of Last Cell Property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		FileInputStream file= new FileInputStream("R:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\Excel_singel_testdata\\time&date.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook("file");
		XSSFSheet sheet = workbook.getSheet("sheet1");
		 XSSFRow rowofasheet=sheet.getRow(1);

	// To goto every Row
	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
	XSSFCell	cellofarow=rowofasheet.getCell(rowIndex);
	 
	
	// to goto every Row of all its Corresponding Cells
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{
	By webTableDataProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+rowOfCellIndex+"]");
	WebElement webTableData=driver.findElement(webTableDataProperty);
	String webTableDataText=webTableData.getText();
	System.out.print(webTableDataText+" | ");
	 cellofarow.setCellValue(webTableDataText);

	}
	System.out.println();
	}
FileOutputStream rohith =new FileOutputStream("R:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\Excel_singel_testdata\\time&date.xlsx");
workbook.write(rohith);
	}
//******************getting error****************//
}
