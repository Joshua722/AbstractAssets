package com.pluralsight;

public class Cash extends Asset {
    public double freeCash;

    public Cash(String description, String dateAcquired, double originalCost, double freeCash) {
        super(description, dateAcquired, originalCost);
        this.freeCash = freeCash;
    }

    @Override
    public double getValue() {
        return freeCash;
    }
}
