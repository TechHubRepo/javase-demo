package com.techhub.java8.features.base64;

import java.util.Arrays;
import java.util.Base64;
import java.util.logging.Logger;

import com.techhub.java8.features.thisinmethodparam.HelloMain;

public class Base64Demo {

	/** The Logger LOGGER */
	private static Logger LOGGER = Logger.getLogger(HelloMain.class.getSimpleName());

	public static void main(String[] args) {

		byte input[] = {'a','b','c','d','e'};

		Base64.Encoder encoder = Base64.getEncoder();

		byte encoded[] = encoder.encode(input);
		
		Base64.Decoder decoder = Base64.getDecoder();

		byte decoded[] = decoder.decode(encoded);

		printArray(input);
		printArray(encoded);
		printArray(decoded);
	}

	private static void printArray(byte array[]) {
		LOGGER.info(Arrays.toString(array));
	}
}
