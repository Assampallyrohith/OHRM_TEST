package com.OHRMAppTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_rohith {
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@BeforeTest
	public void applicationLauch()
	{

	System.setProperty("webdriver.chrome.driver", "R:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	//Thread.sleep(10000);

	}

	@AfterTest
	public void applicationClose()
	{
	driver.close();
	
	}

	

}
