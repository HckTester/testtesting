package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Base {
	
	
	public ChromeDriver driver;
	
	public Properties pr;
	
	
	@BeforeClass
	public void browser_launch() throws IOException {
		File f= new File("../YouTube_Framework_Development/ObjectRepo.properties");
		FileReader fr = new FileReader(f);
		pr = new Properties();
		pr.load(fr);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		// creating object for DesiredCapabilities
		DesiredCapabilities incgBrowserMode = new DesiredCapabilities();
		incgBrowserMode.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(incgBrowserMode);
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.youtube.com/");
	}
	
	
	@AfterClass
	public void browser_close() {
		driver.close();
		driver = null;
	}
	
	
	
	
	
	
	

}
