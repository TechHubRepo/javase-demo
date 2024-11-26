package com.techhub.javasedemo.logs;

import java.io.File;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.MemoryHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.SocketHandler;
import java.util.logging.StreamHandler;
import java.util.logging.XMLFormatter;

import com.techhub.javasedemo.langpackage.RootPath;

public class LoggerDemo {

	public static void main(String[] args) throws Exception {

		/** Creating the Logger */
//		Logger logger = Logger.getAnonymousLogger();
//		Logger logger = Logger.getAnonymousLogger("resource");
//		Logger logger = Logger.getGlobal();
//		Logger logger = Logger.getLogger("APP_LOGGER");
		Logger logger = Logger.getLogger("APP_LOGGER", "resource");

		/** Creating Handler for Logger */
//		Handler handler=new ConsoleHandler();
		File inputFile = new File(RootPath.ROOT, "/app_log_file.log");
		Handler handler = new FileHandler(inputFile.getAbsolutePath(), true);
//		Handler handler=new SocketHandler("localhost",6300);
//		Handler handler=new StreamHandler();
//		Handler handler=new MemoryHandler();

		/** Creating Formatter for Handler */
//		Formatter formatter = new XMLFormatter();
		Formatter formatter = new SimpleFormatter();
//		Formatter formatter = new CutomLogFormatter();

		/** Setting Formatter to Handler */
		handler.setFormatter(formatter);

		/** Adding Handler to Logger */
		logger.addHandler(handler);

		/** Creating Filter for Logger */
//		Filter filter = new CustomLogFilter();

		/** Setting Filter to Handler */
//		logger.setFilter(filter);

		/** Logging the INFORMATION */
		logger.log(Level.INFO, "greet");
		logger.log(Level.INFO, "message");

		logger.info("greet");
		logger.info("message");

		int x = 0;
		try {
			x = 10 / 0;
//			x = 10 / 5;
			logger.log(Level.INFO, "sum", x);
		} catch (ArithmeticException e) {
			/** Logging the WARNING */
			logger.log(Level.WARNING, "error", e);
			logger.warning("error");
		}
	}
}
