package io.cd;
import org.junit.Assert;
import org.junit.Test; 
public class HumanTest {


    @Test //starts the test 

    public void constructorTest(){
        //given this info 
        String first = "Fred";
        String last = "Flintsone";
        int energy=50;  
    
        //the object will create a new human 
        Human testHuman = new Human(first,last); //create new one here 
        String actualFirst = testHuman.getFirstName(); //correct first name 
        String actualLast = testHuman.getLastName(); //correct last name 
        int actualEnergy=testHuman.getEnergy(); 

        //then let's do the comparison 
        Assert.assertEquals(first,actualFirst); 
        Assert.assertEquals(last,actualLast); 
        Assert.assertEquals(energy,actualEnergy);
    
    }

    @Test 
    public void eatTest(){
        //given 
        Fruit pineapple= new Fruit("Pineapple",10); 
        int expectedEnergy=60; //bc 50+10 from pineapple 

        Human testHuman= new Human("Barney","Rubble"); //make human 

        //when 
        testHuman.eat(pineapple); //human eats pineapple 
        int actualEnergy=testHuman.getEnergy(); //call energy of human after eating  
        //then 
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test 
    public void workTest(){
        //given 
        Human testHuman=new Human ("Fred", "Flintstone")
;       int expectedEnergy= 30; //bc 50-20 energy points 
        //when 
        testHuman.work(2); //2 hours worked 
        int actualEnergy=testHuman.getEnergy(); 

        //then 
        Assert.assertEquals(expectedEnergy,actualEnergy);
    }

    @Test
    public void energyMaxTest(){
        //given 
        Human testHuman=new Human ("Wilma", "Flintstone");
        Fruit testFruit1= new Fruit("Dragon Fruit", 20);
        Fruit testFruit2=new Fruit ("Orange",20); 
        Fruit testFruit3=new Fruit("apple",20); 
        Human.maxEnergy=100;  

        //when
        testHuman. eat(testFruit1); 
        testHuman. eat(testFruit2); 
        testHuman. eat(testFruit3); 
        int actualEnergy=testHuman.getEnergy(); 

        //then 
        Assert.assertEquals(100,actualEnergy); 
    }

    @Test 
    public void workMin(){
        //given 
        Human testHuman=new Human ("Wilma","Flintstone"); 

        //when 
        testHuman.work(6);
        int actualEnergy=testHuman.getEnergy(); 

        //then 

        Assert.assertEquals(50, actualEnergy);

    }
    @Test 
    public void maxEnergyChangeTest(){
        Human h1=new Human("John","Doe"); 
        //Human h2=new Human ("Jane","Doe");
        //Human h3=new Human("Henry","James");  
        
        Fruit testFruit1= new Fruit("Dragon Fruit", 20);
        Fruit testFruit2=new Fruit ("Orange",20); 
        Fruit testFruit3=new Fruit("apple",20); 

        Human.maxEnergy=150;  
        h1.eat(testFruit1); 
        h1.eat(testFruit2); 
        h1.eat(testFruit3); 

       
        int actualEnergy=h1.getEnergy(); 
        
        Assert.assertEquals(110,actualEnergy);
    }
} 