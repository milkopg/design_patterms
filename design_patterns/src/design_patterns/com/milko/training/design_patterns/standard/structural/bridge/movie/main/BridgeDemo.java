package design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.main;

import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.formatter.api.Formatter;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.formatter.impl.HtmlFormatter;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.formatter.impl.PrintFormatter;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.model.Detail;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.model.Movie;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.printer.base.Printer;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.printer.impl.MoviePrinter;

public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2:15");
		movie.setYear("2014");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		String printedMaterial = moviePrinter.print(printFormatter);
		
		System.out.println(printedMaterial);
		
		
		Formatter htmlFormatter = new HtmlFormatter();
		String htmlMaterial = moviePrinter.print(htmlFormatter);
		
		System.out.println(htmlMaterial);
	}

}
