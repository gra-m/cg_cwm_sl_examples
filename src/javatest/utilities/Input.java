package javatest.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.Objects.isNull;

public class Input {
private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

public static String getStringInput(String question) {
	if (isNull(question) || question.isEmpty())
		throw new IllegalArgumentException("@getStringInput question was null or empty");
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println(question + " :");
	try {
		return bufferedReader.readLine();
	} catch (IOException io) {
		io.getStackTrace();
	} finally {
		// todo Interesting.
		/*try {
			bufferedReader.close();
		} catch (IOException io) {
			io.getStackTrace();
		}*/
		System.out.println("Trying to close bufferedreader and recreate with every use made this fail");
	}
	return null;
}

public static Integer getIntegerInput(String question) {
	THIS_IS_A_LABEL: if (isNull(question) || question.isEmpty())
		throw new IllegalArgumentException("@getIntegerInput question was null or empty");
	System.out.println(question + " :");
	try {
		//return Integer.parseInt(bufferedReader.readLine()); // parse int returns int
		return Integer.valueOf(bufferedReader.readLine()); // Integer valueOf == Integer
	} catch (IOException io) {
		io.printStackTrace();
	}
	return null;
	}
}
