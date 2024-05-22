package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class operating_oOhrm 
{
	 WebDriver driver;
public static void main(String[] args) throws InterruptedException 
{
	 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
    WebDriver driver = new ChromeDriver();
    
    String applicationurl=("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
    driver.get(applicationurl);
   String  expected_titeloftheorhm=("OrangeHRM");
    String Actual_titeloftheorhm=driver.getTitle();
	    if(Actual_titeloftheorhm.equals(expected_titeloftheorhm)) 
	    {
	    	System.out.println("the titel of the ohrm is pass"+expected_titeloftheorhm);
	    }
	    else
	    {
	    	System.out.println("the titel of the ohrm is fail"+Actual_titeloftheorhm);
	    }
    String Expected_urloftheorhm=("orangehrm-4.2.0.1");
    String Actual_urloftheorhm=driver.getCurrentUrl();
	    if( Actual_urloftheorhm.contains(Expected_urloftheorhm)) 
	    {
	    	System.out.println("the url of the ohrm is pass"+Expected_urloftheorhm);
	    }
	    else
	    {
	    	System.out.println("the url of the ohrm is fail"+Actual_urloftheorhm);
	    }
  String  Expected_textoftheloginpanel=("LOGIN Panel");
   
   //<div id="logInPanelHeading">LOGIN Panel</div>
  By loginpanel =By.id("logInPanelHeading");
  WebElement  loginpannel=driver.findElement(loginpanel);
    	
  String Actual_textoftheloginpanel=loginpannel.getText();
    if(Actual_textoftheloginpanel.equals(Expected_textoftheloginpanel))
    {
    	System.out.println("the text  of the login panel is pass"+Actual_textoftheloginpanel);
    }
    else
    {
     System.out.println("the text of login panel is fail "+Expected_textoftheloginpanel);	
    }
    //<input name="txtUsername" id="txtUsername" type="text">
    
   		 String username="rohith";
   		 By usernameproperty= By.id("txtUsername");
         WebElement 	usernames=driver.findElement(usernameproperty);
         usernames.sendKeys(username);
         
   	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
         
        String 	password ="Rohith@9989";
        By passwordproperty =By.name("txtPassword");
        WebElement passwords =driver.findElement(passwordproperty);
       	passwords.sendKeys("Rohith@9989");
       	
   	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
       	
      By loginporperty = By.id("btnLogin");
       WebElement loginbutton=driver.findElement(loginporperty);
       loginbutton.click();
      
       
       String expected_titelofthe = ("OrangeHRM");
       String actual_titelofthe=driver.getTitle();
       if(actual_titelofthe.equals(expected_titelofthe))
       {
    	   System.out.println("the titel of the ohrm is pass "+actual_titelofthe);
       }
       else 
       {
    	  System.out.println("the titel of the ohrm is fail "+expected_titelofthe); 
       }
       String expected_urlofthe=("orangehrm-4.2.0.1");
       String actual_urlofthe=driver.getCurrentUrl();
       if(actual_urlofthe.contains(expected_urlofthe))
       {
    	   System.out.println("the url of the ornage appliaction is pass" +actual_urlofthe);
       }
       else 
       {
    	   System.out.println("the url of the ornage appliaction is fail"+ expected_urlofthe);
       }
       
       //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
     By welcome =By.linkText("Welcome Admin");
       WebElement welcomeadminproperty=driver.findElement(welcome);
       welcomeadminproperty.click();
       
       Thread.sleep(2000);
       
       
       //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
      By logoutproperty =By.linkText("Logout");
     WebElement logoutpropertys=driver.findElement(logoutproperty);
     logoutpropertys.click();
}
}
