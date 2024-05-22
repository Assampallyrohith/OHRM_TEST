package orangeApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class orangeapplicationURL 
{
public static void main(String[] args)
{ //webdriver.chrome.driver system property
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
	ChromeDriver chromeBrowser=new ChromeDriver();
	chromeBrowser.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	
	String orangeapplicationcurrentUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	  String getcurrenntUrl="orangeapplicationcurrentUrl";
	  System.out.println("the url  of the orange application is:-"+getcurrenntUrl);
		 String orangehomepageTitel=chromeBrowser.getCurrentUrl();
		System.out.println("the current url  of the webapplication is:-"+orangehomepageTitel);
		 String expected_orangeapplicationurlis=("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");	
		 String Actual_orangeapplicationurlis=("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		if(expected_orangeapplicationurlis.contains(Actual_orangeapplicationurlis))
		{
			System.out.println("the orange application is pass "+expected_orangeapplicationurlis);
		}
		else
		{
		System.out.println("the orange application is fail"+Actual_orangeapplicationurlis);	
		}
		chromeBrowser.quit();
		
		
}

}
