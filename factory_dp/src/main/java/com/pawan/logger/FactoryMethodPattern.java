package com.pawan.logger;

import com.pawan.logger.factory.Logger;
import com.pawan.logger.factory.LoggerFactory;

public class FactoryMethodPattern {
	
	public static void main(String args[])
	  {
	    LoggerFactory f = new LoggerFactory();
	    Logger msgLogger = f.getLogger();
	    msgLogger.logMessage("Sample log message" + "\n");
	    msgLogger.logMessage("Sample log message_1" + "\n");
	    msgLogger.logMessage("Sample log message_2" + "\n");
	    msgLogger.logMessage("Sample log message_3" + "\n");
	  }

}