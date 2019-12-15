package design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.creditcard.base;

public abstract class CreditCard {
	protected int cardNumberLength;

	protected int cscNumber;

	public int getCardNumberLength() {
		return cardNumberLength;
	}

	public void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}

	public int getCscNumber() {
		return cscNumber;
	}

	public void setCscNumber(int cscNumber) {
		this.cscNumber = cscNumber;
	}
}
