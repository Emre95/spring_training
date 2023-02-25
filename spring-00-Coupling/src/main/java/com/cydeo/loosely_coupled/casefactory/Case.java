package com.cydeo.loosely_coupled.casefactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Case {

    private String model, manufacturer, powerSupply;

    public abstract void pressPowerButton();

}
