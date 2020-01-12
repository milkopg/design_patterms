package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.country;

/**
 * Legal age for alcohol is 21
 */
public class US extends Country {

    @Override
    public int getMinimumLegalDrinkingAge() {
        return 21;
    }

}
