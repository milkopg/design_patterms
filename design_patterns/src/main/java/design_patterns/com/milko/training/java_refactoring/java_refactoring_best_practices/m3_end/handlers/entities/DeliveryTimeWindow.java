package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.entities;

import java.time.LocalDate;

public class DeliveryTimeWindow {
	private LocalDate start;
	private LocalDate end;

	private DeliveryTimeWindow() {
		LocalDate now = LocalDate.now();
		this.start = now;
		this.end = now;
	}

	public DeliveryTimeWindow(LocalDate start, LocalDate end) {
		this.start = start;
		this.end = end;
	}

	public static DeliveryTimeWindow deliveryTimeWindow() {
		return new DeliveryTimeWindow();
	}

	public DeliveryTimeWindow startInDays(int daysNum) {
		this.start = getStart().plusDays(daysNum);
		return this;
	}

	public DeliveryTimeWindow endInDays(int daysNum) {
		this.end = getEnd().plusDays(daysNum);
		return this;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getEnd() {
		return end;
	}

	public void setEnd(LocalDate end) {
		this.end = end;
	}

}
