package com.techhub.demo.jdbc.statements;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.constant.TableDDLStatements;
import com.techhub.demo.jdbc.util.LogUtil;

/**
 * The Statement_Demo_DropTables
 * 
 * @author ramniwash
 *
 */
public class StatementDemo_DropTables {

	public static void main(String[] args) throws SQLException {

		/**
		 * Closing AutoCloseable Resources (e.g Connection , Statement) in Try
		 * with Resource Statement to auto close.
		 */
		try (Connection connection = DBMSConnection.MYSQL_CONNECTION;
				Statement statement = connection.createStatement()) {

			/** Executing the COFFEE_HOUSES_TABLE_DROP_DDL Statement */
			statement.execute(TableDDLStatements.COFFEE_HOUSES_TABLE_DROP_DDL);
			LogUtil.LOGGER.log(Level.INFO, "COFFEE_HOUSES Table Droped");

			/** Executing the MERCH_INVENTORY_TABLE_DROP_DDL Statement */
			statement.execute(TableDDLStatements.MERCH_INVENTORY_TABLE_DROP_DDL);
			LogUtil.LOGGER.log(Level.INFO, "MERCH_INVENTORY Table Droped");

			/** Executing the COF_INVENTORY_TABLE_DROP_DDL Statement */
			statement.execute(TableDDLStatements.COF_INVENTORY_TABLE_DROP_DDL);
			LogUtil.LOGGER.log(Level.INFO, "COF_INVENTORY Table Droped");

			/** Executing the COFFEES_TABLE_DROP_DDL Statement */
			statement.execute(TableDDLStatements.COFFEES_TABLE_DROP_DDL);
			LogUtil.LOGGER.log(Level.INFO, "COFFEES_TABLE Table Droped");

			statement.execute(TableDDLStatements.SUPPLIERS_TABLE_DROP_DDL);
			LogUtil.LOGGER.log(Level.INFO, "SUPPLIERS_TABLE Table Droped");
			
		} catch (SQLException sqlException) {
			
			/** Logging the SQLException */
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		}
	}
}
