package com.pawan.logger.factory;

import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {

	public Logger getLogger() {
		if (isFileLoggingEnabled()) {
			return new FileLogger();
		} else {
			return new ConsoleLogger();
		}
	}

	// helper method, check if FileLogging is ON
	// if so, log message to a file else print it to console.
	private boolean isFileLoggingEnabled() {
		Properties p = new Properties();
		try {
			p.load(ClassLoader.getSystemResourceAsStream("logger.properties"));
			String fileLoggingValue = p.getProperty("FileLogging");
			if (fileLoggingValue.equalsIgnoreCase("ON") == true)
				return true;
			else
				return false;
		} catch (IOException e) {
			return false;
		}
	}

}
