package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD(700,500);
        myCd .spinDisc();
        DVD myDVD = new DVD(4000,700);
        myDVD.spinDisc();
        myDVD.readDisc();
        myCd.readDisc();
        myCd.getDiscData();


        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}