package com.cydeo;

import com.cydeo.config.ComputerConfig;
import com.cydeo.monitorfactory.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class);

        PC myPc = container.getBean(PC.class);
        System.out.println(myPc.getTheCase().getDimensions().getDepth());

        Monitor theMonitor = container.getBean(Monitor.class);
        System.out.println(theMonitor.getSize());

    }

}
