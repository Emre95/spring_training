package com.cydeo.tightly_coupled;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AsusMotherboard {

    private String model, manufacturer, bios;
    private int ramSlots, cardSlots;

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

}
