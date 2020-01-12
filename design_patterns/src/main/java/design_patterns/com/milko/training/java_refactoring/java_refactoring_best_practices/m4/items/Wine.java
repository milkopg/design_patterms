package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.items;

public class Wine extends Item {

    @Override
    public double price() {
        return 3;
    }

    @Override
    public boolean isAgeRestrictedItem() {
        return true;
    }
}
