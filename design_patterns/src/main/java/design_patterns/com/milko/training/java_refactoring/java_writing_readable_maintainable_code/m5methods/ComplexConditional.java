package design_patterns.com.milko.training.java_refactoring.java_writing_readable_maintainable_code.m5methods;

import java.time.LocalTime;

public class ComplexConditional {

    public static void main(String[] args){

        int hour = getHourOfDay();

        if(isDay(hour)){
            // day time logic

        } else {
            // night time logic
        }
    }

    private static boolean isDay(int hour){
        return hour > 6 && hour < 22;
    }

    private static int getHourOfDay() {
        return LocalTime.now().getHour();
    }
}
