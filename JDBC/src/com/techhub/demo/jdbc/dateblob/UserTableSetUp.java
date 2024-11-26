package com.techhub.demo.jdbc.dateblob;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.constant.TableDDLStatements;
import com.techhub.demo.jdbc.util.LogUtil;

/**
 * The CustomerTableSetUp class
 * 
 * @author ramniwash
 */
public class UserTableSetUp {

	public static void main(String[] args) {

		try (Connection connection = DBMSConnection.MYSQL_CONNECTION;
				Statement statement = connection.createStatement()) {

			statement.addBatch(TableDDLStatements.USER_TABLE_DROP_DDL);

			statement.addBatch(TableDDLStatements.USER_TABLE_CREATE_DDL);

			int[] arr = statement.executeBatch();
			LogUtil.LOGGER.log(Level.INFO, "USER Table created : [ " + arr.length + " ] : " + Arrays.toString(arr));

		} catch (SQLException sqlException) {
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		}
	}
}
