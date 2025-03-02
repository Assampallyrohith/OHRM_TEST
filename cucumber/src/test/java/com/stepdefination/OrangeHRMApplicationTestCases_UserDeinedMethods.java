package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationTestCases_UserDeinedMethods 
{
public static WebDriver driver;
public String applicationUrlAddress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";


@Given("^User Should Open a Brower in the System$")
public void user_Should_Open_a_Brower_in_the_System() throws Throwable 
{
	System.setProperty("webdriver.chrome.driver", "R:\\Users\\rohit\\eclipse-workspace\\cucumber\\browserDriveFile\\chromedriver (1).exe");
	driver = new ChromeDriver();
}

@When("^User should enter valid Application Url Address$")
public void user_should_enter_valid_Application_Url_Address() throws Throwable 
{
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();

	Log.info("************Successfully Launched OrangeHRM Application ************");

}

@Then("^User should be able to Navigate to the OrangeHRM Application LogIn Page$")
public void user_should_be_able_to_Navigate_to_the_OrangeHRM_Application_LogIn_Page() throws Throwable 
{
	// Validating OrangeHRM Application LogIn Page
	// Expected Title should be - OrangeHRM


	String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM";
	System.out.println(" The expected Title of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageTitle);


	String actual_OrangeHRMApplicationLogInPageTitle=driver.getTitle();
	System.out.println(" The actual Title of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageTitle);

	if(actual_OrangeHRMApplicationLogInPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
	{
	System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
	}
	else
	{
	System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
	}

	System.out.println();
	// Expected Url Address shold have - orangehrm-4.2.0.1


	String expected_OrangeHRMApplicationLogInPageUrlAddress="orangehrm-4.2.0.1";
	System.out.println(" The Expected URL address of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageUrlAddress);

	String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();
	System.out.println(" The Actual URL address of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageUrlAddress);

	if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains(expected_OrangeHRMApplicationLogInPageUrlAddress))
	{
	System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
	}
	else
	{
	System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
	}

	System.out.println();

	// Expected LogIN Page TEXT - LOGIN Panel

	String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	System.out.println(" The Expected TEXT of the OrangeHRM Application LogIN page is :- "+expected_OrangeHRMApplicationLogInPageText);

	// id="logInPanelHeading"
	By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");
	WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);

	String actual_OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();

	System.out.println(" The Acutal Text of OrangeHRM Application LogIn Page TEXT is :- "+actual_OrangeHRMApplicationLogInPageLogInPanelText);

	if(actual_OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
	System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");
	}
	else
	{
	System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");
	}

    
}

@Then("^User should close the Browser along with the Application$")
public void user_should_close_the_Browser_along_with_the_Application() throws Throwable 
{
	driver.quit();
	Log.info("******* OrangeHRM Application Closed Successfully ************");
 
}


}


