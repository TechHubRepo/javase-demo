package com.techhub.demo.jdbc.statements;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.constant.TableDMLStatements;
import com.techhub.demo.jdbc.util.LogUtil;

/**
 * The Statement_Demo_Insert
 * 
 * @author ramniwash
 *
 */
public class StatementDemo_Insert {

	public static void main(String[] args) throws SQLException {

		/**
		 * Closing AutoCloseable Resources (e.g Connection , Statement) in Try with
		 * Resource Statement to auto close.
		 */
		try (Connection connection = DBMSConnection.MYSQL_CONNECTION;
				Statement statement = connection.createStatement()) {

			/** Adding SUPPLIERS_INSERT_DMLs query to Statement's Batch */
			for (String suppliersInsertDML : TableDMLStatements.SUPPLIERS_INSERT_DML) {
				statement.addBatch(suppliersInsertDML);
			}
			/** Executing the Batch Statements of SUPPLIERS_INSERT_DMLs query */
			int[] arr1 = statement.executeBatch();
			LogUtil.LOGGER.log(Level.INFO, "SUPPLIERS Table Insert Query (Statement) executed : [" + arr1.length
					+ " Records Inserted ]" + Arrays.toString(arr1));

			/** Adding COFFEES_INSERT_DMLs query to Statement's Batch */
			for (String coffeesInsertDML : TableDMLStatements.COFFEES_INSERT_DML) {
				statement.addBatch(coffeesInsertDML);
			}
			/** Executing the Batch Statements of COFFEES_INSERT_DML query */
			int[] arr2 = statement.executeBatch();
			LogUtil.LOGGER.log(Level.INFO, "COFFEES Table Insert Query (Statement) executed : [" + arr2.length
					+ " Records Inserted ]" + Arrays.toString(arr2));

			/** Adding COF_INVENTORY_INSERT_DMLs query to Statement's Batch */
			for (String cofInventoryInsertDML : TableDMLStatements.COF_INVENTORY_INSERT_DML) {
				statement.addBatch(cofInventoryInsertDML);
			}
			/** Executing the Batch Statements of COF_INVENTORY_INSERT_DML query */
			int[] arr3 = statement.executeBatch();
			LogUtil.LOGGER.log(Level.INFO, "COF_INVENTORY Table Insert Query (Statement) executed : [" + arr3.length
					+ " Records Inserted ]" + Arrays.toString(arr3));

			/** Adding MERCH_INVENTORY_INSERT_DMLs query to Statement's Batch */
			for (String merchInventoryInsertDML : TableDMLStatements.MERCH_INVENTORY_INSERT_DML) {
				statement.addBatch(merchInventoryInsertDML);
			}
			/** Executing the Batch Statements of MERCH_INVENTORY_INSERT_DML query */
			int[] arr4 = statement.executeBatch();
			LogUtil.LOGGER.log(Level.INFO, "MERCH_INVENTORY Table Insert Query (Statement) executed : [" + arr4.length
					+ " Records Inserted ]" + Arrays.toString(arr4));

			/** Adding COFFEE_HOUSES_INSERT_DMLs query to Statement's Batch */
			for (String coffeeHousesInsertDML : TableDMLStatements.COFFEE_HOUSES_INSERT_DML) {
				statement.addBatch(coffeeHousesInsertDML);
			}
			/** Executing the Batch Statements of COFFEE_HOUSES_INSERT_DML query */
			int[] arr5 = statement.executeBatch();
			LogUtil.LOGGER.log(Level.INFO, "COFFEE_HOUSES Table Insert Query (Statement) executed : [" + arr5.length
					+ " Records Inserted ]" + Arrays.toString(arr5));

		} catch (SQLException sqlException) {
			
			/** Logging the SQLException */
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		}
	}
}
