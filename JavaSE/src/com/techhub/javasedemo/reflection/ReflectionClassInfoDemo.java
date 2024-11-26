package com.techhub.javasedemo.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import com.techhub.javasedemo.annodemo.Table;

public class ReflectionClassInfoDemo {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static void main(String[] args) throws Exception {

//		Class<Person> personClass = Person.class;
		Class<Person> personClass = (Class<Person>) Class.forName("com.techhub.javasedemo.reflection.Person");
	
//		System.out.println("*********** Class Information ***********");
//		System.out.println("Full Qualified Class Name :\n\t" + personClass.getName());
//		System.out.println("Simle Class Name :\n\t" + personClass.getSimpleName());
//		System.out.println("Package Name :\n\t" + personClass.getPackageName());
//		System.out.println("CanonicalName :\n\t" + personClass.getCanonicalName());
//		System.out.println("TypeName :\n\t" + personClass.getTypeName());

//		System.out.println(ANSI_YELLOW + "\n*********** Class Annotations ***********");
//		Annotation annotations[] = personClass.getAnnotations();
//		for (Annotation annotation : annotations) {
//			Table table=(Table)annotation;
//			System.out.println("Annotation Name :\n\t" + annotation);
//		}

//		System.out.println(ANSI_CYAN + "\n*********** Class Fileds Information ***********");
//		Field[] fields = personClass.getDeclaredFields();
//		for (Field field : fields) {
//			StringBuilder fieldInfo = new StringBuilder();
//			fieldInfo.append("\tAccess Modifiers :\t");
//			fieldInfo.append(Modifier.toString(field.getModifiers()));
//			fieldInfo.append("\n\tName :\t");
//			fieldInfo.append(field.getName());
//			fieldInfo.append("\n\tType :\t");
//			fieldInfo.append(field.getGenericType().getTypeName());
//
//			Annotation fieldAnnotations[] = field.getAnnotations();
//			for (Annotation fieldAnnotation : fieldAnnotations) {
//				fieldInfo.append("\n\tAnnotation :\t");
//				fieldInfo.append(fieldAnnotation);
//			}
//			fieldInfo.append("\n-------------------------");
//			System.out.println(fieldInfo);
//		}

//		System.out.println(ANSI_GREEN + "\n*********** Constructor Information ***********");
//		Constructor<?> constructors[] = personClass.getConstructors();
//		for (Constructor<?> constructor : constructors) {
//			String cName = constructor.getName();
//			int parameterCounts = constructor.getParameterCount();
//			System.out.println("Access Modifers : "+Modifier.toString(constructor.getModifiers()));
//			System.out.println("Constructor Name :\n\t" + cName);
//			System.out.println("Constructor Parameter Count :\n\t" + parameterCounts);
//			Parameter parameters[] = constructor.getParameters();
//			byte paramCounts = 1;
//			for (Parameter parameter : parameters) {
//				String parameterName = parameter.getName();
//				Class<?> parameterNameType = parameter.getType();
//				System.out.println("Parameter Info : " + paramCounts);
//				System.out.println("\tType : " + parameterNameType.getSimpleName() + ",  Name : " + parameterName);
//				paramCounts++;
//			}
//			System.out.println("-----------------------------------");
//		}

		System.out.println(ANSI_PURPLE + "\n*********** Method Information ***********");
		Method methods[] = personClass.getMethods();

		for (Method method : methods) {
			StringBuilder methodInfo = new StringBuilder();
			methodInfo.append("\tAccess Modifiers :\t");
			methodInfo.append(Modifier.toString(method.getModifiers()));
			methodInfo.append("\n\tMethod Name : \t");
			methodInfo.append(method.getName());
			methodInfo.append("\n\tMethod Return Type : \t");
			methodInfo.append(method.getReturnType().getSimpleName());
			Parameter parameters[] = method.getParameters();
			methodInfo.append("\n\tMethod Parameter Info");
			for (Parameter parameter : parameters) {
				methodInfo.append("\n\t\tParameter Type : ");
				methodInfo.append(parameter.getType().getSimpleName());
				methodInfo.append(", Parameter Name : ");
				methodInfo.append(parameter.getName());
			}
			System.out.println("-----------------------------------");
			System.out.println(methodInfo);
		}
	}
}
