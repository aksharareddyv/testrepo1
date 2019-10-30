package Testmaven;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;

public class testdimension {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = test2.getDriver("CRM");
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Dimension d= new Dimension (300,600);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p = new Point(300,600);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.close();
		
	}

}
