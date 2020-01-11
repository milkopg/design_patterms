package design_patterns.com.milko.training.java_refactoring.java_writing_readable_maintainable_code.m3naming;

import java.time.Instant;
import java.time.ZoneId;

public class TimeUtils {

    public static void printNowNewYorkTime(){
        String now = Instant.now().atZone(ZoneId.of("America/New_York")).toString();
        System.out.println(now);
    }
}
