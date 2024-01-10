package org.testing.TestScripts;

import org.testng.annotations.Test;
import org.testing.Base.Base;
import org.testing.Pages.Home_Page;
import org.testing.Pages.Login_Page;
import org.testing.Pages.Logout_Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Final_TC3 extends Base{
	
	
	@BeforeMethod
	public void TestCase_TC1_Login() throws Exception {
		Login_Page login = new Login_Page(driver, pr); // add here driver and pr
		login.sign_in("username", "password");
		Thread.sleep(7000);
	}
	
	@Test(priority = 3)
	public void Click_Subscription() throws Exception {
		System.out.println("Subscription section - Started");
		Home_Page Home = new Home_Page(driver, pr);
		Home.Click_Subscriptions_section();
		Thread.sleep(2000);
		System.out.println("Subscription section - Completed");
	}
	
	
	@AfterMethod
	public void TestCase_TC1_Logout() throws Exception {
		Logout_Page logout = new Logout_Page(driver, pr);
		logout.logout_successfully();
		
	
	}
	
	
	
	
	
	
	

}
