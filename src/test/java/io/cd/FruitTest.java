package io.cd;

import org.junit.Assert;
import org.junit.Test;

public class FruitTest {
    
    @Test
    public void constructerTest(){
        String type="tomato";
        int energy=20; 

        Fruit testFruit=new Fruit(type,energy);
        String actualType=testFruit.getType(); 
        int actualEnergy=testFruit.getEnergy(); 

        Assert.assertEquals(type,actualType); 
        Assert.assertEquals(energy,actualEnergy); 
    }

}