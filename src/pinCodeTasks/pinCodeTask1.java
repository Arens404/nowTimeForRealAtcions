package pinCodeTasks;

import java.util.Scanner;

public class pinCodeTask1 {

    public static void main(String[] args) {
        try{
            Scanner userInputScanner = new Scanner(System.in);
            int corrcetPinCode = 5619;
            int pinGuessCount = 2;
            int monitorPinGuessCount = 3;
            while(pinTryCount != 5){
                System.out.print("U only have " + monitorPinGuessCount + " chance\n");
                System.out.print("Enter your pin code:");
                int pinCode = userInputScanner.nextInt();
                pinGuessCount++;
                monitorPinGuessCount--;
                if(pinGuessCount == 5){
                    System.out.println("Phone locked!");
                }
                else if(pinGuessCount < 5 && pinCode == corrcetPinCode){
                    System.out.println("Phone unlocked!");
                    break;
                }
                else if(pinCode <= 999 || pinCode >= 9999){
                    System.out.println("The pin code is four number!");
                    break;
                }
                else {
                    System.out.println("Wrong pin!");}
            }
        }catch (NumberFormatException IllegalArgumentException) {
            System.out.println("Wrong format!Please use numbers to enter the input!");
        }
    }
}
