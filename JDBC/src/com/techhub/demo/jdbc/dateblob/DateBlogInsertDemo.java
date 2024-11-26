package com.techhub.demo.jdbc.dateblob;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.util.LogUtil;
import com.techhub.demo.jdbc.util.Paths;

/**
 * The CustomerTableSetUp class
 * 
 * @author ramniwash
 */
public class DateBlogInsertDemo {

	private static final String INSERT_QUERY = "INSERT INTO USER VALUES(0,?,?,?);";

	public static void main(String[] args) {

		try (Connection connection = DBMSConnection.MYSQL_CONNECTION;
				PreparedStatement statement = connection.prepareStatement(INSERT_QUERY)) {

			Date date = Date.valueOf(LocalDate.parse("1996-12-20"));
			File profileImage = new File(Paths.ROOT, "sample-image.jpg");
			InputStream inputStream = new FileInputStream(profileImage);

			statement.setString(1, "Ram Niwash");
			statement.setDate(2, date);
			statement.setBinaryStream(3, inputStream);

			int x = statement.executeUpdate();
			LogUtil.LOGGER.info("X : " + x);

		} catch (Exception exception) {
			LogUtil.LOGGER.log(Level.SEVERE, exception.getMessage(), exception);
		}
	}
}
