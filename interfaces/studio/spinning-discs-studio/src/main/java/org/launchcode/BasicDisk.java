package org.launchcode;
import java.util.ArrayList;

public abstract class BasicDisk {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;
    private ArrayList<String> contents;

    public BasicDisk(String aName, int maxCapacity, String aType, int usedCapacity) {
        name = aName;
        storageCapacity = maxCapacity;
        diskType = aType;
        capacityUsed = checkCapacity(usedCapacity);
        remainingCapacity = spaceLeft();
    }

    private int checkCapacity(int dataWritten) {
        if (storageCapacity < dataWritten) {
            return storageCapacity;
        }
        return dataWritten;
    }
    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }
    public String writeData(int dataSize) {
        if (dataSize > remainingCapacity) {
            return "Not enough disk space";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;
        return "Data written to disk. Remaining space = " + remainingCapacity;
    }

    @Override
    public String toString() {
        return "BasicDisk{" +
                "name='" + name + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", remainingCapacity=" + remainingCapacity +
                ", capacityUsed=" + capacityUsed +
                ", diskType='" + diskType + '\'' +
                ", contents=" + contents +
                '}';
    }
}