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
 */


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class _04ReadingAFile_CGSolution {
public static void main(String[] args) throws Exception {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String fileName = reader.readLine();
	FileInputStream fileInputStream = new FileInputStream("src/inputoutputfiles/" + fileName);

	Scanner scanner = new Scanner(fileInputStream);
	StringBuilder builder = new StringBuilder();

	while (scanner.hasNextLine()) {
		builder.append(scanner.nextLine()).append("\n");
	}

	System.out.println(builder.toString());

	scanner.close();
	reader.close();
}
}
