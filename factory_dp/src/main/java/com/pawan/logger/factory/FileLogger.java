package com.pawan.logger.factory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
	public void logMessage(String message) {
		try {
			File file = new File("Pawan_log.log");

			// create file if doesn't exist
			if (!file.exists()) {
				file.createNewFile();
			}

			// true = append file
			FileWriter fileWritter = new FileWriter(file.getName(), true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write(message);
			bufferWritter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Message logged in file: " + message);
	}
}
