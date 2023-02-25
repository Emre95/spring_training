package com.cydeo.tightly_coupled;

public class Main {

    public static void main(String[] args) {

        AcerMonitor theMonitor = new AcerMonitor("27inch Beast", "Acer", 27);
        DellCase theCase = new DellCase("220B", "Dell", "240");
        AsusMotherboard theMotherboard = new AsusMotherboard("BJ-200", "Asus", "v2.44", 6, 4);

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

    }
}
