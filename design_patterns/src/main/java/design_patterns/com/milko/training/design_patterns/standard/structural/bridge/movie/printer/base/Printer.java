package design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.printer.base;

import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.formatter.api.Formatter;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.model.Detail;

public abstract class Printer {
	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}

	protected abstract List<Detail> getDetails();

	protected abstract String getHeader();
}
