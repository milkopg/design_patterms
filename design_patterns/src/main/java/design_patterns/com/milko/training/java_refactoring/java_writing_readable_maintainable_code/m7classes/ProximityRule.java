package design_patterns.com.milko.training.java_refactoring.java_writing_readable_maintainable_code.m7classes;

public class ProximityRule {


    void methodA(){
        methodB();
    }

    private void methodB() {
        methodC();
    }

    private void methodC() {
        doThatThing();
    }

    void doThatThing(){

    }


    void someOtherMethod(){

    }





    void yetAnotherMethod(){

    }








}
