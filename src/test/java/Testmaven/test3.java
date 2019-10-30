package Testmaven;

import org.openqa.selenium.WebDriver;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver1;
		
		driver1 = test2.getDriver("CRM");
		
		driver1.get("https://www.google.com");
		
		
	}

}
