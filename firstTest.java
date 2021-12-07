package mavenfirstproject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class firstTest {
	
	@Test
	
	public void tc_1()
	
	{
	System.setProperty("webdriver.chrome.driver","C:\\Java programs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
				
	}

		public static void main(String[] args) 
		{
		
			firstTest FS = new firstTest();
			FS.tc_1();
			
}
}
