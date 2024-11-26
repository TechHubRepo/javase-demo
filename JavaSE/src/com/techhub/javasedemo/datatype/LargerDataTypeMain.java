package com.techhub.javasedemo.datatype;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LargerDataTypeMain {

	public static void main(String[] args) {

		BigInteger a = new BigInteger("922337203685477580745324565463465364634632643634346436234626452365654634534563466");
		BigInteger b = new BigInteger("1342623463464361634634265256456456436346523525536354635463645634563563563663456346346");
		a = a.add(b);
		System.out.println(a);

		BigDecimal c = new BigDecimal("456454564564564.45465456456364563");
		BigDecimal d = new BigDecimal("456454564564564.45465456456634563654");
		c = c.add(d);
		
		System.out.println(c);
	}
}
