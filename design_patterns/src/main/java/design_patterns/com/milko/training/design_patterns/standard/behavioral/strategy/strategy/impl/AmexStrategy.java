package design_patterns.com.milko.training.design_patterns.standard.behavioral.strategy.strategy.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.strategy.context.CreditCard;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.strategy.strategy.base.ValidationStrategy;

public class AmexStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean isValid = false;
		isValid = creditCard.getNumber().startsWith("37") || creditCard.getNumber().startsWith("34");

		if (isValid) {
			isValid = creditCard.getNumber().length() == 15;
		}

		if (isValid) {
			isValid = passesLuhn(creditCard.getNumber());
		}

		return isValid;

	}
}
