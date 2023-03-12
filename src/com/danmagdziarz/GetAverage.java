package com.danmagdziarz;

public class GetAverage {

    private int[] array;
    private int arraySum;

    public GetAverage(int[] array) {
        this.array = array;
        this.arraySum = 0;
    }

    public int getArraySum() {
        for (int i = 0; i < this.array.length; i++) {
            arraySum += array[i];
        }
        return arraySum;
    }

    public double getArrayAverage() {
        return (double) arraySum / (double) this.array.length;
    }
}
