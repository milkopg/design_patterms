package design_patterns.com.milko.training.design_patterns.standard.behavioral.strategy.strategy.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.strategy.context.CreditCard;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.strategy.strategy.base.ValidationStrategy;

public class VisaStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean isValid = false;

		isValid = creditCard.getNumber().startsWith("4");

		if (isValid) {
			isValid = creditCard.getNumber().length() == 16;
		}

		if (isValid) {
			isValid = passesLuhn(creditCard.getNumber());
		}

		return isValid;
	}

}
