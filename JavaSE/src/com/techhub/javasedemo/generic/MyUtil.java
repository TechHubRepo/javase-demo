package com.techhub.javasedemo.generic;

import com.techhub.javasedemo.typecasting.A;
import com.techhub.javasedemo.typecasting.C;

public class MyUtil {

	public static <T> T getObject(int id, Class<T> clss) throws Exception {
		if (id == 1 || id == 2) {
			return (T) clss.getConstructor().newInstance();
		} else {
			return null;
		}
	}

	public static <T> String isNull(T t) {
		return t == null ? "Yes" : "No";
	}

	public static <W extends Number> void printNumber(W utype) {
		System.out.println(utype);
	}

	public static <V extends A> void printAType(V  atype) {
		System.out.println(atype);
	}

	public static <B extends X & Y & Z> void printAlpha(B type) {
		System.out.println(type.getX() + " , " + type.getY() + " , " + type.getZ());
	}

	
	public static <T> void printMyStorage(MyStorage<? extends C> myStorage) {
		System.out.println(myStorage.getData());
	}

	public static <T> void printMyStorage2(MyStorage<? super C> myStorage) {
		System.out.println(myStorage.getData());
	}
	
	public static <T> void printMyStorage3(MyStorage<?> myStorage) {
		System.out.println(myStorage);
	}
}
