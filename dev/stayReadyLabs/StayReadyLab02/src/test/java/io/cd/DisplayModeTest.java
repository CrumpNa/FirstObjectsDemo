package io.cd;

import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest {


    @Test
    public void binaryTest() {
        // Given 
        DisplayMode displayMode = new DisplayMode();
        displayMode.switchDisplayMode("binary");
        int actual = displayMode.getMode();//method ;

        // When 
        int expected = 0; //binary 

        // Then 
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void octalTest() {
        // Given 
        DisplayMode displayMode = new DisplayMode();
        displayMode.switchDisplayMode("octal");
        int actual = displayMode.getMode();

        // When 
        int expected = 0; 

        // Then 
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decimalTest() {
        // Given 
        DisplayMode displayMode = new DisplayMode();
        displayMode.switchDisplayMode("decimal");
        int actual = displayMode.getMode(); 

        // When 
        int expected = 0; 

        // Then 
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hexadecimalTest() {
        // Given 
        DisplayMode displayMode = new DisplayMode();
        displayMode.switchDisplayMode("hexadecimal");
        int actual = displayMode.getMode();//method ;

        // When 
        int expected = 0; //binary 

        // Then 
        Assert.assertEquals(expected, actual);
    }
}