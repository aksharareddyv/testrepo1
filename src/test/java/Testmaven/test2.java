package Testmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test2 {

	public static WebDriver getDriver(String Bname) {
		// TODO Auto-generated method stub
if (Bname.equals("CRM"))
{
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\drivers\\chromedriver.exe");
	return new ChromeDriver();
}

if (Bname.equals("IE"))
{
	System.setProperty("webdriver.ie.driver","C:\\Drivers\\drivers\\IEDriverServer.exe");
	return new InternetExplorerDriver();
}

else 
	return null;
	}

}
