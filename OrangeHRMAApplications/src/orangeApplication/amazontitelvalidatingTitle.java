package orangeApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class amazontitelvalidatingTitle 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
	 ChromeDriver chromeBrowser = new ChromeDriver();
	 chromeBrowser.get("http://amazon.in");
	String expected_amazonHomePageTitel="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"; // should be
	String Actual_amazonHomePageTitel="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	if(expected_amazonHomePageTitel.equals(Actual_amazonHomePageTitel))
	{
		System.out.println("the titel should be as per expectd is pass"+expected_amazonHomePageTitel);
	}
	else
	{
		System.out.println("the titel of the amozon applicatin is fail"+Actual_amazonHomePageTitel);
	}
	chromeBrowser.quit();
}
}
