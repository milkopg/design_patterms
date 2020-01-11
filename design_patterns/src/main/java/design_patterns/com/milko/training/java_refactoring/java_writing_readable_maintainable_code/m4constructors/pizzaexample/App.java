package design_patterns.com.milko.training.java_refactoring.java_writing_readable_maintainable_code.m4constructors.pizzaexample;

public class App {


    public static void main(String[] args){
        Pizza pizza = new Pizza.Builder(12)
                                .cheese(true)
                                .ham(true)
                                .build();
        // deliver pizza
    }
}
