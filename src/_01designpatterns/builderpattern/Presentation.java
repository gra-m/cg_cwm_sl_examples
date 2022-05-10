package builderpattern;

import java.util.ArrayList;
import java.util.List;

// 1. Violates open closed principle
// 2. Tight coupling between Presentation class and other classes.
// 3. Presentation class gets bloated with info about the classes it
// presents.
// 4. Repetition in exportation logic.




class Presentation {
	private List<Slide> slides = new ArrayList<>();

	public void addSlide(Slide slide) {
		slides.add(slide);
	}

	public void export(PresentationFormat format) {
		if (format == PresentationFormat.PDF) {
			var pdf = new PdfDocument();
			pdf.addPage("Copyright notice");
			for (Slide slide: slides)
				pdf.addPage(slide.getText());
		} else if (format == PresentationFormat.MOVIE) {
			var movie = new Movie();
			movie.addFrame("Copyright notice", 3);
			for (Slide slide: slides) // 3 should be hard coded constant
				movie.addFrame(slide.getText(), 3);
		}

	}
}
