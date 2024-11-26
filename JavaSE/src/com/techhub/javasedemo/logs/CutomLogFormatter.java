package com.techhub.javasedemo.logs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CutomLogFormatter extends Formatter {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss:sss");

	@Override
	public String format(LogRecord logRecord) {
		
		StringBuilder stringBuilder = new StringBuilder();
		Date dt = new Date(logRecord.getMillis());
		stringBuilder.append(dateFormat.format(dt));
		stringBuilder.append(" | LEVEL : ");
		stringBuilder.append(logRecord.getLevel());
		stringBuilder.append(" | CLASS : ");
		stringBuilder.append(logRecord.getSourceClassName());
		stringBuilder.append(" | METHOD : ");
		stringBuilder.append(logRecord.getSourceMethodName());
		Throwable throwable = logRecord.getThrown();
		if (throwable != null) {
			stringBuilder.append(" | THROWABLE : ");
			stringBuilder.append(throwable.getClass().getName());
			StackTraceElement elements[] = throwable.getStackTrace();
			stringBuilder.append(" | LINE NO : ");
			stringBuilder.append(elements[0].getLineNumber());
		}
		stringBuilder.append(" | MESSAGE : ");
		stringBuilder.append(logRecord.getResourceBundle().getString(logRecord.getMessage()));
		stringBuilder.append("\n");
		return stringBuilder.toString();
	}
}