package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {

	/**
	 * With the help of DOMConfigurator -
	 * To configuration between layout.xml file and LogsCapture Class we need (DOM Configurator)
	 */
	
	
	public static void takeLog(String ClassName, String message) {
		
		DOMConfigurator.configure("../YouTube_Framework_Development/layout.xml");
		Logger Log = Logger.getLogger(ClassName);
		Log.info(message);
		
	}
	
	
	
	
	
	
	
	
	
}
