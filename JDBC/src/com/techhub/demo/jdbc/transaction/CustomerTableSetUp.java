package com.techhub.demo.jdbc.transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.constant.TableDDLStatements;
import com.techhub.demo.jdbc.constant.TableDMLStatements;
import com.techhub.demo.jdbc.util.LogUtil;

/**
 * The CustomerTableSetUp class
 * 
 * @author ramniwash
 */
public class CustomerTableSetUp {

	public static void main(String[] args) {

		try (Connection connection = DBMSConnection.MYSQL_CONNECTION;
				Statement statement = connection.createStatement()) {

			statement.addBatch(TableDDLStatements.CUSTOMER_TABLE_DROP_DDL);

			statement.addBatch(TableDDLStatements.CUSTOMER_TABLE_CREATE_DDL);

			for (String query : TableDMLStatements.CUSTOMER_INSERT_DML) {
				statement.addBatch(query);
			}

			int[] arr = statement.executeBatch();
			LogUtil.LOGGER.log(Level.INFO, "CUSTOMER Table created and records inserted : [ " + arr.length
					+ " Records Inserted ] : " + Arrays.toString(arr));

		} catch (SQLException sqlException) {
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		}
	}
}
