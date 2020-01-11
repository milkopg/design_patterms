package design_patterns.com.milko.training.java_refactoring_to_design_patterns.java_writing_readable_maintainable_code.m4constructors;

public class BankAccount {

    private double balance;
    private double interest;

    BankAccount(){}

    BankAccount(double balance){
        if(balance < 0){
            throw new IllegalArgumentException("Starting balance can't be less than 0");
        }
        this.balance = balance;
    }

    BankAccount(double balance, double interest){
        if(interest < 0){
            throw new IllegalArgumentException("Interest rate can't be less than 0");
        }
        if(balance < 0){
            throw new IllegalArgumentException("Starting balance can't be less than 0");
        }
        this.balance = balance;
        this.interest = interest;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(long interest) {
        this.interest = interest;
    }
}
