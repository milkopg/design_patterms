package design_patterns.com.milko.training.java_refactoring.java_writing_readable_maintainable_code.m3naming;

import java.util.Random;

public class NumberUtils {

    public static int generateRandomNumberBetween(int low, int high){
        return new Random().nextInt(high-low) + low;
    }

    public static double convertCurrency(){
        return 0;
    }
}
