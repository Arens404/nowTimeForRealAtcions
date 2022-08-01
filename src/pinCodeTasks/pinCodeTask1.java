package src.pinCodeTasks;

import java.util.Scanner;

public class pinCodeTask1 {

    public static void main(String[] args) {
        try{
            Scanner userInputScanner = new Scanner(System.in);
            int correctPinCode = 5619;
            int pinCodeGuessCount = 2;
            int indicatorPinGuessCount = 3;
            while(pinCodeGuessCount != 5){
                System.out.print("U only have " + indicatorPinGuessCount + " chance\n");
                System.out.print("Enter your pin code:");
                int pinCodeGuessInput = Integer.parseInt(userInputScanner.nextLine());
                pinCodeGuessCount++;
                indicatorPinGuessCount--;
                if(pinCodeGuessCount == 5){
                    System.out.println("Phone locked!");
                }
                else if(pinCodeGuessCount < 5 && pinCodeGuessInput == correctPinCode){
                    System.out.println("Phone unlocked!");
                    break;
                }
                else if(pinCodeGuessInput <= 999 || pinCodeGuessInput >= 9999){
                    System.out.println("The pin code is four number!");
                    break;
                }
                else {
                    System.out.println("Wrong pin!");}
            }
        }catch (IllegalArgumentException NumberFormatException){
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}
