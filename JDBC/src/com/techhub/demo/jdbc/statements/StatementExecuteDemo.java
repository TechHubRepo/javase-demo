package com.techhub.demo.jdbc.statements;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.util.LogUtil;

/**
 * The StatementExecuteDemo class
 * 
 * @author ramniwash
 */
public class StatementExecuteDemo {

	/** The SQL_SELECT_QUERY */
	public static final String SQL_SELECT_QUERY = "SELECT * FROM COFFEES";

	/** The SQL_UPDATE_QUERY */
	private static final String SQL_UPDATE_QUERY = "UPDATE COFFEES SET PRICE = 20";

	/** The SQL_INSERT_QUERY */
	private static final String SQL_INSERT_QUERY = "INSERT INTO COFFEES VALUES('Koinonia Coffee Roasters', 49, 50, 0, 0)";

	/** The SQL_INSERT_QUERY */
	private static final String SQL_DELETE_QUERY = "DELETE FROM COFFEES WHERE COF_NAME='Koinonia Coffee Roasters'";

	public static void main(String[] args) {
		try (Connection connection = DBMSConnection.MYSQL_CONNECTION;
				Statement statement = connection.createStatement()) {

			/** Executing Query by execute(String) method */
	
//			boolean executeFlag = statement.execute();
//			if (executeFlag) {
//				ResultSet resultSet = statement.getResultSet();
//				ResultSetUtil.print(resultSet);
//			} else {
//				int updateCounts = statement.getUpdateCount();
//				LogUtil.LOGGER.log(Level.INFO, "Update Counts : " + updateCounts);
//			}

			/** Executing Query by executeQuery(String) method */
//			ResultSet resultSet = statement.executeQuery(SQL_SELECT_QUERY);
//			ResultSetUtil.print(resultSet);

			/** Executing Query by executeUpdate(String) method */
//			int updateCounts = statement.executeUpdate(SQL_DELETE_QUERY);
//			LogUtil.LOGGER.log(Level.INFO, "Update Counts : "+updateCounts);

			/** Adding the Queries to batch of the statement to execute in batch */
			statement.addBatch(SQL_INSERT_QUERY);
			statement.addBatch(SQL_UPDATE_QUERY);
			statement.addBatch(SQL_DELETE_QUERY);			
			statement.addBatch(SQL_UPDATE_QUERY);

			int[] updateCounts = statement.executeBatch();
			LogUtil.LOGGER.log(Level.INFO, "Update Counts[0] : " + updateCounts[0]);
			LogUtil.LOGGER.log(Level.INFO, "Update Counts[1] : " + updateCounts[1]);
			LogUtil.LOGGER.log(Level.INFO, "Update Counts[2] : " + updateCounts[2]);
			LogUtil.LOGGER.log(Level.INFO, "Update Counts[3] : " + updateCounts[3]);

		} catch (SQLException sqlException) {
			/** Logging the SQLException */
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		}
	}
}
