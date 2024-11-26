package com.techhub.demo.jdbc.connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

import com.techhub.demo.jdbc.util.LogUtil;

/**
 * The DBMSConnection
 * 
 * @author ramniwash
 */
public class DBMSConnection {

	/** Private constructor to avoid object creation */
	private DBMSConnection() {
	}

	/** The RDBMS URL */
	public static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo";

	/** The RDBMS USERNAME */
	public static final String USERNAME = "root";

	/** The RDBMS PASSWORD */
	public static final String PASSWORD = "root";

	/** The MYSQL_CONNECTION */
	public static Connection MYSQL_CONNECTION;

	static {
		try {

			/** The Getting the RDBMS Connection */
			MYSQL_CONNECTION = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			/** The Getting the RDBMS DatabaseMetaData object */
			DatabaseMetaData databaseMetaData = MYSQL_CONNECTION.getMetaData();

			/** The Getting the RDBMS DatabaseMetaData Information */
			StringBuilder databaseMetaDataInfo = new StringBuilder();
			databaseMetaDataInfo.append("\n********** DatabaseMetaData Information **********\n");
			databaseMetaDataInfo.append("\nDatabaseProductName\t:\t");
			databaseMetaDataInfo.append(databaseMetaData.getDatabaseProductName());
			databaseMetaDataInfo.append("\nDatabaseProductVersion\t:\t");
			databaseMetaDataInfo.append(databaseMetaData.getDatabaseProductVersion());
			databaseMetaDataInfo.append("\nDriverName\t:\t");
			databaseMetaDataInfo.append(databaseMetaData.getDriverName());
			databaseMetaDataInfo.append("\nDriverVersion\t:\t");
			databaseMetaDataInfo.append(databaseMetaData.getDriverVersion());

			/** Getting the ResultSet type supported by Database */
//			databaseMetaDataInfo.append("\n\n*********** ResultSet types supported by Database ***********");
//			databaseMetaDataInfo.append("\nTYPE_FORWARD_ONLY [ ");
//			databaseMetaDataInfo.append(ResultSet.TYPE_FORWARD_ONLY);
//			databaseMetaDataInfo.append(" ]\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY));
//			databaseMetaDataInfo.append("\nTYPE_SCROLL_INSENSITIVE [ ");
//			databaseMetaDataInfo.append(ResultSet.TYPE_SCROLL_INSENSITIVE);
//			databaseMetaDataInfo.append(" ]\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
//			databaseMetaDataInfo.append("\nTYPE_SCROLL_SENSITIVE [");
//			databaseMetaDataInfo.append(ResultSet.TYPE_SCROLL_SENSITIVE);
//			databaseMetaDataInfo.append(" ]\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));

			databaseMetaDataInfo
					.append("\n\n*********** Supported Transactional Isolation Levels by Database ***********");

			databaseMetaDataInfo.append("\nTRANSACTION_NONE [ ").append(Connection.TRANSACTION_NONE).append(" ] : ")
					.append(databaseMetaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_NONE));

			databaseMetaDataInfo.append("\nTRANSACTION_READ_UNCOMMITTED [ ")
					.append(Connection.TRANSACTION_READ_UNCOMMITTED).append(" ] : ").append(databaseMetaData
							.supportsTransactionIsolationLevel(Connection.TRANSACTION_READ_UNCOMMITTED));

			databaseMetaDataInfo.append("\nTRANSACTION_READ_COMMITTED [ ").append(Connection.TRANSACTION_READ_COMMITTED)
					.append(" ] : ")
					.append(databaseMetaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_READ_COMMITTED));

			databaseMetaDataInfo.append("\nTRANSACTION_REPEATABLE_READ [ ")
					.append(Connection.TRANSACTION_REPEATABLE_READ).append(" ] : ")
					.append(databaseMetaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_REPEATABLE_READ));

			databaseMetaDataInfo.append("\nTRANSACTION_SERIALIZABLE [ ").append(Connection.TRANSACTION_SERIALIZABLE)
					.append(" ] : ")
					.append(databaseMetaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_SERIALIZABLE));

			databaseMetaDataInfo.append("\nDefault Transactional Isolation Level : ")
					.append(databaseMetaData.getDefaultTransactionIsolation());

			/** Getting the ResultSet Concurrency */
