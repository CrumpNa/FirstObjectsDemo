package io.cd;

public class TrigFunctions {
    

    public double sine(){
        //when in degrees mode bc would be sin inverse if was in radians 

        double radians= Math. toRadians(SciCalculator.currValue); 
        double sine=Math.sin(radians);
       SciCalculator.currValue= sine; 
        return SciCalculator.currValue;

    }

    public double tan(){
        double radians=Math.toRadians(SciCalculator.currValue);
        double tangent=Math.tan(radians); 
        SciCalculator.currValue=tangent;
        return SciCalculator.currValue;

    }

    public double cos(){
        double radians=Math.toRadians(SciCalculator.currValue);
        double cosine=Math.cos(radians);
        SciCalculator.currValue=cosine;
        return SciCalculator.currValue; 

    }

    public double inverseSin(){

        double inverseSine=(Math.asin(SciCalculator.currValue));
        SciCalculator.currValue=inverseSine;
        return SciCalculator.currValue; 
    }

    public double inverseCos(){
        double inverseCosine=Math.acos(SciCalculator.currValue);
        SciCalculator.currValue=inverseCosine; 
        return SciCalculator.currValue; 
    }

    public double inverseTan(){
        double inverseTan=Math.atan(SciCalculator.currValue);
        SciCalculator.currValue=inverseTan;
        return SciCalculator.currValue; 
    }

}
/*
https://www.tutorialspoint.com/java/number_sin.htm  for sin method 
https://www.tutorialspoint.com/java/number_tan.htm  for tan method 
https://www.tutorialspoint.com/java/number_cos.htm  for cos method 
https://www.tutorialspoint.com/java/lang/math_acos.htm  for inverse cos method 
https://www.programzools.com/find-tan-of-angle-or-tan-inverse-java.html for inverse tan method 
*/ 