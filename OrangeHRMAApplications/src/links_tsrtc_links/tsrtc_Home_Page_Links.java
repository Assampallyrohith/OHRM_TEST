package links_tsrtc_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tsrtc_Home_Page_Links 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://tsrtconline.com"); 
	//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
	//<a class="tabcopy" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
	 By tsrtclinksproperty=By.tagName("a");
	  List<WebElement> rohith =driver.findElements(tsrtclinksproperty);
	   int tsrtclinks=rohith.size();
	 System.out.println(tsrtclinks);
	 driver.close();
	 
	 
	 
	 
	 

}
}
