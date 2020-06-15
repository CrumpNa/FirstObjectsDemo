package io.cd;

public class Human {
    private String firstName;
    private String lastName; 
    static int maxEnergy=100; 
    private int energy; 

    //constructor
	public Human(String firstName, String lastName) {
        this.firstName= firstName; //bc is var name, can make the human name anything/it can change thats why tey are parameters 
        this.lastName=lastName; 
        this.energy=50; //set default energy amount 
    }
    
    public void eat(Fruit fruit){
        if(this.energy+fruit.getEnergy()<=maxEnergy){
            this.energy=this.energy+fruit.getEnergy(); //add original energy to energy of fruit that is passed in from the test class 
        }else{
            this.energy=maxEnergy;
            System.out.println("We are full of energy!");   }     
       

    }

    public void work(int hours){
        int energySpent=hours*10;
        if(this.energy-energySpent<0){
            System.out.print("Could'nt do the work. Energy too low. Eat something and try again.");
;         }
        else{
            this.energy=this.energy-energySpent; }
    }

    public int getEnergy(){
        return this.energy; 
    }

    public String getFirstName(){
        return this.firstName; 
    }

    public String getLastName(){
        return this.lastName; 
    }
}