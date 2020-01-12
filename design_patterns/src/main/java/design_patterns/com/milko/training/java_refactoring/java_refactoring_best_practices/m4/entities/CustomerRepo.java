package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.entities;

import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.country.Canada;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.country.France;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.country.US;

public class CustomerRepo {

    public static Customer getUsCustomer(){
        return new Customer(new Address(new US()),21);
    }

    public static Customer getUsUnderAgeCustomer(){
        return new Customer(new Address(new US()), 17);
    }

    public static Customer getFrenchCustomer(){
        return new Customer(new Address(new France()), 18);
    }

    public static Customer getFrenchUnderageCustomer(){
        return new Customer(new Address(new France()), 17);
    }

    public static Customer getCanadianCustomer(){
        return new Customer(new Address(new Canada()),18);
    }
}
