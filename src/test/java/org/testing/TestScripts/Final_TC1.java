package org.testing.TestScripts;


import org.testng.annotations.Test;
import org.testing.Base.Base;
import org.testing.Pages.Home_Page;
import org.testing.Pages.Login_Page;
import org.testing.Pages.Logout_Page;
import org.testing.assertion.Assertt;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Report;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class Final_TC1 extends Base {
	
	

	
	@BeforeMethod
	public void TestCase_TC1_Login() throws Exception {
		// Creating and storing extent report object 
		ExtentReports ex = Report.HandleReport();
		// Creating Extent Test Object
		ex.startTest("Frist Test case started in extent report - 1"); // this line is for printing on HTML Report
		
		LogsCapture.takeLog("Final_TC1", "Login Started"); 
		Login_Page login = new Login_Page(driver, pr); // add here driver and pr
		login.sign_in("username", "password");
		Thread.sleep(7000);
		// After Login I want to Take A screenshot
		// I will Call Takecreenshot Method -- because it is Static Method so no need to
		// Create object
		// Just Classname and . call the Method Name
		ScreenshotCapture.takeScreenshot(driver, "..//YouTube_Framework_Development//Screenshot//1png.png");
		/**
		 * executelogclassname - Means - Name of the Class anme in which you want to
		 * Execute the Log // Format of Log file is
		 * logclassname.logmethodname("executelogclassname", "Any message which you want
		 * to Display in Log")
		 */
		LogsCapture.takeLog("Final_TC1", "Test Case 1 - Login Successfully - Completed");
	}

	@Test(priority = 1)
	public void Trending_Click() throws Exception {
		LogsCapture.takeLog("Final_TC1", "Trending Click process Started");
		Home_Page Home = new Home_Page(driver, pr);
		Home.Click_Trending_section();
		Thread.sleep(2000);
		ScreenshotCapture.takeScreenshot(driver, "..//YouTube_Framework_Development//Screenshot//2png.png");
		LogsCapture.takeLog("Final_TC1", "Trending Click process - Completed");

		String actual = "txt";
		String expected = "txt";
		Assertt.assertion1(actual, expected, "Final_TC1");

	}

	@AfterMethod
	public void TestCase_TC1_Logout() throws Exception {
		LogsCapture.takeLog("Final_TC1", "Logout process Started");
		Logout_Page logout = new Logout_Page(driver, pr);
		ScreenshotCapture.takeScreenshot(driver, "..//YouTube_Framework_Development//Screenshot//3png.png");
		logout.logout_successfully();
		ScreenshotCapture.takeScreenshot(driver, "..//YouTube_Framework_Development//Screenshot//4png.png");
		LogsCapture.takeLog("Final_TC1", "Logout Successfully - Completed");
		//Assertt.assertion1(null, null, null);

	}

}
