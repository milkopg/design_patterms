package design_patterns.com.milko.training.java_refactoring_to_design_patterns.java_writing_readable_maintainable_code.m5methods;

public class FailFast {


    public static void main(String[] args){

        int total = getTotalCompensation(0);

        System.out.println(total);
    }

    private static int getTotalCompensation(int someBonusVariable) {

        if(someBonusVariable <= 0){
           throw new IllegalArgumentException("variable can't be < 0 ");
      }

        int intermediateResult = getBaseSalary() * someBonusVariable;

        int secondIntermediateResult = convertToLocalCurrency(intermediateResult);

        return getSomeOtherMetric() / secondIntermediateResult;
    }




    private static int convertToLocalCurrency(int intermediateResult) {
        return intermediateResult*2;
    }

    private static int getSomeOtherMetric() {
        return 5;
    }

    private static int getBaseSalary() {
        return 1000;
    }


}
