package orangeApplication;
import org.openqa.selenium.chrome.ChromeDriver;
public class get_Title
{
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe");

	ChromeDriver chromebrowser=new ChromeDriver();
	chromebrowser.get("http:/amozon.in");
	 String googleHomePage=chromebrowser.getTitle();
	 System.out.println("the titel of the appliaction is:-"+chromebrowser.getTitle());
	 chromebrowser.close();
	
}
}
