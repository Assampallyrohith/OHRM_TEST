package user_defined_orangeappliacation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orange_application_using_mainmethod 
{
	WebDriver driver;
public static void main (String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	 String appliacationurl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	 
	driver.get(appliacationurl);
	
	String  expected_titelofohrm="OrangeHRM";
	
	 String actual_titelofOHRM=driver.getTitle();
	 
	if(actual_titelofOHRM.equals(expected_titelofohrm))
	{
		System.out.println("the titel of the orange applaication is pass :-"+actual_titelofOHRM);
	}
	
	else
		
	{
	
		System.out.println("the titel of the orange application is fail :-"+expected_titelofohrm);
	}
	String Expected_urlofOHRM="orangehrm-4.2.0.1";
	
	String Actual_urlofOHRM=driver.getCurrentUrl();
	
	if(Actual_urlofOHRM.contains(Expected_urlofOHRM))
	{
		System.out.println("the url of the orange appliacation is pass"+Actual_urlofOHRM);
	}
	else
	{
		System.out.println("the url of the orange application is fail"+Expected_urlofOHRM);
	}
	String Expected_loginpanel="LOGIN Panel";
	
	//<div id="logInPanelHeading">LOGIN Panel</div>
	  By loginpanelproperty=By.id("logInPanelHeading");
	  
	 WebElement loginpanel =driver.findElement(loginpanelproperty);
	 String Actual_loginpanel=loginpanel.getText();
	 if(Actual_loginpanel.contains(Expected_loginpanel))
		 
	 {
		 System.out.println("the login panel of the ORHM is pass"+Actual_loginpanel);
	 }
	 else 
	 {
		System.out.println("the login panel of the ORHM is fail"+Expected_loginpanel);
	} 
	 //<input name="txtUsername" id="txtUsername" type="text">
	  String usernametestdata="rohith";
	  By usernameproperty=By.name("txtUsername");
	 WebElement username =driver.findElement(usernameproperty);
	 username.sendKeys(usernametestdata);
	 
	 //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	  String passwordtestdata="Rohith@9989";
	By  passwordproperty =By.id("txtPassword");
	WebElement password =driver.findElement(passwordproperty);
	password.sendKeys(passwordtestdata);
	 
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	By loginproperty=By.id("btnLogin");
 WebElement loginbutton =driver.findElement(loginproperty);
 loginbutton.click(); 
 
 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
 
  By pimproperty=By.id("menu_pim_viewPimModule");
	WebElement pim =driver.findElement(pimproperty);
	
	Actions pims =new Actions(driver);
	pims.moveToElement(pim).build().perform();
	 
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
	
	By addemploye=By.id("menu_pim_addEmployee");
	WebElement  addemployprpoerty =driver.findElement(addemploye);
	addemployprpoerty.click();
	
	//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	 String firsttestdata="rohith";
	By firstproperty =By.name("firstName");
	  WebElement first=driver.findElement(firstproperty);
	  first.sendKeys(firsttestdata);
	  
	  //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
	  String secondtestdata= "kumar";
	   By second =By.name("middleName");
	  WebElement  seconds =driver.findElement(second);
	  seconds.sendKeys(secondtestdata);
	  
	  //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
	  String  thirdtestdata  ="assampelli";
	  By  third =By.name("lastName" );
	 WebElement thirds =driver.findElement(third);
	 thirds.sendKeys(thirdtestdata);
	 
	 
	  //<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
	 By empolyeid=By.name("employeeId");
	 WebElement employedidproperty =driver.findElement(empolyeid);
	  String employeids=employedidproperty.getAttribute("value");
	  System.out.println("the value of the empolyed id is "+employeids);
	  
	  //<input type="button" class="" id="btnSave" value="Save">
	   By saveproprety=By.id("btnSave");
	   WebElement savebutton=driver.findElement(saveproprety);
	  savebutton.click();
	  
	 String  expected_firstname="rohith";
	  //<input value="rohith" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
	 String firsttestdata1="rohith";
		By firstproperty1 =By.name("personal[txtEmpFirstName]");
		  WebElement first1=driver.findElement(firstproperty1);

	String   actual_firstdata=firsttestdata1;
	
		  if(actual_firstdata.equals(expected_firstname))
		  {
			  System.out.println("after save the first name in employee list pass"   +actual_firstdata);
		  }
		  else 
		  {
			  System.out.println("after save the first name in employee list fail"+expected_firstname);  
		  }
		 String  expected_middelname="kumar";
//<input value="kumar" type="text" name="<input value="kumar" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
			By secondproperty =By.name("personal[txtEmpMiddleName]");
			 WebElement second2=driver.findElement(secondproperty);
			String  actual_second=expected_middelname ;
			 if(actual_second.equals(expected_middelname))
			 {
				 System.out.println("after save the middel name in employee list pass"  +actual_second);
			 }
			 else
			 {
				 System.out.println("after save the middel name in employee list fail"+expected_middelname);
			 }
//<input value="assampelli" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">			 
			String	expected_lastname="assampelli";	 
			 String  thirdtestdata1  ="assampelli";
			  By  third1 =By.name( "personal[txtEmpLastName]");
			 WebElement thirds1 =driver.findElement(third1);
			String actual_lastname=expected_lastname; 
			 if(actual_lastname.equals(expected_lastname))
			 {
				 System.out.println("after save the last name in employee list pass"   +actual_lastname);
			 }
			 else
			 {
				 System.out.println("after save the last name in employee list fail"+expected_lastname);
			 }
//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>			 
			 By welcomeproperty=By.id("welcome");
			WebElement welcomelink=driver.findElement(welcomeproperty);
			welcomelink.click();
	Thread.sleep(3000);
//<li><a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a></li>
			By logoutproperty=By.linkText("Logout");
			WebElement	logoutlink=driver.findElement(logoutproperty);
			logoutlink.click();
	
	
}
}

