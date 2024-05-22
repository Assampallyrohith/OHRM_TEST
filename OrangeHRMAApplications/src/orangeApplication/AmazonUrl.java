package orangeApplication;



import org.openqa.selenium.chrome.ChromeDriver;
 
public class AmazonUrl 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");
	ChromeDriver chromeBrowser=new ChromeDriver();
	//chromeBrowser.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	//chromeBrowser.geturl
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	chromeBrowser.get(applicationUrlAddress);
	System.out.println(" the url of the application ot the amazon is ;-"+applicationUrlAddress);
	 String amazonurl=chromeBrowser.getCurrentUrl();
	 System.out.println("the current url of the application is :-"+amazonurl);
	 String expected_orangeurladdress=("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	 String Actutal_orangeurladdress=("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	 if(expected_orangeurladdress.contains(Actutal_orangeurladdress))
	 {
		 System.out.println("the url of the orange application is true"+expected_orangeurladdress); 
		}
	 else 
	 {
		 System.out.println("the url of the orange application is fail"+Actutal_orangeurladdress);
	 

	 }
	 chromeBrowser.quit();
	 
	 
	
}
}

	
