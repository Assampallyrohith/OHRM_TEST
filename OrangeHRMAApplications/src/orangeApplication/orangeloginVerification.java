package orangeApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeloginVerification 
{
public static void main(String[] args) //throws InterruptedException when we use it 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
ChromeDriver chromeBrowser =new ChromeDriver();
chromeBrowser.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
 String orangeapplication="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	 String getcurrenturl  ="  orangeapplication";
	 System.out.println("the current url of the orange application is"+getcurrenturl);
	//<input name="txtUsername" id="txtUsername" type="text">
	 chromeBrowser.findElement(By.id("txtUsername")).sendKeys("rohith");
	// Thread.sleep(2000);from naveen said and brack for 2 sec
	// chromeBrowser.findElement(By.name("txtUsername")).sendKeys("naveen");
	 //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	chromeBrowser.findElement(By.id("txtPassword")).sendKeys("Rohith@9697");
	// chromeBrowser.findElement(By.name("txtPassword")).sendKeys("rohith");
	 //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	// chromeBrowser.findElement(By.id("btnLogin")).click();
	 chromeBrowser.findElement(By.className("button")).click();
	 
}
}