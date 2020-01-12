package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m4.handlers;

public class SimpleCurrencyConverter {

    private String currencyTo;

    public SimpleCurrencyConverter(String currencyTo){
        this.currencyTo = currencyTo;
    }

    public double convert(double price){
        if(currencyTo.equalsIgnoreCase("EUR")){
            return price * 0.9;
        } else if (currencyTo.equalsIgnoreCase("CAD")){
            return price* 1.35;
        } else {
            throw new IllegalArgumentException("Unrecognized currency : " + currencyTo);
        }
    }
}
