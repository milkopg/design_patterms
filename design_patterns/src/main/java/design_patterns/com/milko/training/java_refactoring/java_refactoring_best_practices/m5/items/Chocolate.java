package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.items;

public class Chocolate extends Item {
    
    public double price() {
        return 1;
    }

    @Override
    public boolean isAgeRestrictedItem() {
        return false;
    }
}