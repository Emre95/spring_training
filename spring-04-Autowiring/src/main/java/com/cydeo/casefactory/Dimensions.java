package com.cydeo.casefactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Dimensions {

    private int width;
    private int height;
    private int depth;

    public Dimensions() {
        this.width=10;
        this.height=30;
        this.depth=40;
    }

}
