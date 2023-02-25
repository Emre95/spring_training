package com.cydeo.bean_annotation;


import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class);

        AcerMonitor acer = container.getBean(AcerMonitor.class);
        DellCase dell = container.getBean(DellCase.class);
        AsusMotherboard asus = container.getBean(AsusMotherboard.class);

        PC myPc = new PC(dell,acer,asus);

        myPc.powerUp();

        dell.pressPowerButton();

        Monitor monitor1 = container.getBean(Monitor.class);
        Case case1 = container.getBean(Case.class);
        Motherboard motherboard1 = container.getBean(Motherboard.class);

        monitor1.drawPixelAt();

    }

}
