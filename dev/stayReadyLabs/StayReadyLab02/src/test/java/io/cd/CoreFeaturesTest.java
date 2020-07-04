package io.cd;
import org.junit.Assert;
import org.junit.Test; 

public class CoreFeaturesTest {
    @Test 
    public void addTest(){
        //given 
        CoreFeatures coreFeatures= new CoreFeatures();
        double expected= 12.0; 

        //when 
        SciCalculator.currValue=10.0; 
        double actual=coreFeatures.add(2.0); 

        //then 
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test 
    public void subtractTest(){
        //given 
        CoreFeatures coreFeatures= new CoreFeatures();
        double expected= 8.0; 

        //when 
        SciCalculator.currValue=10.0; 
        double actual=coreFeatures.subtract(2.0); 

        //then 
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test 
    public void multiplyTest(){
        //given 
        CoreFeatures coreFeatures= new CoreFeatures();
        double expected= 20.0; 

        //when 
        SciCalculator.currValue=10.0; 
        double actual=coreFeatures.multiply(2.0); 

        //then 
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test 
    public void divideTest(){
        //given 
        CoreFeatures coreFeatures= new CoreFeatures();
        double expected= 5.0; 

        //when 
        SciCalculator.currValue=10.0; 
        double actual=coreFeatures.divide(2.0); 

        //then 
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test 
    public void expTest(){
        //given 
        CoreFeatures coreFeatures= new CoreFeatures();
        double expected= 8.0; 

        //when 
        SciCalculator.currValue=2.0; 
        double actual=coreFeatures.exp(2.0,3.0); 

        //then 
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test 
    public void squareTest(){
        //given 
        CoreFeatures coreFeatures= new CoreFeatures();
        double expected= 9.0; 

        //when 
        SciCalculator.currValue=3.0; 
        double actual=coreFeatures.square(3.0); 

        //then 
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test 
    public void inverseTest(){
        //given 
        CoreFeatures coreFeatures= new CoreFeatures();
        double expected= 0.25; 

        //when 
        SciCalculator.currValue=4.0; 
        double actual=coreFeatures.inverse(4.0); 

        //then 
        Assert.assertEquals(expected, actual,0.0);
    }
    @Test 
    public void invertSign(){
        //given 
        CoreFeatures coreFeatures= new CoreFeatures();
        double expected= 4.0; 

        //when 
        SciCalculator.currValue=-4.0; 
        double actual=coreFeatures.invertSign(-4.0); 

        //then 
        Assert.assertEquals(expected, actual,0.0);
    }
    
    
}