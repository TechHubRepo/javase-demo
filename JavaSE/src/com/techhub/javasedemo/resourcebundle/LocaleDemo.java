package com.techhub.javasedemo.resourcebundle;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		
		Locale locale=Locale.getDefault();
//		Locale locale=new Locale("sa", "IN");
//		Locale locale=new Locale("hi", "IN");
//		Locale locale=new Locale("kn", "IN");
//		Locale locale=new Locale("te", "IN");
//		Locale locale=new Locale("mr", "IN");
//		Locale locale=new Locale("ks", "IN");
//		Locale locale=new Locale("doi", "IN");
//		Locale locale=new Locale("bho", "IN");
//		Locale locale=new Locale("bh", "IN");
//		Locale locale=new Locale("bn", "IN");
//		Locale locale=new Locale("pa", "IN");
//		Locale locale=new Locale("or", "IN");
//		Locale locale=new Locale("ta", "IN");
//		Locale locale=Locale.KOREA;
//		Locale locale=Locale.JAPAN;
//		Locale locale=Locale.CHINA;
//		Locale locale=Locale.US;
//		Locale locale=Locale.UK;

		System.out.println("locale : "+locale);
		System.out.println("getLanguage() : "+locale.getLanguage());
		System.out.println("getCountry() : "+locale.getCountry());
		System.out.println("getDisplayName() : "+locale.getDisplayName());
		System.out.println("toLanguageTag() : "+locale.toLanguageTag());		
	}
}
