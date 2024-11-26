package com.techhub.demo.jdbc.statements;

import java.sql.Connection;
import java.util.logging.Level;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import com.techhub.demo.jdbc.connection.DBMSConnection;
import com.techhub.demo.jdbc.util.LogUtil;

public class RowSetDemo {

	private static final String QUERY = "SELECT * FROM COFFEES WHERE COF_NAME='Indian Coffee'";

	public static void main(String[] args) throws Exception {
		
		Connection c=DBMSConnection.MYSQL_CONNECTION;

		RowSetFactory aFactory = RowSetProvider.newFactory();
		CachedRowSet rowSet = aFactory.createCachedRowSet();

		rowSet.setUrl(DBMSConnection.URL);
		rowSet.setUsername(DBMSConnection.USERNAME);
		rowSet.setPassword(DBMSConnection.PASSWORD);
		rowSet.setCommand(QUERY);

		rowSet.execute(c);
		c.setAutoCommit(false);

		while (rowSet.next()) {
			String cofName = rowSet.getString("COF_NAME");
			int supId = rowSet.getInt("SUP_ID");
			float price = rowSet.getFloat("PRICE");
			int sales = rowSet.getInt("SALES");
			int total = rowSet.getInt("TOTAL");
			StringBuilder rowSetData = new StringBuilder();
			rowSetData.append("*************** RECORD ***************\n");
			rowSetData.append("COF_NAME : ").append(cofName).append("\n");
			rowSetData.append("SUP_ID : ").append(supId).append("\n");
			rowSetData.append("PRICE : ").append(price).append("\n");
			rowSetData.append("SALES : ").append(sales).append("\n");
			rowSetData.append("TOTAL : ").append(total).append("\n");
			LogUtil.LOGGER.log(Level.INFO, rowSetData.toString());
		}
		
		rowSet.absolute(1);
		rowSet.updateInt("TOTAL", 200);
		rowSet.updateRow();
		rowSet.acceptChanges();
		LogUtil.LOGGER.log(Level.INFO, "Updated Total");
	}

}
