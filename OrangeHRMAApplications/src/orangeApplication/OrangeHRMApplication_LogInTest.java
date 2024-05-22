package orangeApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplication_LogInTest 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
ChromeDriver chromeBrowser = new ChromeDriver();
	chromeBrowser.get("http://instagram.com");
	 String instagramhomepageTitle=chromeBrowser.getTitle();
	 System.out.println("the titel on amozon is:-"+chromeBrowser.getTitle());
	 chromeBrowser.quit();
	 
	
}
}
