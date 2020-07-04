package io.cd;
import org.junit.Assert;
import org.junit.Test; 


public class TrigFunctionsTest {
    @Test 
    public void sineTest(){

        //given 
        TrigFunctions trig= new TrigFunctions(); 
        double expected= 0.026176948307873153;

        //when
        SciCalculator.currValue= 1.5;
        double actual=trig.sine();

        //then 
        Assert.assertEquals(expected,actual,0.0); 
    }

    @Test 
    public void cosineTest(){
        TrigFunctions trig= new TrigFunctions(); 
        double expected=0.9996573249755573; 

        //when 
        SciCalculator.currValue=1.5; 
        double actual=trig.cos();

        //then 
        Assert.assertEquals(expected,actual,0.0); 
    }
    @Test 
    public void tangentTest(){
        TrigFunctions trig= new TrigFunctions(); 
        double expected=0.02618592156918693; 

        //when 
        SciCalculator.currValue=1.5; 
        double actual=trig.tan();

        //then 
        Assert.assertEquals(expected,actual,0.0); 

    }
    @Test 
    public void inverseSineTest(){
        //given 
        TrigFunctions trig= new TrigFunctions(); 
        double expected = 1.5707963267948966;
        SciCalculator.currValue=1.0; 

        //when 
        double actual=trig.inverseSin(); 

        //then 
        Assert.assertEquals(expected,actual,0.0); 
    }
    @Test 
    public void inverseCosineTest(){
        //given 
        TrigFunctions trig= new TrigFunctions(); 
        double expected = 0.0;
        SciCalculator.currValue=1.0; 

        //when 
        double actual=trig.inverseCos(); 

        //then 
        Assert.assertEquals(expected,actual,0.0); 
    }
    @Test 
    public void inverseTangentTest(){
        //given 
        TrigFunctions trig= new TrigFunctions(); 
        double expected = 1.1071487177940904;
        SciCalculator.currValue=2.0; 

        //when 
        double actual=trig.inverseTan(); 

        //then 
        Assert.assertEquals(expected,actual,0.0); 
    }
}
