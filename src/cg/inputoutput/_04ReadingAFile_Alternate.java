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
import java.util.Scanner;

class _04ReadingAFile_Alternate {
public static void main(String[] args) throws IOException {
	String fileName;
	FileInputStream fileInputStream = null;
	Scanner input = new Scanner(new InputStreamReader(System.in));

	try {

		System.out.println("Enter file name: ");
		fileName = input.nextLine();

		fileInputStream = new FileInputStream("src/inputoutputfiles/" + fileName);

		while (fileInputStream.available() > 0) {
			char c = (char) fileInputStream.read();
			System.out.println(c);
		}
	} catch (IOException ioe) {
		ioe.printStackTrace();
	} finally {
		fileInputStream.close();
		input.close();
	}


}
}
