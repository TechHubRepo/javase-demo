package com.techhub.demo.jdbc.util;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * The LogUtil class
 * 
 * @author ramniwash
 */
public class LogUtil {

	/** Private constructor to avoid object creation */
	private LogUtil() {
	}

	/** The LOGGER */
	public static final Logger LOGGER = Logger.getLogger("JDBC_LOGGER");

	/** Configuration of Logger */
	static {

		try {
			/** Getting the LogManager */
			LogManager logManager = LogManager.getLogManager();

			/** Reseting the LogManager */
			logManager.reset();

			/** Creating the SimpleFormatter for Logger */
			Formatter formatter = new SimpleFormatter();

			/** Creating the ConsoleHandler for Logger */
			Handler consoleHandler = new ConsoleHandler();

			/** Setting the the Formatter for Handler */
			consoleHandler.setFormatter(formatter);

			/** Setting the the Handler for Logger */
			LOGGER.addHandler(consoleHandler);
		} catch (Exception exception) {
			LOGGER.log(Level.SEVERE, exception.getMessage(), exception);
		}
	}
}
