package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.country;

public abstract class Country {

    public abstract int getMinimumLegalDrinkingAge();

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
