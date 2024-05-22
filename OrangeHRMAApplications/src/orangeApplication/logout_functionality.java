package orangeApplication;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class logout_functionality 
{

public static void main(String[] args) throws InterruptedException 
{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
ChromeDriver Driver= new ChromeDriver();
Driver.get("http://orangehrm.com");
 String appliacationurl_address="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
Driver.get(appliacationurl_address);
System.out.println("the current url is"+appliacationurl_address);
String expectedtheurloftheapplicationis=("orangehrm-4.2.0.1");
String actualtheurloftheapplicationis=("\"http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login\"");
if(actualtheurloftheapplicationis.contains(expectedtheurloftheapplicationis))
{
System.out.println("the url off the applicatin is true"+expectedtheurloftheapplicationis);	
}
else
{
System.out.println("the url of the application is false"+actualtheurloftheapplicationis);	
}
//<input name="txtUsername" id="txtUsername" type="text">
String usernametestdata="rohith";
By usernameproperty=By.id("txtUsername");
	WebElement username=Driver.findElement(usernameproperty);
username.sendKeys(usernametestdata);
//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
					/* String passworddatatest=("Rohith@9989");
					 By passwordproperty=By.id("txtPassword");
					  WebElement password =Driver.findElement(passwordproperty);
					password.sendKeys("passworddatatest");*/
Driver.findElement(By.id("txtPassword")).sendKeys("Rohith@9989");
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
By loginbuttonproperty=By.name("Submit");
WebElement  loginbutton=Driver.findElement(loginbuttonproperty);
loginbutton.click();
//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
By welcomeadmin=By.linkText("Welcome Admin");
WebElement welcomeadminlink=Driver.findElement(welcomeadmin);
welcomeadminlink.click();
Thread.sleep(4000);
//<li><a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a></li>
By logoutproperty=By.linkText("Logout");
WebElement logoutbutton=Driver.findElement(logoutproperty);
logoutbutton.click();


 
 
}
}