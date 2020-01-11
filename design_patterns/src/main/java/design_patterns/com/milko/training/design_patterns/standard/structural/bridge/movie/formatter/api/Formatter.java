package design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.formatter.api;

import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.model.Detail;

public interface Formatter {
	String format(String header, List<Detail> details);
}
