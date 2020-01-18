package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.country;

/**
 * Legal age for alcohol is 18
 */
public class France extends Country {

    @Override
    public int getMinimumLegalDrinkingAge() {
        return 18;
    }

}
