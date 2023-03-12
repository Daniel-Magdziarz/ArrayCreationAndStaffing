package com.danmagdziarz;
import java.util.Scanner;

public class InputCheck {
    private Scanner keyboard = new Scanner(System.in);

    public int input(){
        int integer = 0;

        do {
            System.out.print("Enter an integer: ");
            if (keyboard.hasNextInt()) {
                integer = keyboard.nextInt();
                keyboard.nextLine();
                break;
            } else {
                String blabla = keyboard.nextLine();
                System.out.println("\"" + blabla + "\"" + " is not a digit. Try again.");
            }
        } while (true);

        return integer;
    }

}
