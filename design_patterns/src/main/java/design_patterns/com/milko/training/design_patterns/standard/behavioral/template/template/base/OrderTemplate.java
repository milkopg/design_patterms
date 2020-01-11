package design_patterns.com.milko.training.design_patterns.standard.behavioral.template.template.base;

public abstract class OrderTemplate {
	protected boolean isGift;
	protected abstract void doCheckout();
	protected abstract void doPayment();
	protected abstract void doReceipt();
	protected abstract void doDelivery();
	
	public final void wrapGift() {
		System.out.println("Gift is wrapped");
	}
	
	public final void processOrder() {
		doCheckout();
		doPayment();
		if (isGift) {
			wrapGift();
		} else {
			doReceipt();
		}
		doDelivery();
	}
}
