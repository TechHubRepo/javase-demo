package com.techhub.demo.jdbc.transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.constant.TableDMLStatements;
import com.techhub.demo.jdbc.util.LogUtil;

/**
 * The CustomerTableSetUp class
 * 
 * @author ramniwash
 */
public class SavePointDemo {

	public static void main(String[] args) {
		Connection connection = DBMSConnection.MYSQL_CONNECTION;
		Savepoint savepoint = null;
		Statement statement = null;
		try {

			connection.setAutoCommit(false);
			connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
			statement = connection.createStatement();
			
			statement.execute(TableDMLStatements.NEW_CUSTOMER_INSERT_DML[0]);
			statement.execute(TableDMLStatements.NEW_CUSTOMER_INSERT_DML[1]);
			statement.execute(TableDMLStatements.NEW_CUSTOMER_INSERT_DML[2]);
			statement.execute(TableDMLStatements.NEW_CUSTOMER_INSERT_DML[3]);
			
			savepoint = connection.setSavepoint();
						
			statement.execute(TableDMLStatements.NEW_CUSTOMER_INSERT_DML[4]);
			statement.execute(TableDMLStatements.NEW_CUSTOMER_INSERT_DML[5]);
			statement.execute(TableDMLStatements.NEW_CUSTOMER_INSERT_DML[6]);
			
			connection.rollback(savepoint);
			
			connection.commit();

		} catch (SQLException sqlException) {
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
			LogUtil.LOGGER.log(Level.INFO, "*** Your Transaction faild please tyr again. ***");
			try {
				if (connection != null && !connection.isClosed()) {
					System.out.println("connection : "+connection);
					System.out.println("savepoint : "+savepoint);
					
				}
			} catch (SQLException sqlException2) {
				LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException2);
			}
		} finally {
			try {
				connection.releaseSavepoint(savepoint);
				statement.close();
				connection.close();
			} catch (SQLException sqlException3) {
				LogUtil.LOGGER.log(Level.SEVERE, sqlException3.getMessage(), sqlException3);
			}
		}
	}
}
