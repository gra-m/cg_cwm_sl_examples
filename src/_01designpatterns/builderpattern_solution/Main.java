package builderpattern_solution;

public class Main {
public static void main(String[] args) {
	var presentation = new Presentation();
	presentation.addSlide(new Slide("Slide 1"));
	presentation.addSlide(new Slide("Slide 2"));

	var builder = new PdfDocumentBuilder();
	presentation.export(builder);
	var pdf = builder.getPdfDocument();

	var builderM = new MovieBuilder();
	presentation.export(builderM);
	var movie = builderM.getMovie();
}
}
