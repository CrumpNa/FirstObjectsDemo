package io.cd;

public class Fruit {
    private String type; //kind of fruit 
    private int energy; //energy that it offers 

    //constructor --to initialize the variables 
    public Fruit (String type,int energy){
        this.type=type; 
        this.energy=energy; 
    }

    public String getType(){
        return this.type; 
    }

    public int getEnergy(){
        return this.energy; 
    }
} 