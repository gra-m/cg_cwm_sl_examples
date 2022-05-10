package _01createwritefiles;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.Run();
}

void Run() {

	CreateAndPrintTasks createAndPrint = new CreateAndPrintTasks();
	createAndPrint.inputTasksAndSaveToFile();
	createAndPrint.outputTasksFromFile();
}
}