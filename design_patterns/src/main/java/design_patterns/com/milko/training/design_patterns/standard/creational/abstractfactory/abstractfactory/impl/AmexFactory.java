package design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.impl;

import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.base.CreditCardFactory;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.enums.CardType;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.creditcard.base.CreditCard;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.creditcard.impl.AmexGoldCreditCard;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.creditcard.impl.AmexPlatinumCreditCard;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.validator.base.Validator;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.validator.impl.AmexGoldValidator;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.validator.impl.AmexPlatinumValidator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				return new AmexGoldCreditCard();
	
			case PLATINUM:
				return new AmexPlatinumCreditCard();	
				
			default:
				break;
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				
				return new AmexGoldValidator();
	
			case PLATINUM:
				
				return new AmexPlatinumValidator();	
		
		}
		
		return null;
	}

}
