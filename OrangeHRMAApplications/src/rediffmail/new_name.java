package rediffmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class new_name  extends Base_test
{
@Test(priority=1)	
public static void click_on_create_new_account()
{
//  <a href="//register.rediff.com/register/register.php?FormName=user_details"
	//  title="Create new Rediffmail account"><u>Create a new account</u></a>
	By Createnewproperty=By.linkText("Create a new account");
	 WebElement Createnew =driver.findElement(Createnewproperty);
	 Createnew.click();
	 
}
@Test(priority=2)
public static void enter_fullname()
{
	//<input type="text" onblur="fieldTrack(this);" name="name36c27c7d" value="" style="width:185px;" maxlength="61">
		 By nameproperty =By.xpath("//input[@type='text']");
		 WebElement name = driver.findElement(nameproperty);
		 name.sendKeys("rohith");
		 
}

}
