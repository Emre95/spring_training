package com.cydeo.model;

import com.cydeo.model.Gender;
import lombok.Data;

@Data
public class Mentor {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final Gender gender;

}
