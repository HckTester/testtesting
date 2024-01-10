package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Home_Page {
	
	/**
	 *  here this Home page required driver and properties object .. by using constructor 
	 *  we will get this driver and properties object .
	 *  this constructor driver and properties object is at local level 
	 *  so we have to make them equal by using this keyword
	 * @param username
	 * @param password
	 */
	ChromeDriver driver;
	Properties pr;
	
	public Home_Page(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}
	
	
	public void Click_Trending_section() throws Exception {
		WebElement trends = driver.findElement(By.xpath(pr.getProperty("Trending_section")));
		trends.click();	
	}
	
	public void Click_History_section() {
		WebElement histry = driver.findElement(By.xpath(pr.getProperty("History_section")));
		histry.click();
	}
	
	public void Click_Subscriptions_section() {
		WebElement subscr = driver.findElement(By.xpath(pr.getProperty("Subscription_section")));
		subscr.click();	
	}
	
	public void Click_Watch_later_Section() {
		WebElement watchlater = driver.findElement(By.xpath(pr.getProperty("watch_Later_Section")));
		watchlater.click();
	}
	
	public void Click_Learning_Section() {
		WebElement learn_section = driver.findElement(By.xpath(pr.getProperty("learning_section")));
		learn_section.click();
	}


	
	
	

}
