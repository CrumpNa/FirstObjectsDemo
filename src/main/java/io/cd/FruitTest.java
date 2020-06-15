/*package io.cd;

import org.junit.Test;
import org.junit.Assert; 

public class FruitTest {

    @Test
    public void constructerTest(){
        String type="tomato";
        int energy=20; 

        Fruit testFruit=new Fruit();
        String actualType=testFruit.type; 
        int actualEnergy=testFruit.energy; 

        Assert.assertEquals(type,actualType);
        Assert.assertEquals(energy,actualEnergy);


    }
}*/


package io.cd;
import org.junit.Assert;
import org.junit.Test; 
public class FruitTest {




    public void constructorTest(){
        //given this info 
        String type = "tomato";
        int energy=20;  
    
        //the object will create a new fruit 
        Fruit testFruit = new Fruit(type,energy); //create new one here 
        String actualType = testFruit.type; 
        int actualEnergy=testFruit.energy; 
     
     

        //then let's do the comparison 
        Assert.assertEquals(type,actualType); 
        Assert.assertEquals(energy,actualEnergy);
    
    }
}