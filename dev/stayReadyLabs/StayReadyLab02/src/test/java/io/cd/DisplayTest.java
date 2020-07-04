package io.cd;
import org.junit.Assert;
import org.junit.Test; 

public class DisplayTest {
    @Test 
    public void displayTest(){
        //given 
        Display display= new Display();
        double expected= 10.0; 

        //when 
        SciCalculator.currValue=10.0; 
        double actual=display.displayCurr(10.0); 

        //then 
        Assert.assertEquals(expected, actual,0.0);
    }
    
}