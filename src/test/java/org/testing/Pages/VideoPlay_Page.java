package org.testing.Pages;

import java.awt.Robot;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VideoPlay_Page {
	
	/**
	 *  here this Video_play_page page required driver and properties object .. by using constructor 
	 *  we will get this driver and properties object .
	 *  this constructor driver and properties object is at local level 
	 *  so we have to make them equal by using this keyword
	 * @param username
	 * @param password
	 */
	
	
	ChromeDriver driver;
	Properties pr;
	
	
	
	public VideoPlay_Page(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}
	
	

	public void Click_Video_play() throws Exception {
		Thread.sleep(3000);
		WebElement videtitle = driver.findElement(By.xpath(pr.getProperty("Videos_title_play")));
		videtitle.click();
		
	}
	
	public void Click_on_Like_icon() {
		WebElement like_icon = driver.findElement(By.xpath(pr.getProperty("Videos_Like_icon")));
		like_icon.click();
		
	}
	
	public void Click_on_Channel_Subscription() {
		WebElement chnnl_subs = driver.findElement(By.xpath(pr.getProperty("Channel_Subscribe_btn")));
		chnnl_subs.click();
	}
	
	public void Comment_on_videos() throws Exception {
		Robot robot = new Robot();
		robot.mouseWheel(-5);
		WebElement commnet_txt = driver.findElement(By.xpath(pr.getProperty("Video_comment")));
		Actions action = new Actions(driver);
		action.moveToElement(commnet_txt).click().build().perform();
		Thread.sleep(1000);
		commnet_txt.sendKeys("Nice Video");
		Thread.sleep(2000);
		WebElement commentsend = driver.findElement(By.xpath(pr.getProperty("Comment_Send_btn")));
		action.moveToElement(commentsend).click().build().perform();
		
	}
	
	

}
