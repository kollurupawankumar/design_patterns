package com.pawan.logger;

import com.pawan.logger.factory.ConsoleLogger;
import com.pawan.logger.factory.FileLogger;
import com.pawan.logger.factory.Logger;

public class FactoryMethodDirtyCode {
	
	public static void main(String[] args) {
	//	Logger log = new FileLogger();
		Logger log = new ConsoleLogger();
		log.logMessage("Dirty Code Message");
	}

}
