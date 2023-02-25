package com.cydeo.loosely_coupled.casefactory;

public class DellCase extends Case{

    public DellCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer, powerSupply);
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
