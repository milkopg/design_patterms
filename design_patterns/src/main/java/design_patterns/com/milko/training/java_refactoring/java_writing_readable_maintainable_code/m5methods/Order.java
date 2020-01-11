package design_patterns.com.milko.training.java_refactoring.java_writing_readable_maintainable_code.m5methods;

public class Order {

    private long expirationDate;

    public void setExpirationDate(long time) {
        this.expirationDate = time;
    }

    public long getExpirationDate(){
        return expirationDate;
    }
}
