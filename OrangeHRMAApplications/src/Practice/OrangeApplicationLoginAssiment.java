package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeApplicationLoginAssiment 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
			ChromeDriver chromeBrowser=new ChromeDriver();
			chromeBrowser.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	String	Orangeapplication=chromeBrowser.getCurrentUrl();
	System.out.println("the titel is orange is"+Orangeapplication);
	 String expected_orangeapplicationis=("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	// String Actual_Orangeapplicationis=("https://orangeHRM.com");
	/* if(expected_orangeapplicationis.contentEquals(Actual_Orangeapplicationis))
	 {
		 System.out.println("the orange application is pass"+expected_orangeapplicationis);
	 }
	 else
	 {
		 System.out.println("the orange application is fail"+Actual_Orangeapplicationis);
	 }*/
	 //<input name="txtUsername" id="txtUsername" type="text">
	 chromeBrowser.findElement(By.id("txtUsername")).sendKeys("rohith");
	// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	 chromeBrowser.findElement(By.id("txtPassword")).sendKeys("Rohith@9697");
	 //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	 chromeBrowser.findElement(By.className("button")).click();
	 //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	 chromeBrowser.findElement(By.id("welcome")).click();
	 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	// String  chromeBrowser.get('<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a');
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	 chromeBrowser.findElement(By.name("Logout")).click();
	//chromeBrowser.quit();
			
			
	
			
			
			
			
}
}
		
		
		