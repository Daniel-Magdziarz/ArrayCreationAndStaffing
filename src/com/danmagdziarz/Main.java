package com.danmagdziarz;

public class Main{
    public static void main(String[] args) {

        CreateArray createArray = new CreateArray();
        int[] newArray = createArray.makeArray();
        System.out.println("\nYou created a new array with " + newArray.length + " index spaces.\n");

        StaffArray staffArray = new StaffArray(newArray);
        staffArray.runStaffArray();
        newArray = staffArray.getArray();

        PrintArray printArray = new PrintArray();
        printArray.printArray(newArray);

        GetAverage getAverage = new GetAverage(newArray);
        System.out.println("\nThe sum of the numbers in the array is: " + getAverage.getArraySum() +
                "\nThe average of all the numbers in the array is " +
                String.format("%,.3f\n", + getAverage.getArrayAverage()));



    }
}