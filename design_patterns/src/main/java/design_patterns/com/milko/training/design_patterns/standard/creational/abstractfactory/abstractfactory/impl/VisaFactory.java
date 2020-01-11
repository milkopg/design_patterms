package design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.impl;

import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.base.CreditCardFactory;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.enums.CardType;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.creditcard.base.CreditCard;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.creditcard.impl.VisaBlackCreditCard;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.creditcard.impl.VisaGoldCreditCard;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.validator.base.Validator;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.validator.impl.VisaValidator;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				
				return new VisaGoldCreditCard();
	
			case PLATINUM:
				
				return new VisaBlackCreditCard();	
			
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
