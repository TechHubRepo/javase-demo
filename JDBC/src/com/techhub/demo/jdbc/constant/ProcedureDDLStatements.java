package com.techhub.demo.jdbc.constant;

/**
 * The ProcedureDDLStatements class
 * 
 * @author ramniwash
 *
 */
public class ProcedureDDLStatements {

	/** Private constructor to avoid object creation */
	private ProcedureDDLStatements() {
	}

	/** The CREATE_GET_COFEE_PRICE_BY_COFEE_NAME */
	public static final String CREATE_GET_COFEE_PRICE_BY_COFEE_NAME = "CREATE PROCEDURE getCofeePriceByCofeeName(IN cofeeName VARCHAR(32),OUT cofeePrice DOUBLE) BEGIN SELECT PRICE FROM COFFEES WHERE COF_NAME=cofeeName INTO cofeePrice; END";

	/** The DROP_GET_COFEE_PRICE_BY_COFEE_NAME */
	public static final String DROP_GET_COFEE_PRICE_BY_COFEE_NAME = "DROP PROCEDURE jdbc_demo.getCofeePriceByCofeeName;";

	/** The DROP_GET_COFEE_PRICE_BY_COFEE_NAME */
	public static final String CALL_GET_COFEE_PRICE_BY_COFEE_NAME = "{CALL getCofeePriceByCofeeName(?, ?)}";
}