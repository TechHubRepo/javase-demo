package com.techhub.javasedemo.resourcebundle;

import java.util.Currency;
import java.util.Locale;
import java.util.Set;

public class CurrencyDemo {

	public static void main(String[] args) {
		
		Locale locale=new Locale("hi","IN");
		
//		Currency bhartiyaCurrency=Currency.getInstance(locale);
//				
//		StringBuilder builder=new StringBuilder();
//		builder.append(bhartiyaCurrency.getCurrencyCode());
//		builder.append(" | ");
//		builder.append(bhartiyaCurrency.getDisplayName());
//		builder.append(" | ");
//		builder.append(bhartiyaCurrency.getSymbol());
//		builder.append(" | ");
//		builder.append(bhartiyaCurrency.getNumericCode());
//		System.out.println(builder);
		
		Set<Currency> currencies=Currency.getAvailableCurrencies();
		for(Currency currency :currencies ) {
			StringBuilder cBuilder=new StringBuilder();
			cBuilder.append(currency.getCurrencyCode());
			cBuilder.append(" | ");
			cBuilder.append(currency.getDisplayName());
			cBuilder.append(" | ");
			cBuilder.append(currency.getSymbol());
			cBuilder.append(" | ");
			cBuilder.append(currency.getNumericCode());
			System.out.println(cBuilder);
		}
	}
}