//			databaseMetaDataInfo.append("\n\n*********** ResultSet Concurrency supported by Database *********** ");
//			databaseMetaDataInfo.append("\nTYPE_FORWARD_ONLY and CONCUR_READ_ONLY Concurrency [");
//			databaseMetaDataInfo.append(ResultSet.TYPE_FORWARD_ONLY);
//			databaseMetaDataInfo.append(" , ");
//			databaseMetaDataInfo.append(ResultSet.CONCUR_READ_ONLY);
//			databaseMetaDataInfo.append(" ]\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY,
//					ResultSet.CONCUR_READ_ONLY));
//			
//			databaseMetaDataInfo.append("\nTYPE_SCROLL_SENSITIVE and CONCUR_READ_ONLY Concurrency [");
//			databaseMetaDataInfo.append(ResultSet.TYPE_SCROLL_SENSITIVE);
//			databaseMetaDataInfo.append(" , ");
//			databaseMetaDataInfo.append(ResultSet.CONCUR_READ_ONLY);
//			databaseMetaDataInfo.append(" ]\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE,
//					ResultSet.CONCUR_READ_ONLY));
//			
//			databaseMetaDataInfo.append("\nTYPE_SCROLL_INSENSITIVE and CONCUR_READ_ONLY Concurrency [");
//			databaseMetaDataInfo.append(ResultSet.TYPE_SCROLL_INSENSITIVE);
//			databaseMetaDataInfo.append(" , ");
//			databaseMetaDataInfo.append(ResultSet.CONCUR_READ_ONLY);
//			databaseMetaDataInfo.append(" ]\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE,
//					ResultSet.CONCUR_READ_ONLY));
//			
//			databaseMetaDataInfo.append("\nTYPE_FORWARD_ONLY and CONCUR_UPDATABLE Concurrency [");
//			databaseMetaDataInfo.append(ResultSet.TYPE_FORWARD_ONLY);
//			databaseMetaDataInfo.append(" , ");
//			databaseMetaDataInfo.append(ResultSet.CONCUR_UPDATABLE);
//			databaseMetaDataInfo.append(" ]\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY,
//					ResultSet.CONCUR_UPDATABLE));
//			
//			databaseMetaDataInfo.append("\nTYPE_SCROLL_SENSITIVE and CONCUR_UPDATABLE Concurrency [");
//			databaseMetaDataInfo.append(ResultSet.TYPE_SCROLL_SENSITIVE);
//			databaseMetaDataInfo.append(" , ");
//			databaseMetaDataInfo.append(ResultSet.CONCUR_UPDATABLE);
//			databaseMetaDataInfo.append(" ]\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE,
//					ResultSet.CONCUR_UPDATABLE));
//			
//			databaseMetaDataInfo.append("\nTYPE_SCROLL_INSENSITIVE and CONCUR_UPDATABLE Concurrency [");
//			databaseMetaDataInfo.append(ResultSet.TYPE_SCROLL_INSENSITIVE);
//			databaseMetaDataInfo.append(" , ");
//			databaseMetaDataInfo.append(ResultSet.CONCUR_UPDATABLE);
//			databaseMetaDataInfo.append(" ]\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE,
//					ResultSet.CONCUR_UPDATABLE));

			/** Getting the ResultSet Holdability */
//			databaseMetaDataInfo.append("\n\n*********** ResultSet Holdability supported by Database ***********");
//			databaseMetaDataInfo.append("\nHOLD_CURSORS_OVER_COMMIT [ ");
//			databaseMetaDataInfo.append(ResultSet.HOLD_CURSORS_OVER_COMMIT);
//			databaseMetaDataInfo.append(" ]\t:\t");
//			databaseMetaDataInfo
//					.append(databaseMetaData.supportsResultSetHoldability(ResultSet.HOLD_CURSORS_OVER_COMMIT));
//			databaseMetaDataInfo.append("\nCLOSE_CURSORS_AT_COMMIT [ ");
//			databaseMetaDataInfo.append(ResultSet.CLOSE_CURSORS_AT_COMMIT);
//			databaseMetaDataInfo.append(" ]\t:\t");
//			databaseMetaDataInfo
//					.append(databaseMetaData.supportsResultSetHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT));

//			databaseMetaDataInfo.append("\nDriverMajorVersion\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getDriverMajorVersion());
//			databaseMetaDataInfo.append("\nDriverMinorVersion\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getDriverMinorVersion());
//			databaseMetaDataInfo.append("\nDefaultTransactionIsolation\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getDefaultTransactionIsolation());
//			databaseMetaDataInfo.append("\nIdentifierQuoteString\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getIdentifierQuoteString());
//			databaseMetaDataInfo.append("\nCatalogSeparator\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getCatalogSeparator());
//			databaseMetaDataInfo.append("\nJDBCMajorVersion\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getJDBCMajorVersion());
//			databaseMetaDataInfo.append("\nJDBCMinorVersion\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getJDBCMinorVersion());
//			databaseMetaDataInfo.append("\nMaxBinaryLiteralLength\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getMaxBinaryLiteralLength());
//			databaseMetaDataInfo.append("\nMaxSchemaNameLength\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getMaxSchemaNameLength());
//			databaseMetaDataInfo.append("\nMaxProcedureNameLength\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getMaxProcedureNameLength());
//			databaseMetaDataInfo.append("\nSchemaTerm\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getSchemaTerm());
//			databaseMetaDataInfo.append("\nExtraNameCharacters\t:\t");
//			databaseMetaDataInfo.append(databaseMetaData.getExtraNameCharacters());

			/** Appending Welcome message */
			databaseMetaDataInfo.append("\n\n************************************\n");
			databaseMetaDataInfo.append("    WELCOME TO JDBC TUTORIALS    ");
			databaseMetaDataInfo.append("\n************************************\n");

			/** Logging the RDBMS DatabaseMetaData Information */
			LogUtil.LOGGER.log(Level.INFO, databaseMetaDataInfo.toString());

		} catch (SQLException sqlException) {
			/** Logging the SQLException for DBMS connection if failed */
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		}
	}

	/**
	 * The main Method
	 * 
	 * @param args String array
	 * @throws SQLException
	 */
	public static void main(String[] args) {
		try {
			if (MYSQL_CONNECTION != null && !MYSQL_CONNECTION.isClosed()) {
				LogUtil.LOGGER.log(Level.INFO, "Database Connection  successully done.");
				MYSQL_CONNECTION.close();
			}
		} catch (SQLException sqlException) {
			LogUtil.LOGGER.log(Level.SEVERE, sqlException.getMessage(), sqlException);
		}
	}
}
