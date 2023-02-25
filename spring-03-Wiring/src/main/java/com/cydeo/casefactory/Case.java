package com.cydeo.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public abstract void pressPowerButton();

}
