package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean
    public Case dellCase() {
        return new DellCase("220B", "Dell", "240");
    }

    @Bean
    public Monitor sonyMonitor() {
        return new SonyMonitor("27inch Beast", "Sony", 27);
    }

    @Bean(name="acer")
    @Primary
    public Monitor acerMonitor() {
        return new AcerMonitor("27inch Beast", "Acer", 27);
    }

    @Bean
    public Motherboard asusMotherboard() {
        return new AsusMotherboard("BJ-200", "Asus", 4, 6, "v2.44");
    }

}
