package com.techhub.demo.jdbc.dateblob;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.util.LogUtil;

/**
 * The CustomerTableSetUp class
 * 
 * @author ramniwash
 */
public class DateBlogSelectDemo {

	private static final String SELECT_QUERY = "SELECT * FROM USER WHERE USER_ID=?;";

	public static void main(String[] args) {

		try (Connection connection = DBMSConnection.MYSQL_CONNECTION;
				PreparedStatement statement = connection.prepareStatement(SELECT_QUERY)) {

			statement.setLong(1, 1);

			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				StringBuilder resultSetRecord = new StringBuilder();
				
				long userID = resultSet.getLong(1);
				String userName = resultSet.getString(2);
				Date userDOB = resultSet.getDate(3);

				/** User the InputStream of Image file to get the Image file */
				@SuppressWarnings("unused")
				InputStream profileImageStream = resultSet.getBinaryStream(4);
				
				resultSetRecord.append("\nUSER_ID : ").append(userID).append("\nUSER_NAME : ").append(userName)
						.append("\nUSER_DOB : ").append(userDOB);
				LogUtil.LOGGER.log(Level.INFO, resultSetRecord.toString());
			}

		} catch (Exception exception) {
			LogUtil.LOGGER.log(Level.SEVERE, exception.getMessage(), exception);
		}
	}
}
