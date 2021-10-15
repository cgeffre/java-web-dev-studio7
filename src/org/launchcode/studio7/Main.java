package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD testCD = new CD("CD", 200, 500, 680, true);
        testCD.spinDisc();
        testCD.infoAboutDisc();

        DVD testDVD = new DVD("DVD", 570, 1600, 17080, false);
        testDVD.spinDisc();
        testDVD.infoAboutDisc();

    }
}
