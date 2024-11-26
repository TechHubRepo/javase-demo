package com.techhub.javasedemo.logs;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomLogFilter implements Filter {

	@Override
	public boolean isLoggable(LogRecord log) {
		// logs only the  WARNING level log
		return log.getLevel() != Level.WARNING;
	}

}
