package src.pinCodeTasks;

import java.util.Scanner;

public class pinCodeTask1 {

    public static void main(String[] args) {
        try{
            Scanner userInputScanner = new Scanner(System.in);
            int truePinCode = 5619;
            int pinTryCount = 2;
            int PinCodeMonitoringTryCount = 3;
            while(pinTryCount != 5){
                System.out.print("U only have " + PinCodeMonitoringTryCount + " chance\n");
                System.out.print("Enter your pin code:");
                int userInputPinCode = userInputScanner.nextInt();
                pinTryCount++;
                PinCodeMonitoringTryCount--;
                if(pinTryCount == 5){
                    System.out.println("Phone locked!");
                }
                else if(pinTryCount < 5 && userInputPinCode == truePinCode){
                    System.out.println("Phone unlocked!");
                    break;
                }
                else if(userInputPinCode <= 999 || userInputPinCode >= 9999){
                    System.out.println("The pin code is four number!");
                    break;
                }
                else {
                    System.out.println("Wrong pin!");}
            }
        }catch (Exception WrongFormatException){
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}
