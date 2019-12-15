package design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.validator.base;

import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.creditcard.base.CreditCard;

public interface Validator {
	public boolean isValid(CreditCard creditCard);
}
