package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getting_tsrtc_assicement 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rohit\\eclipse-workspace\\OrangeHRMAApplications\\src\\browserDriveFile\\chromedriver (1).exe ");
	WebDriver driver=new ChromeDriver(); 
	
	 String tsrtcaddress=("http:/tsrtconline.com");
	 driver.get(tsrtcaddress);
	String tsrtcurladdress=("https://www.tsrtconline.in/oprs-web/");
	String gettingurl=driver.getCurrentUrl();
	 System.out.println( gettingurl);
	 /*<div class="menu-wrap">
<div class="menu">
			<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
					Home</a>
				<a class="tabcopy" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
				<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
				<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
				<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
				<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
				<!-- "SpecialHire".equals(curTab) ||  -->
					<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
				<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
				<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
</div>


	 //in the menu block the anchor tag a is same in all links
	By tsrtcheaderproprety=By.className("menu-wrap");
	WebElement tsrtcproperty =driver.findElement(tsrtcheaderproprety);
	
	By tsrtcpropertyslink=By.tagName("a");
*/

}
}

