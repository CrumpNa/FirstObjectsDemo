package io.cd;

public class TrigUnit {

    private boolean currentDisplay; // deg (false) or rad (true)

    public void switchDisplayMode() {
        // this display should rotate through the options
        if (currentDisplay) {
            currentDisplay = false;
        } else {
            currentDisplay = true;
        }
    }

    public void switchDisplayMode(String mode) {
        // this display should set the trig units to the type display
        if (mode.equals("degrees")) {
            currentDisplay = false;
        } else {
            currentDisplay = true;
        }
    }

    public boolean getCurrentDisplay() {
        return this.currentDisplay;
    }

}