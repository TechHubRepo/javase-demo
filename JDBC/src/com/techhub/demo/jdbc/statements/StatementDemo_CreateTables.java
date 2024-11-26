package com.techhub.demo.jdbc.statements;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.constant.TableDDLStatements;
import com.techhub.demo.jdbc.util.LogUtil;

/**
 * The Statement_Demo_CreateTables class
 * 
 * @author ramniwash
 */
public class StatementDemo_CreateTables {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/** Getting the Connection */
		Connection connection = DBMSConnection.MYSQL_CONNECTION;

		/** Declaring the Statement with null reference */
		Statement statement = null;

		try {

			/** Initialization of Statement */
			statement = connection.createStatement();

			/** Executing the SUPPLIERS_TABLE_CREATE_DDL Statement */
			statement.execute(TableDDLStatements.SUPPLIERS_TABLE_CREATE_DDL);

			/** Logging the SUPPLIERS_TABLE_CREATE_DDL Message */
			LogUtil.LOGGER.log(Level.INFO, "SUPPLIERS Table Created");

			/** Executing the COFFEES_TABLE_CREATE_DDL Statement */
			statement.execute(TableDDLStatements.COFFEES_TABLE_CREATE_DDL);

			/** Logging the COFFEES_TABLE_CREATE_DDL Message */
			LogUtil.LOGGER.log(Level.INFO, "COFFEES Table Created");

			/** Executing the COF_INVENTORY_TABLE_CREATE_DDL Statement */
			statement.execute(TableDDLStatements.COF_INVENTORY_TABLE_CREATE_DDL);

			/** Logging the COF_INVENTORY_TABLE_CREATE_DDL Message */
			LogUtil.LOGGER.log(Level.INFO, "COF_INVENTORY Table Created");

			/** Executing the MERCH_INVENTORY_TABLE_CREATE_DDL Statement */
			statement.execute(TableDDLStatements.MERCH_INVENTORY_TABLE_CREATE_DDL);

			/** Logging the MERCH_INVENTORY_TABLE_CREATE_DDL Message */
			LogUtil.LOGGER.log(Level.INFO, "MERCH_INVENTORY Table Created");

			/** Executing the COFFEE_HOUSES_TABLE_CREATE_DDL Statement */
			statement.execute(TableDDLStatements.COFFEE_HOUSES_TABLE_CREATE_DDL);

			/** Logging the COFFEE_HOUSES_TABLE_CREATE_DDL Message */
			LogUtil.LOGGER.log(Level.INFO, "COFFEE_HOUSES Table Created");

		} catch (SQLException sqlException) {
			/** Logging the SQLException */
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		} finally {
			try {
				if (statement != null) {
					/** Closing the Statement */
					statement.close();
				}
				/** Closing the Connection */
				connection.close();
			} catch (SQLException sqlException) {
				/** Logging the SQLException */
				LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
			}
		}
	}
}
