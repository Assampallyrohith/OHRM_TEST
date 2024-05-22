package orangeApplication;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class userdefinedmethod_inOHRM_inExceloperation extends base_userdefinedmethod
{
	public void login() throws IOException{
FileInputStream file= new FileInputStream("C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\Excel_singel_testdata\\readmultytestdata.orangeapplication.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheet("sheet1");
XSSFRow row = sheet.getRow(1);
/*  int rowofasheet =row.getl; 
XSSFCell cell =row.getCell(0);
int cell*/





	}
}
