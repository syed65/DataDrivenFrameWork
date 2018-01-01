package com.edureka.Utilities;

import org.apache.log4j.Logger;

public class Log {

	static Logger Log = Logger.getLogger(Log.class.getName());
	
	public static void stestCasestart(String message){
		Log.info("+++++++++++++++++++++++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++");
		Log.info("++++++++++" + message + "++++++++");
		Log.info("+++++++++++++++++++++++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++");
	}
	
	public static void sendtestcase(){
		Log.info("++++++++++++ END ++++++++++++++++");
		Log.info("+++++++++++++++++++++++++++++++++");
	}

	public static void info(String message){
		Log.info(message);
	}
	
	public static void error(String message){
		Log.error(message);
	}
	
	public static void warn(String message){
		Log.warn(message);
	}
	
}
