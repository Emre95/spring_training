package com.cydeo.loosely_coupled.motherboardfactory;

public class AsusMotherboard extends Motherboard{

    public AsusMotherboard(String model, String manufacturer, String bios, int ramSlots, int cardSlots) {
        super(model, manufacturer, bios, ramSlots, cardSlots);
    }


    @Override
    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
}
