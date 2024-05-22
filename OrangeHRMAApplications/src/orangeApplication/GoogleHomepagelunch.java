package orangeApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomepagelunch 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
	 ChromeDriver chromebrowser=new ChromeDriver();
	 chromebrowser.get("http:/google.com");
	 chromebrowser.navigate().to("https:/amazon.in");
	 chromebrowser.navigate().to("https:/bink.com");
	// chromebrowser.close();
chromebrowser.quit();
	
	
	
}
}
