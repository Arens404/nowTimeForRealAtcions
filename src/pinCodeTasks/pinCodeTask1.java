package pinCodeTasks;

import java.util.Scanner;

public class pinCodeTask1 {

    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            //System.out.print("Enter your pin code:");
            //int pin = scan.nextInt();
            int truePinCode = 5619;
            int pinTryCount = 2;
            int realPinTryCount = 3;
            while(pinTryCount != 5){
                System.out.print("U only have " + realPinTryCount + " chance\n");
                System.out.print("Enter your pin code:");
                int pin = scan.nextInt();
                pinTryCount++;
                realPinTryCount--;
                if(pinTryCount == 5){
                    System.out.println("Phone locked!");
                }
                else if(pinTryCount < 5 && pin == truePinCode){
                    System.out.println("Phone unlocked!");
                    break;
                }
                else if(pin <= 999 || pin >= 9999){
                    System.out.println("The pin code is four number!");
                    break;
                }
                else {
                    System.out.println("Wrong pin!");}
            }
        }catch (Exception e){
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}
