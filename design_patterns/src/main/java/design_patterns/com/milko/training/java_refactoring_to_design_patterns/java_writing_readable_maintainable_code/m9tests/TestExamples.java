package design_patterns.com.milko.training.java_refactoring_to_design_patterns.java_writing_readable_maintainable_code.m9tests;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import design_patterns.com.milko.training.java_refactoring_to_design_patterns.java_writing_readable_maintainable_code.m5methods.MethodWithTooManyArguments;
import design_patterns.com.milko.training.java_refactoring_to_design_patterns.java_writing_readable_maintainable_code.m5methods.Order;

public class TestExamples {


    @Test
    public void basicMathTest(){

        assertEquals(2, 6/3);

        assertEquals(4, 2*2);
    }













    @Test
    public void divisionWorks(){
        assertEquals(2, 6/3);
    }

    @Test
    public void multiplicationWorks(){
        assertEquals(4, 2*2);
    }








    @Test
    public void testOrderExpirationData(){

        // Arrange
        long tomorrow = MethodWithTooManyArguments.nowPlusDays(1);
        Order order = new Order();

        // Act
        order.setExpirationDate(tomorrow);

        // Assert
        assertEquals(order.getExpirationDate(), tomorrow);
    }

}
