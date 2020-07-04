package io.cd;

public class CoreFeatures extends DisplayMode {


    //SciCalculator.currValue always updates and keeps up when going 

    public double add(double enteredNum){
       
      SciCalculator.currValue =SciCalculator.currValue+enteredNum; 
        return SciCalculator.currValue; 
    }


    public double subtract(double enteredNum){
     
        
        SciCalculator.currValue=SciCalculator.currValue-enteredNum; 
        return SciCalculator.currValue; 
    }


    //(i += 1) is equivalent to i = i + 1
    

    public double multiply(double enteredNum){

        SciCalculator.currValue*=enteredNum; //multiples 
        return SciCalculator.currValue; 
    }
    

    public double divide(double enteredNum){
    
        if(enteredNum ==0){ //division by zero 
            System.out.println("Error-division by zero"); //error message 
        }
        else{
        SciCalculator.currValue= SciCalculator.currValue/enteredNum;  //divide as usual 
        }
        return SciCalculator.currValue; 
    }
    public double exp(double x, double y){
        //x is the base 
        //y is the exponenet 

        SciCalculator.currValue=Math.pow(x,y);//exponent function 
        return SciCalculator.currValue; 
    }


    public double square(double enteredNum){

       SciCalculator.currValue=Math. pow(enteredNum,2.0); //exponent function with only square as an option 
       return SciCalculator.currValue; 
    }

    public double squareRoot(double enteredNum){
        SciCalculator.currValue=Math.sqrt(enteredNum); //square root function 
        return SciCalculator.currValue; 

    }
    public double inverse(double enteredNum){
        SciCalculator.currValue=(1/enteredNum); //divides 1/num to take inverse 
        return SciCalculator.currValue; 

    }

    public double invertSign(double enteredNum){
       
        SciCalculator.currValue=enteredNum*(-1); //makes negative or positive 
        return SciCalculator.currValue; 
    }

    
}

/*
https://tutorial.eyehunts.com/java/java-exponent-power-operator-examples/ for exp method 
https://www.tutorialspoint.com/java/number_sqrt.htm  for squareRoot method 

*/