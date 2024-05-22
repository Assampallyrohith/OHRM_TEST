package orangeApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_userdefinedmethod 
{
WebDriver driver;
String applicationurl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	public void lunchthebrowser() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
	driver=new ChromeDriver();
	
	driver.get(applicationurl);
	
	}
	public void closetheapplication()
	{
		driver.close();
	}
	public static void main(String[] args) {
		base_userdefinedmethod base=new base_userdefinedmethod();
		base.lunchthebrowser();
		base.closetheapplication();
	}
}
