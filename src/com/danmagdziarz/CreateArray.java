package com.danmagdziarz;

public class CreateArray {

     public int[] makeArray(){
         InputCheck inputCheck = new InputCheck();
         int[] array;
         int indexLength;

         while(true) {
             System.out.println("Enter the amount of index places for the array.\nOnly integers " +
                     "from 3 to 10 are allowed. ");
            indexLength = inputCheck.input();
            if(indexLength >= 3 && indexLength <= 10){
                array = new int[indexLength];
                break;
            } else if (indexLength > 10){
                System.out.println("\nNumber " + indexLength + " is to high.");
            } else if (indexLength < 3){ //This condition can be false or true based on the indexLength value.
                System.out.println("\nNumber " + indexLength + " is to low.");
            } else {
                System.out.println("\nWrong number."); //This statement will never be executed (intentionally; precaution).
            }
         }
         return array;
     }
}
