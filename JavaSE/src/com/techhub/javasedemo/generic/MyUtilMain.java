package com.techhub.javasedemo.generic;

import com.techhub.javasedemo.typecasting.A;
import com.techhub.javasedemo.typecasting.B;
import com.techhub.javasedemo.typecasting.C;
import com.techhub.javasedemo.typecasting.D;
import com.techhub.javasedemo.typecasting.E;

public class MyUtilMain {

	public static void main(String[] args) throws Exception {

//		X value = MyUtil.getObject(1, X.class);
//		System.out.println("value : " + value);

//		String str = null;
//		Number num = 12;
//		Student student = null;
//
//		String isNull = MyUtil.isNull(num);
//		System.out.println("isNull : " + isNull);
		
		
//		MyUtil.printNumber(120);

		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

//		MyUtil.printAType(a);
//		MyUtil.printAType(b);
//		MyUtil.printAType(c);
//		MyUtil.printAType(d);
//		MyUtil.printAType(e);
		

//
//		MyUtil.printAlpha(new AlphaWriter());
//
		MyStorage<A> myStorageA = new MyStorage<A>(a);
		MyStorage<B> myStorageB = new MyStorage<B>(b);
		MyStorage<C> myStorageC = new MyStorage<C>(c);
		MyStorage<D> myStorageD = new MyStorage<D>(d);
		MyStorage<E> myStorageE = new MyStorage<E>(e);
		
//		MyUtil.printMyStorage(myStorageC);
//		MyUtil.printMyStorage(myStorageD);
//		MyUtil.printMyStorage(myStorageE);
//		MyUtil.printMyStorage(myStorageA);
//		MyUtil.printMyStorage(myStorageB);
//		MyUtil.printMyStorage(new MyStorage<String>("Abc"));
		

//		MyUtil.printMyStorage2(myStorageA);
//		MyUtil.printMyStorage2(myStorageB);
//		MyUtil.printMyStorage2(myStorageC);
//		MyUtil.printMyStorage2(myStorageD);
//		MyUtil.printMyStorage2(myStorageE);
//		MyUtil.printMyStorage2(new MyStorage<String>("Abc"));
		
		MyUtil.printMyStorage3(myStorageA);
		MyUtil.printMyStorage3(myStorageB);
		MyUtil.printMyStorage3(myStorageC);
		MyUtil.printMyStorage3(myStorageD);
		MyUtil.printMyStorage3(myStorageE);
		MyUtil.printMyStorage3(new MyStorage<String>("Abc"));
		MyUtil.printMyStorage3(new MyStorage<Boolean>(true));
		MyUtil.printMyStorage3(new MyStorage<Number>(123));
		
	}
}

class Hai{}