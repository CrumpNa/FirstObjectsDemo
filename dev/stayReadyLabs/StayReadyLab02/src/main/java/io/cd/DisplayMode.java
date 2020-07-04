package io.cd;

public class DisplayMode {
    
	int currentDisplayMode;
    String output;

    public void switchDisplayMode(String type) {
        // this display should rotate through the options
        if (type.equals("binary")){
            output="binary";
            System.out.println("binary");
        }
        if (type.equals("octal")) {
            output="octal";
            System.out.println("octal");
        }
        if (type.equals("decimal")) {
        output="decimal";
        System.out.println("decimal");
        }
        if (type.equals("hexadecimal")) {
        output="hexadecimal";
        System.out.println("hexadecimal");
        
        }else{
         output="error"; 

        }
    }
    public int getMode(){
        return currentDisplayMode;
    }
    
   
    
        
    /*public void switchDisplayMode(String mode){
            // this should set the display to the mode given

        }*/



}