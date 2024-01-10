package org.testing.assertion;

import org.testing.utilities.LogsCapture;

public class Assertt {
	

	public static void assertion1(String actual, String expected, String className) 
	{

		if(actual.equals(expected))
		{
			LogsCapture.takeLog(className, "Assertion is getting Pass");
		}
		else
		{
			LogsCapture.takeLog(className, "Assertion is getting Fail");
		}
	}


}
