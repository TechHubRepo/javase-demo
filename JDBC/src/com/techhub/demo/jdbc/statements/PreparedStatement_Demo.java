package com.techhub.demo.jdbc.statements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.constant.TableDMLStatements;
import com.techhub.demo.jdbc.util.LogUtil;
import com.techhub.demo.jdbc.util.ResultSetUtil;

/**
 * The PreparedStatement_Demo class
 * 
 * @author ramniwash
 */
public class PreparedStatement_Demo {

	public static void main(String[] args) {

		/**
		 * Closing AutoCloseable Resources (e.g Connection , PreparedStatement) in Try
		 * with Resource Statement to auto close.
		 */
		try (Connection connection = DBMSConnection.MYSQL_CONNECTION;
				PreparedStatement preparedStatement = connection
						.prepareStatement(TableDMLStatements.SELECT_COFFEES_BY_SUP_ID_DML)) {

			/** Setting the Position parameter for PreparedStatement */
			preparedStatement.setInt(1, 49);

			/** Logging the PreparedStatement */
			LogUtil.LOGGER.log(Level.INFO, preparedStatement.toString());

			/** Executing the PreparedStatement */
			boolean execute = preparedStatement.execute();
			if (execute) {
				/** Getting the ResultSet from PreparedStatement */
				ResultSet resultSet = preparedStatement.getResultSet();

				/** Printing the ResultSet */
				ResultSetUtil.print(resultSet);
			}
		} catch (SQLException sqlException) {

			/** Logging the SQLException */
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		}
	}
}
