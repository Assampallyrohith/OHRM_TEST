package os__university;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class screenshot_file
{
	
	WebDriver driver;
	 String applicationurl=("https://www.osmania.ac.in/");

public void screenshot() throws IOException, InterruptedException 
{
	
	By selectLanguagesProperty=By.id("gtranslate_selector");

	WebElement selectLanguagesDropDown=driver.findElement(selectLanguagesProperty);

	

    By languagesProperty=By.tagName("option");

    List<WebElement>selectLanguages =selectLanguagesDropDown.findElements(languagesProperty);

    

    int selectlanguageCount=selectLanguages.size();

    System.out.println("The Number of Languages in the Select Language DropDown are :- "+selectlanguageCount);



    

    for(int arrayIndex=0;arrayIndex<selectlanguageCount;arrayIndex++)

    {



    String language=selectLanguages.get(arrayIndex).getText();



    selectLanguages.get(arrayIndex).click();

    

    Thread.sleep(3000);



    System.out.println(language);

    

    

    File OUSelectlanguageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    FileUtils.copyFile(OUSelectlanguageScreenShot, new File("./src/application_screenshot"+language+".png"));

    }

    }

    




	public static void main(String[] args) throws IOException, InterruptedException

    {

    	screenshot_file languages = new screenshot_file();

    	languages.screenshot();
    	

    }


}
	

