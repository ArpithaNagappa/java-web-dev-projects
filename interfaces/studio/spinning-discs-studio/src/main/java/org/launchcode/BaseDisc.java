package org.launchcode;

import java.util.HashMap;

public abstract class  BaseDisc {
    private String discData;

    private final int storageCapacity;

    private int spinSpeed;

    private boolean isFull ;

    private HashMap<String,String> discInfo;

    public BaseDisc( int storageCapacity, int spinSpeed) {
        this.discData = discData;
        this.storageCapacity = storageCapacity;
        this.spinSpeed = spinSpeed;
        this.isFull = false;
        this.discInfo = new HashMap<>();
    }

    public String getDiscData() {
        System.out.println("Store it here");
        return discData;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public boolean isFull() {
        return isFull;
    }

    public HashMap<String, String> getDiscInfo() {
        return discInfo;
    }

}
