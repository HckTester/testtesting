package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {
	
	/**
	 *  here this login page required driver and properties object .. by using constructor 
	 *  we will get this driver and properties object .
	 *  this constructor driver and properties object is at local level 
	 *  so we have to make them equal by using this keyword
	 * @param username
	 * @param password
	 */
	
	ChromeDriver driver;
	Properties pr;
	
	public Login_Page(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}

	
	
	public void sign_in(String username, String password) throws Exception {
		// Complete Code of Sign in here
		WebElement login = driver.findElement(By.xpath(pr.getProperty("signin_icon")));
		login.click();
		Thread.sleep(8000);
		WebElement emailtxtbox = driver.findElement(By.xpath(pr.getProperty("Email_id_txtbox")));
		emailtxtbox.click();
		emailtxtbox.sendKeys("abhisgarma35@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(pr.getProperty("Next_btn"))).click();
		Thread.sleep(8000);
		WebElement password_txtbox = driver.findElement(By.xpath(pr.getProperty("password_txtbox")));
		password_txtbox.click();
		password_txtbox.sendKeys("Mahakal##@##7977");
		driver.findElement(By.xpath(pr.getProperty("password_next_btn"))).click();
		Thread.sleep(10000);
		
	}

	

}
