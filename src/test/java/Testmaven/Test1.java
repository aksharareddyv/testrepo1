package Testmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver;
 
 System.setProperty("webdriver.chrome.driver","C:\\Drivers\\drivers\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.get("https://www.google.com");
	}

}
