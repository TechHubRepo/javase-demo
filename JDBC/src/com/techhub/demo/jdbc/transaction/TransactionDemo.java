package com.techhub.demo.jdbc.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.util.LogUtil;

public class TransactionDemo {

	private static final String CHECK_MINIMUM_BALANCE_QUERY = "SELECT ACCOUNT_BALANCE FROM CUSTOMER WHERE CUSTOMER_ACCOUNT_NUMBER=?; ";

	private static final String WITHDRAW_QUERY = "UPDATE CUSTOMER SET ACCOUNT_BALANCE = ACCOUNT_BALANCE - ? WHERE CUSTOMER_ACCOUNT_NUMBER = ?";

	private static final String DEPOSIT_QUERY = "UPDATE CUSTOMER SET ACCOUNT_BALANCE = ACCOUNT_BALANCE + ? WHERE CUSTOMER_ACCOUNT_NUMBER = ?";

	private static final int WITHDRAW_ACCOUNT_NUMBER = 123456789;

	private static final int DEPOSIT_ACCOUNT_NUMBER = 987654321;

	private static final double AMOUNT_TO_TRANSFER = 8000;

	public static void main(String[] args) {

		transferMoney(WITHDRAW_ACCOUNT_NUMBER, DEPOSIT_ACCOUNT_NUMBER, AMOUNT_TO_TRANSFER);

	}

	private static void transferMoney(int withdrawAccountNumber, int depositAccountNumber, double amount) {
		Connection connection = DBMSConnection.MYSQL_CONNECTION;

		try (	PreparedStatement checkMinBalPreparedStatement = connection.prepareStatement(CHECK_MINIMUM_BALANCE_QUERY);
				PreparedStatement withdrawPreparedStatement = connection.prepareStatement(WITHDRAW_QUERY);
				PreparedStatement depositPreparedStatement = connection.prepareStatement(DEPOSIT_QUERY)) {

			connection.setAutoCommit(false);
			connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);

			checkMinBalPreparedStatement.setInt(1, withdrawAccountNumber);

			ResultSet resultSet = checkMinBalPreparedStatement.executeQuery();
			resultSet.next();

			double accountBalance = resultSet.getDouble(1);
			if (accountBalance >= amount + 1000) {

				withdrawPreparedStatement.setInt(2, withdrawAccountNumber);
				withdrawPreparedStatement.setDouble(1, AMOUNT_TO_TRANSFER);

				depositPreparedStatement.setInt(2, depositAccountNumber);
				depositPreparedStatement.setDouble(1, AMOUNT_TO_TRANSFER);

				int x = withdrawPreparedStatement.executeUpdate();
				int y = depositPreparedStatement.executeUpdate();

				if (x > 0 && y > 0) {
					connection.commit();
					LogUtil.LOGGER.log(Level.INFO, "*** Your Transaction Successfuly Done. ***");
				} else {
					connection.rollback();
					LogUtil.LOGGER.log(Level.INFO, "*** Your Transaction faild please try again. ***");
				}
			} else {
				LogUtil.LOGGER.log(Level.INFO,
						"*** Your Transaction faild because minimum balance is less then 1000. ***");
			}
		}catch (SQLException sqlException) {
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
			LogUtil.LOGGER.log(Level.INFO, "*** Your Transaction faild please tyr again. ***");
			try {
				if (connection != null && !connection.isClosed()) {
					connection.rollback();				
				}
			} catch (SQLException sqlException2) {
				LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException2);
			}
		} finally {
			try {
				connection.close();
			} catch (SQLException sqlException3) {
				LogUtil.LOGGER.log(Level.SEVERE, sqlException3.getMessage(), sqlException3);
			}
		}
	}
}
