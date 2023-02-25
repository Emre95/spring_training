package com.cydeo.loosely_coupled.motherboardfactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Motherboard {

    private String model, manufacturer, bios;
    private int ramSlots, cardSlots;

    public abstract void loadProgram(String programName);

}
