package design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.validator.impl;

import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.creditcard.base.CreditCard;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.validator.base.Validator;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
