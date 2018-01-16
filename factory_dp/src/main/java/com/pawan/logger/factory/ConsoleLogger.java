package com.pawan.logger.factory;

public class ConsoleLogger implements Logger {
	public void logMessage(String message) {
		System.out.println("Console: " + message);
	}
}