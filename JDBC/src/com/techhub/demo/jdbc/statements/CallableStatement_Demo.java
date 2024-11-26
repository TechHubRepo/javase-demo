package com.techhub.demo.jdbc.statements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.constant.ProcedureDMLStatements;
import com.techhub.demo.jdbc.util.LogUtil;

/**
 * The CallableStatement_Demo class
 * 
 * @author ramniwash
 */
public class CallableStatement_Demo {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try (Connection connection = DBMSConnection.MYSQL_CONNECTION) {

			/** Preparing CallableStatement */
			CallableStatement callableStatement = connection
					.prepareCall(ProcedureDMLStatements.CALL_GET_COFEE_PRICE_BY_COFEE_NAME);

			/** Registering or Setting Input Parameter */
			callableStatement.setString(1, "Colombian");

			/** Registering or Setting Output Parameter */
			callableStatement.registerOutParameter(2, Types.DOUBLE);

			/** Executing the CallableStatement */
			callableStatement.execute();

			/** Getting the Output Parameter value form CallableStatement */
			double cofeePrice = callableStatement.getDouble(2);

			/** Closing the CallableStatement */
			callableStatement.close();

			/** Logging the cofeePrice value */
			LogUtil.LOGGER.log(Level.INFO, "COFEE PRICE : " + cofeePrice);

		} catch (SQLException sqlException) {

			/** Logging the SQLException */
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		}
	}
}
