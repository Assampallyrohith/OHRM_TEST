package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation3 {

	@BeforeTest
	public void gmailApplicationLaunch() // this Method is Executed Prior to all the Test Cases
	// it is not a Functionality under Test Statements  

	{
	System.out.println(" ******* Gmail Application Launch Successfully ********" );
	}


	// Any functionality of an application which is under Test Should be always be written using the
//	     TestNG Annotation @Test
	// A Class can be Implemented with any number of Test Cases

	// If a Class contains multiple Test Cases then the Test Cases will be executed Based on the
//	    alphabetical order of the Given Test Case Names

	// If a class contains multiple Test Cases - then the Test cases will be executed based on the
//	      alphabetical Order of the Given Test case Names considering the Upper case letter of the
//	         given test case Names

	@Test(priority=1)
	public void LogInTest()
	{
	System.out.println("  LogIn Functionality Test Successfull ");
	}

	@Test(priority=2)
	public void InBoxTest()
	{
	System.out.println("  InBox Functionality Test Successfull ");
	}

	@Test(priority=3)
	public void composeMailTest()
	{
	System.out.println(" Compose Mail Functionality Test Successfull ");
	}

	@Test(priority=4)
	public void DraftsMailTest()
	{
	System.out.println(" Drafts Mail Functionality Test Successfull ");
	}

	@Test(priority=5)
	public void sentMailTest()
	{
	System.out.println(" Sent Mail Functionality Test Successfull ");
	}

	@AfterTest // This method will be executed after all the Test cases - it is also not a Functionality
	public void gmailApplicationClose()
	{
	System.out.println(" *********** Gmail Application Closed Successfully ****************");
	}
	/*


	  @BeforeTest ... @Test(p-1), @Test(p-2) ...... @AfterTest

	 ******* Gmail Application Launch Successfully ********
	  LogIn Functionality Test Successfull
	  InBox Functionality Test Successfull
	 Compose Mail Functionality Test Successfull
	 Drafts Mail Functionality Test Successfull
	 Sent Mail Functionality Test Successfull
	 *********** Gmail Application Closed Successfully ****************

	   **** Only Status of the Test Cases will be given as Passed of Failed --
	   *  Methods Implemented with @BeforeTest and @AfterTest will not show the status - because they are not
	   *   the Functionalities - but the Methods related Statement written within will be for sure executed ny the TestNG


	*/


	}


