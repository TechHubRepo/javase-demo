package com.techhub.demo.jdbc.statements;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.constant.ProcedureDDLStatements;
import com.techhub.demo.jdbc.util.LogUtil;

public class StatementDemo_CreateProcedure {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = DBMSConnection.MYSQL_CONNECTION;
				Statement statement = connection.createStatement()) {

			statement.execute(ProcedureDDLStatements.CREATE_GET_COFEE_PRICE_BY_COFEE_NAME);
			LogUtil.LOGGER.log(Level.INFO, "CREATE_GET_COFEE_PRICE_BY_COFEE_NAME Created");
			
//			statement.execute(ProcedureDDLStatements.DROP_GET_COFEE_PRICE_BY_COFEE_NAME);
//			LogUtil.LOGGER.log(Level.INFO, "LOAD_COFEE_PRICE_BY_COFEE_NAME_PROCEDURE Droped");

		} catch (SQLException sqlException) {
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		}
	}
}
