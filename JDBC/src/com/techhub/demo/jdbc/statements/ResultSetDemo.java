package com.techhub.demo.jdbc.statements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.util.LogUtil;
import com.techhub.demo.jdbc.util.ResultSetUtil;

public class ResultSetDemo {

	public static void main(String[] args) {
		
		try (Connection connection = DBMSConnection.MYSQL_CONNECTION) {

			/** Creating PreparedStatement with ResultSet type TYPE_FORWARD_ONLY and CONCUR_READ_ONLY */
//			PreparedStatement statement = connection.prepareStatement(StatementExecuteDemo.SQL_SELECT_QUERY);

			/** Creating PreparedStatement with ResultSet type TYPE_SCROLL_INSENSITIVE and CONCUR_READ_ONLY */
//			PreparedStatement statement = connection.prepareStatement(StatementExecuteDemo.SQL_SELECT_QUERY,
//					ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			/** Creating PreparedStatement with ResultSet type TYPE_SCROLL_INSENSITIVE and CONCUR_READ_ONLY */
			PreparedStatement statement = connection.prepareStatement(StatementExecuteDemo.SQL_SELECT_QUERY,
					ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

			/** Getting ResultSet */
			ResultSet resultSet = statement.executeQuery();

			/** Print TYPE_FORWARD_ONLY ResultSet */
//			ResultSetUtil.print(resultSet);

			/** Print TYPE_SCROLL_INSENSITIVE ResultSet */
//			ResultSetUtil.printTypeScrollSensitive(resultSet);
			
			/** Print CONCUR_UPDATABLE ResultSet */
//			ResultSetUtil.printTypeUpdatable(resultSet);
			
			/** Print the single index of  ResultSet for given position*/
//			ResultSetUtil.printSingleCoffeeRecord(resultSet,2);
			
			/** Inserting new record into ResultSet */
			ResultSetUtil.insertNewRecordToCofeeTable(resultSet);

			/** Closing the PreparedStatement */
			statement.close();
		} catch (SQLException sqlException) {
			/** Logging the SQLException */
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		}
	}
}