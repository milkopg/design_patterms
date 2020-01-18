package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.items;

public abstract class Item {

    public abstract double price();

    public abstract boolean isAgeRestrictedItem();

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
