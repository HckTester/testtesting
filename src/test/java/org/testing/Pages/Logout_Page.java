package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Logout_Page {
	
	/**
	 *  here this Logout page required driver and properties object .. by using constructor 
	 *  we will get this driver and properties object .
	 *  this constructor driver and properties object is at local level 
	 *  so we have to make them equal by using this keyword
	 * @param username
	 * @param password
	 */
	ChromeDriver driver;
	Properties pr;
	
	 public Logout_Page(ChromeDriver driver,Properties pr) {
		 this.driver = driver;
		 this.pr = pr;
		 
	 }
	
	
	
	public void logout_successfully() throws Exception{
		System.out.println("Logout Process Started");
		Actions action = new Actions(driver);
		WebElement txt1 = driver.findElement(By.xpath(pr.getProperty("logout_profile")));
		action.moveToElement(txt1).click().build().perform();
		Thread.sleep(6000);
		WebElement txt2 = driver.findElement(By.xpath(pr.getProperty("logout_icon")));
		action.moveToElement(txt2).click().build().perform();
	}
	
	
	
	
	
	
	
	
	
	

}
