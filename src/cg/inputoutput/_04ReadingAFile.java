package cg.inputoutput;
/*
1. Read a file name from the console.
2. Display the contents of the file in the console (on the screen).
3. Don't forget to free up resources. Close the streams for file input and keyboard input.
Requirements:

    •
    The program must read the file name from the console.
    •
    The program must display the contents of the file.
    •
    You must close the file input stream (FileInputStream).
    •
    The BufferedReader must also be closed.
    Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
int age = scanner.nextInt();

 */


import java.io.*;

public class _04ReadingAFile {
public static void main(String[] args) throws Exception {
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	String fileName;
	InputStream inputStream = null;
	BufferedInputStream bufferedInputStream = null;

	try {

		System.out.println("Enter file name:");
		fileName = input.readLine();

		inputStream = new FileInputStream("src/inputOutputFiles/" + fileName);
		bufferedInputStream = new BufferedInputStream(inputStream);

		while (bufferedInputStream.available() > 0) {
			char c = (char) bufferedInputStream.read();
			System.out.println(c);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		inputStream.close();
		bufferedInputStream.close();
		input.close();

	}
}
}
