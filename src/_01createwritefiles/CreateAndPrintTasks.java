package _01createwritefiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

class CreateAndPrintTasks {

public void inputTasksAndSaveToFile() {
	try {
		inputTasks();
	}catch (FileNotFoundException fnfe) {
		System.out.println("Input file not found");
	} catch (IOException ioe) {
		System.out.println("Error appending inputs");
	}
}

public void outputTasksFromFile()  {
	try{
		outputTasks();
	} catch (FileNotFoundException fnfe) {
		System.out.println("Output file not found");
	}
}

private void inputTasks() throws IOException {
	Scanner input = new Scanner(System.in);
	Formatter formatter = new Formatter("tasks.txt");
	int count = 0;
	while(count<3) {
		formatter.out().append(input.next()).append("\n");
		count++;
	}
	formatter.close();
}

private void outputTasks() throws FileNotFoundException {
	File retrieved =  new File("tasks.txt");
	Scanner scanner = new Scanner(retrieved);
	while(scanner.hasNext()) {
		System.out.println(scanner.next());
	}
	scanner.close();

}

}
