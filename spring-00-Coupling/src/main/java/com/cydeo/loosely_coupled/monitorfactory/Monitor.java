package com.cydeo.loosely_coupled.monitorfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Monitor {

    private String model, manufacturer;
    private int size;

    public abstract void drawPixelAt();

}
