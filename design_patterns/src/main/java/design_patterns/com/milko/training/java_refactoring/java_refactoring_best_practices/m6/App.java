package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6;

import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.entities.Customer;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.entities.CustomerRepo;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.entities.Order;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.handlers.CheckoutHandler;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.handlers.SimpleCurrencyConverter;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.items.Cheese;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.items.Chocolate;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.items.Wine;

public class App {


    public static void main(String[] args){


        Customer customer = CustomerRepo.getUsCustomer();
        Order order = new Order(customer);

        order.add(new Chocolate());
        order.add(new Cheese());

        CheckoutHandler checkout = new CheckoutHandler();
        double total = checkout.calculateTotal(order);


        SimpleCurrencyConverter converter = SimpleCurrencyConverter.getEurConverter();


        System.out.println("Price in USD: " + total);

        if(!customer.getAddress().getCountry().toString().equalsIgnoreCase("US")){
            System.out.println("Hard-coded in EUR: " + converter.convert(total));
            System.out.println("From a Web Service in EUR: " + converter.convertWithWebService(total));
        }

        if(!customer.getCountry().equalsIgnoreCase("US")){
            // print in EUR
        }



        // ---- 2nd Order ---- //

        Order order2 = new Order(CustomerRepo.getUsUnderAgeCustomer());

        order2.addWithCheck2(new Wine());
        order2.addWithCheck2(new Cheese());

        System.out.println("Items added for underage US customer:" + order2.getItems());



        // ---- 3rd Order ---- //

        Order order3 = new Order(CustomerRepo.getCanadianCustomer());

        order3.addWithCheck2(new Wine());
        order3.addWithCheck2(new Cheese());

        System.out.println("Items added for Canadian customer:" + order3.getItems());




    }
}
