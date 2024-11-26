package com.techhub.demo.jdbc.constant;

/**
 * The ProcedureDMLStatements class
 * 
 * @author ramniwash
 *
 */
public class ProcedureDMLStatements {

	/** Private constructor to avoid object creation */
	private ProcedureDMLStatements() {
	}

	/** The DROP_GET_COFEE_PRICE_BY_COFEE_NAME */
	public static final String CALL_GET_COFEE_PRICE_BY_COFEE_NAME = "{CALL getCofeePriceByCofeeName(?, ?)}";
}