package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestingBrowsers 
{
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
	 ChromeDriver Rohith=new ChromeDriver();
	 Rohith.get("http:/google.com");
	 
	 //webdriver.chrome.driver
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe" );
	   ChromeDriver naveen = new ChromeDriver();
	   naveen.navigate().to("http:/livetech");
}

}
//webdriver.chrome.driver
