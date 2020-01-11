package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4;



import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.entities.CustomerRepo;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.entities.Order;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.handlers.SimpleCurrencyConverter;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.items.Cheese;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.items.Wine;

public class App {


    public static void main(String[] args){



        SimpleCurrencyConverter converter = new SimpleCurrencyConverter("EUR");
        System.out.println(converter.convert(12));



        Order order = new Order(CustomerRepo.getUsCustomer());

        order.add(new Wine());
        order.add(new Cheese());

        System.out.println("Items added for US Customer:" + order.getItems());



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
