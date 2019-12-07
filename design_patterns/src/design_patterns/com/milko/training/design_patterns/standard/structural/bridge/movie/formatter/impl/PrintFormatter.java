package design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.formatter.impl;

import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.formatter.api.Formatter;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.movie.model.Detail;

public class PrintFormatter implements Formatter{

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append(header);
		builder.append("\n");

		for (Detail detail : details) {
			builder.append(detail.getLabel());
			builder.append(":");
			builder.append(detail.getValue());
			builder.append("\n");
		}

		return builder.toString();
	}
}
