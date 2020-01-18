package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.entities;

public class Phone {

    private final String fullNumber;

    public Phone(String number) {
        this.fullNumber = number;
    }

    public String getInternationalFormat(){
        return this.getInternationalPrefix() +
               this.getPrefix() +
               this.getNumber();
    }

    public String getInternationalPrefix(){
        return "00";
    }

    public String getAreaCode() {
        return fullNumber.substring(0,3);
    }
    public String getPrefix() {
        return fullNumber.substring(3,6);
    }
    public String getNumber() {
        return fullNumber.substring(6,10);
    }

    



}
