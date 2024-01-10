package org.testing.TestScripts;

import org.testng.annotations.Test;
import org.testing.Base.Base;
import org.testing.Pages.Home_Page;
import org.testing.Pages.Login_Page;
import org.testing.Pages.Logout_Page;
import org.testing.assertion.Assertt;
import org.testing.utilities.LogsCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Final_TC2 extends Base  {
	
	
	@BeforeMethod
	public void TestCase_TC1_Login() throws Exception {
		LogsCapture.takeLog("Final_TC2", "Login successfully - started");
		Login_Page login = new Login_Page(driver, pr); // add here driver and pr
		login.sign_in("username", "password");
		Thread.sleep(7000);
		LogsCapture.takeLog("Final_TC2", "Login successfully - Completed");
		//Assertt.assertion1(null, null, null);
	}
	
	@Test(priority = 2)
	public void Click_History() throws Exception {
		LogsCapture.takeLog("Final_TC2", "Click on History  - Started");
		Home_Page Home = new Home_Page(driver, pr);
		Home.Click_History_section();
		Thread.sleep(2000);
		LogsCapture.takeLog("Final_TC2", "Click on History - Completed");
		//Assertt.assertion1(null, null, null);
	}
	
	
	@AfterMethod
	public void TestCase_TC1_Logout() throws Exception {
		LogsCapture.takeLog("Final_TC2", "Logout process - Started");
		Logout_Page logout = new Logout_Page(driver, pr);
		logout.logout_successfully();
		LogsCapture.takeLog("Final_TC2", "Logout process - Completed");
		//Assertt.assertion1(null, null, null);
	
	}
	
	
	
	
	
	
	
	

}
