package org.launchcode;

public class DVD extends BasicDisk {

    public DVD (String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    public void spinDisc() {
        System.out.println("DVD is spinning up");
    }

    public void playMovie() {
        System.out.println("Movie is playing");
    }
}