package com.techhub.demo.jdbc.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 * The ResultSetUtil class
 * 
 * @author ramniwash
 */
public class ResultSetUtil {

	/** Private constructor to avoid object creation */
	private ResultSetUtil() {
	}

	/**
	 * Print Result Set
	 * 
	 * @param resultSet a ResultSet
	 * @throws SQLException
	 */
	public static void print(ResultSet resultSet) throws SQLException {
		if (null != resultSet) {
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			StringBuilder resultSetData = new StringBuilder();
			resultSetData.append("\n**************");
			resultSetData.append(" Table : ");
			if (resultSetMetaData.getColumnCount() > 1) {
				resultSetData.append(resultSetMetaData.getTableName(1));
			}
			resultSetData.append(" **************\n");
			int columnCount = resultSetMetaData.getColumnCount();
			for (int colIndex = 1; colIndex <= columnCount; colIndex++) {
				String columnName = resultSetMetaData.getColumnName(colIndex);
				resultSetData.append(" | ");
				resultSetData.append(columnName);
			}
			resultSetData.append(" |\n-------------------------------------------------------------------\n");
			while (resultSet.next()) {
				for (int colIndex = 1; colIndex <= columnCount; colIndex++) {
					String columnName = resultSetMetaData.getColumnName(colIndex);
					Object object = resultSet.getObject(columnName);
					resultSetData.append(" | ");
					resultSetData.append(object);
				}
				resultSetData.append(" |\n");
			}
			resultSetData.append("********************************************\n");
			LogUtil.LOGGER.log(Level.INFO, resultSetData.toString());
		}
	}

	public static void printTypeScrollSensitive(ResultSet resultSet) throws SQLException {

		if (null != resultSet) {
			resultSet.afterLast();
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			StringBuilder resultSetData = new StringBuilder();
			resultSetData.append("\n**************");
			resultSetData.append(" Table : ");
			if (resultSetMetaData.getColumnCount() > 1) {
				resultSetData.append(resultSetMetaData.getTableName(1));
			}
			resultSetData.append(" **************\n");
			int columnCount = resultSetMetaData.getColumnCount();
			for (int colIndex = 1; colIndex <= columnCount; colIndex++) {
				String columnName = resultSetMetaData.getColumnName(colIndex);
				resultSetData.append(" | ");
				resultSetData.append(columnName);
			}
			resultSetData.append(" |\n-------------------------------------------------------------------\n");
			while (resultSet.previous()) {
				for (int colIndex = 1; colIndex <= columnCount; colIndex++) {
					String columnName = resultSetMetaData.getColumnName(colIndex);
					Object object = resultSet.getObject(columnName);
					resultSetData.append(" | ");
					resultSetData.append(object);
				}
				resultSetData.append(" |\n");
			}
			resultSetData.append("********************************************\n");
			LogUtil.LOGGER.log(Level.INFO, resultSetData.toString());
		}

	}

	public static void printTypeUpdatable(ResultSet resultSet) throws SQLException {

		if (null != resultSet) {
			resultSet.afterLast();
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			StringBuilder resultSetData = new StringBuilder();
			resultSetData.append("\n**************");
			resultSetData.append(" Table : ");
			if (resultSetMetaData.getColumnCount() > 1) {
				resultSetData.append(resultSetMetaData.getTableName(1));
			}
			resultSetData.append(" **************\n");
			int columnCount = resultSetMetaData.getColumnCount();
			for (int colIndex = 1; colIndex <= columnCount; colIndex++) {
				String columnName = resultSetMetaData.getColumnName(colIndex);
				resultSetData.append(" | ");
				resultSetData.append(columnName);
			}
			resultSetData.append(" |\n-------------------------------------------------------------------\n");
			while (resultSet.previous()) {
				for (int colIndex = 1; colIndex <= columnCount; colIndex++) {
					String columnName = resultSetMetaData.getColumnName(colIndex);
					Object object = resultSet.getObject(columnName);
					if (columnName.equals("SALES")) {
						int sales = (int) object;
						sales += 5;
						resultSet.updateObject(columnName, sales);
						resultSet.updateRow();
					}
					resultSetData.append(" | ");
					resultSetData.append(object);
				}
				resultSetData.append(" |\n");
			}
			resultSetData.append("********************************************\n");
			LogUtil.LOGGER.log(Level.INFO, resultSetData.toString());
		}
	}

	/**
	 * Print a single Coffee record
	 * @param resultSet
	 * @param index
	 * @throws SQLException
	 */
	public static void printSingleCoffeeRecord(ResultSet resultSet, int index) throws SQLException {

		resultSet.absolute(index);

		String cofName = resultSet.getString("COF_NAME");
		int supId = resultSet.getInt("SUP_ID");
		int price = resultSet.getInt("PRICE");
		int sales = resultSet.getInt("SALES");
		int total = resultSet.getInt("TOTAL");

			
		StringBuilder resultSetData = new StringBuilder();
		resultSetData.append("*************** RECORD ***************\n");
		resultSetData.append("COF_NAME : ").append(cofName).append("\n");
		resultSetData.append("SUP_ID : ").append(supId).append("\n");
		resultSetData.append("PRICE : ").append(price).append("\n");
		resultSetData.append("SALES : ").append(sales).append("\n");
		resultSetData.append("TOTAL : ").append(total).append("\n");

		LogUtil.LOGGER.log(Level.INFO, resultSetData.toString());
	}

	/**
	 * Insert new record into ResultSet
	 * 
	 * @param resultSet
	 * @throws SQLException
	 */
	public static void insertNewRecordToCofeeTable(ResultSet resultSet) throws SQLException {
		resultSet.moveToInsertRow();
		resultSet.updateString("COF_NAME", "Indian Coffee2");
		resultSet.updateInt("SUP_ID", 150);
		resultSet.updateFloat("PRICE", 60.99f);
		resultSet.updateInt("SALES", 0);
		resultSet.updateInt("TOTAL", 0);
		resultSet.insertRow();
		
		LogUtil.LOGGER.log(Level.INFO, "New row is added.");
	}
}
