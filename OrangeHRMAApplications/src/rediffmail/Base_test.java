package rediffmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_test 
{
	
	static WebDriver driver;
	
	@BeforeTest
	public  static void rediffmail_lunch()
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
		
		WebDriver  driver=new ChromeDriver();
		String applicationredifurl =("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get(applicationredifurl);

}
	@AfterTest
	public static void rediffmail_close()
	{	//WebDriver  driver=new ChromeDriver();
		driver.quit();
	}
	
}
