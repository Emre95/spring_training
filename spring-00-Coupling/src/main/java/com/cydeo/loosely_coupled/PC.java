package com.cydeo.loosely_coupled;

import com.cydeo.loosely_coupled.casefactory.Case;
import com.cydeo.loosely_coupled.monitorfactory.Monitor;
import com.cydeo.loosely_coupled.motherboardfactory.Motherboard;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo() {
        monitor.drawPixelAt();
    }

}
