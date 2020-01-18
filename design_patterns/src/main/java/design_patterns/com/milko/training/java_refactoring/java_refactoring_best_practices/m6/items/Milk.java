package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.items;

public class Milk extends Item {

    @Override
    public double price() {
        return 1;
    }

    @Override
    public boolean isAgeRestrictedItem() {
        return false;
    }
}
