package com.danmagdziarz;

public class StaffArray {

    int[] array; //initially this will be empty but indexed array. Then 1 of the 2 methods will staff it.

    InputCheck inputCheck = new InputCheck(); //verify input;

    public StaffArray(int[] array) {// receiving empty but indexed array here.
        this.array = array;
    }

    public void runStaffArray() {
        boolean loopRun;
        do {
            System.out.println("Menu:\n" +
                    "1. Enter 1 --> to staff the array automatically with random numbers." +
                    "\n2. Enter 2 --> to staff the array manually.");
            loopRun = userChoice(inputCheck.input());

        } while (loopRun);
    }

    private void staffArrayAuto() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = (int) ((Math.random() * 100) + 1);
        }
    }

    private void staffArrayManual() {
        int counter = 0;
        System.out.println("\nYou're staffing array with " + this.array.length + " index spaces manually.");
        while(counter < this.array.length){
          System.out.print("\n" + (counter + 1) + ". Enter number for index " + counter + " out of "
                  + this.array.length + "\n(Only numbers 1 tru 100 are allowed): ");
            int userNumber = inputCheck.input();
            if(userNumber < 1) {
                System.out.println(userNumber + " is to low. Tray again.");
                continue;
            }
            if(userNumber > 100){
                System.out.println(userNumber + " is to high. Tray again.");
                continue;
            }
            this.array[counter] = userNumber;
            counter++;
        }
    }

    private boolean userChoice(int number) {
        switch (number) {
            case 1:
                staffArrayAuto();
                return false;
            case 2:
                staffArrayManual();
                return false;
            default:
                System.out.println("Incorrect input choice for the menu. Tray again.\n");
                return true;
        }
    }

    public int[] getArray(){
        return array;
    }
}
