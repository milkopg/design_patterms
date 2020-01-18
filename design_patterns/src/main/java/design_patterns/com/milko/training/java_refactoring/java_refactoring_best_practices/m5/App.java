package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5;



import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.country.Country;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.country.US;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.entities.Address;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.entities.Customer;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.entities.CustomerRepo;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.entities.Membership;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.entities.Order;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.handlers.SimpleCurrencyConverter;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.items.Cheese;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.items.Wine;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.handlers.CheckoutHandler;

public class App {


    public static void main(String[] args){



   

        Order order = new Order(CustomerRepo.getUsCustomer());

        order.add(new Wine());
        order.add(new Cheese());
        order.setVoucher("DummyVoucher");
        
        Customer customer1 = new Customer(Membership.GOLD, new Address(new US()), 21);
        order.setCustomer(customer1);
        
        CheckoutHandler checkout = new CheckoutHandler();
        double total = checkout.calculateTotal(order);

       
        SimpleCurrencyConverter converter = new SimpleCurrencyConverter("EUR");
        System.out.println("Price in USD: " + total);
        System.out.println("Hardcoded in EUR: " + converter.convert(total));
        System.out.println("From a WebService in EUR: " + converter.convertWithWebService(total));

        
     


    }
}
