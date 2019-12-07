package design_patterns.com.milko.training.design_patterns.standard.structural.composite.main;

import design_patterns.com.milko.training.design_patterns.standard.structural.composite.impl.Menu;
import design_patterns.com.milko.training.design_patterns.standard.structural.composite.impl.MenuItem;

public class CompositeMenuDemo {

	public static void main(String[] args) {
		Menu mainMenu = new Menu("Main", "/main");
		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
		mainMenu.add(safetyMenuItem);
	
		Menu claimsSubMenu = new Menu("Clailms", "/claimns");
		mainMenu.add(claimsSubMenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
		claimsSubMenu.add(personalClaimsMenu);
		System.out.println(mainMenu.toString());
	}

}
