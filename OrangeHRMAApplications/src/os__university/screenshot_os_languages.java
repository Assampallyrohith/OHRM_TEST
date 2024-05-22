package os__university;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class screenshot_os_languages extends base_test

{
public void selectdropdown()
{
	
	//<select onchange="doGTranslate(this);" class="notranslate" id="gtranslate_selector" aria-label="Website Language Selector" align="right" style="position:relative; z-index:1000; padding:3px"><option value="">Select Language</option><option value="en|hi">Hindi</option><option value="en|fr">French</option><option value="en|de">German</option><option value="en|es">Spanish</option><option value="en|el">Greek</option><option value="en|en">English</option><option value="en|te">Telugu</option><option value="en|ml">Malayalam</option><option value="en|ur">Urdu</option><option value="en|nl">Dutch</option><option value="en|ar">Arabic</option><option value="en|zh-Hans">Chinese (Simplified)</option><option value="en|ru">Russian</option><option value="en|ta">Tamil</option><option value="en|sa">Sanskrit</option><option value="en|fa">Persian (Farsi)</option><option value="en|ne">Nepali</option><option value="en|mr">Marathi</option><option value="en|mn">Mangolian	</option><option value="en|la">Latin</option><option value="en|kn">Kannada</option><option value="en|ja">Japanese</option><option value="en|it">Italian	</option><option value="en|gu">Gujarati	</option><option value="en|hu">Hungarian</option><option value="en|id ,in">Indonesian</option><option value="en|ga">Irish	</option><option value="en|th">Thai</option></select>
  By selectproperty=By.id("gtranslate_selector");
	 WebElement selectlink=driver.findElement(selectproperty);
	By  rohith  = By.tagName("option");
	 WebElement  naveen =driver.findElement(rohith);
} 
public static void main(String[] args) {
	screenshot_os_languages s= new screenshot_os_languages();
	s.selectdropdown();
	s.applicationclose();
}
}
