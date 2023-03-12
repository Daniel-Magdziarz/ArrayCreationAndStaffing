package com.danmagdziarz;

public class PrintArray {

    public void printArray(int[] array){
        System.out.println();
        for(int i = 0; i < array.length; i++){
            System.out.println((i + 1) + ". index " + i + " stores " + array[i]);
        }
    }
}
