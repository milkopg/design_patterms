package design_patterns.com.milko.training.java_refactoring.java_writing_readable_maintainable_code.m3naming;

public class StringUtils {

    public static int countOccurrences(String stringToSearch, char charToFind){
        int count = 0;
        for (int i=0; i < stringToSearch.length(); i++){
            if (stringToSearch.charAt(i) == charToFind){
                count++;
            }
        }
        return count;
    }
}
