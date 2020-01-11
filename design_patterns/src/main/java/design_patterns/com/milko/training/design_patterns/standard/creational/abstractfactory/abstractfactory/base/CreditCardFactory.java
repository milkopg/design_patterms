package design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.base;

import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.enums.CardType;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.impl.AmexFactory;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.impl.VisaFactory;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.creditcard.base.CreditCard;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.validator.base.Validator;

public abstract class CreditCardFactory {
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if (creditScore >= 650) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard (CardType cardType);
	
	public abstract Validator getValidator (CardType cardType);
}
