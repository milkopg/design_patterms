package design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.main;

import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.base.CreditCardFactory;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.abstractfactory.enums.CardType;
import design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.creditcard.base.CreditCard;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(card2.getClass());
	}

}
