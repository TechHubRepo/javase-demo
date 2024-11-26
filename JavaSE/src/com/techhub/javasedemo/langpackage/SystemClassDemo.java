package com.techhub.javasedemo.langpackage;

public class SystemClassDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("Program Started");
		System.err.println("Error to show");
		
//		int []a= {8,9,6,9,3,4,11,8};
//		int []b =new int[20];
		
//		System.arraycopy(a, 2, b, 3, 4);
//		printArray(a);
//		System.out.println("\n");
//		printArray(b);

//		System.out.println("Enter Line : ");
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String line = reader.readLine();
//		System.out.println("Entered line : " + line);
		
//		long times=System.currentTimeMillis();
//		long times=System.nanoTime();
//		System.err.println(times);

//		Properties properties = System.getProperties();
//		Set<Object> keys = properties.keySet();
//		for (Object key : keys) {
//			System.out.println("Key : " + key + " , Value :" + properties.getProperty(key.toString()));
//		}

//		String osName = System.getProperty("os.name");
//		System.out.println("OS Name : " + osName);
		
//		System.out.println("lineSeparator : " + System.lineSeparator());
		
//		System.exit(0);

//		System.gc();
		
//		System.load("some Windows or Linux or mac based libs");

//		Map<String, String> envMap = System.getenv();
//		envMap.forEach((key, value) -> {
//			System.out.println("Key : " + key + " , Value :" + value);
//		});

//		System.out.println(System.inheritedChannel());

//		  SecurityManager s = System.getSecurityManager();

//		Logger logger=System.getLogger("My Logger");
//		logger.log(Level.INFO, "This is Information ........ [Logger]");
//		logger.log(Level.ERROR, "This is error ........ [Logger]");
//		logger.log(Level.WARNING, "This is Warning ........ [Logger]");

//		System.exit(0);
//		Person person=new Person("Ram");
//		person=null;
//		System.runFinalization();
//		System.gc();
		System.out.println("Program End");
	}
	
	public static void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+",");
		}
	}
}
