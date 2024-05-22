package os__university;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_test 
{
WebDriver driver;
public void application_lunch() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe" );
	driver=new ChromeDriver();
	 String applicationurl = "https://www.osmania.ac.in/";
	 driver.get(applicationurl);
	 driver.manage().window().maximize(); 
} 
public void selectdropdown() {
	 By selectproperty=By.id("gtranslate_selector");
	 WebElement selectlink=driver.findElement(selectproperty);
	By  rohith  = By.tagName("option");
	 List<WebElement>  naveen =driver.findElements(rohith);
	 System.out.println(" the application is"+naveen);
}
public void applicationclose()
{
	
driver.close();	 
}
 public static void main(String[] args) throws InterruptedException {
	 base_test b =new base_test();
	 b.application_lunch();
	 b.selectdropdown();
	 //b.applicationclose();
}
}
