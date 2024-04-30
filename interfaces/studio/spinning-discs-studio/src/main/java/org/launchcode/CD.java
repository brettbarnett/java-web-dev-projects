package org.launchcode;

public class CD extends BasicDisk {

    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType,someUsedCapacity);
    }

    public void playMusic() {
        System.out.println("Disk is spinning up");
    }
}