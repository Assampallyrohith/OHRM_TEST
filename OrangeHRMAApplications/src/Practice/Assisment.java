package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Assisment
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
	ChromeDriver chromeBrowser = new ChromeDriver();
	chromeBrowser.get("http://OrangeHRM.com");
	String orangeapplicationtitle=("http://OrangeHRM.com"); 
	 String getcurrenturl  ="  orangeapplicationtitel";
	//chromeBrowser.getCurrentUrl("orangeapplicationtitel");
	 System.out.println("the titel of the orange application is"+ getcurrenturl);
	 System.out.println("-----------------------------------------------------------");
	String applicatinaurladdress=("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
chromeBrowser.get(applicatinaurladdress);
System.out.println("the application url address is"+applicatinaurladdress);
//<input name="txtUsername" id="txtUsername" type="text">
chromeBrowser.findElement(By.id("txtUsername")).sendKeys("Rohith");
//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
chromeBrowser.findElement(By.name("txtPassword")).sendKeys("Rohith@9697");
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
chromeBrowser.findElement(By.id("btnLogin")).click();
//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
chromeBrowser.findElement(By.id("welcome")).click();
//<li><a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a></li>
Thread.sleep(50000);
//by chromeBrowser.findElement(By.linkText("Logout")).click();
}
}
