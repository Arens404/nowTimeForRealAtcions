import java.util.InputMismatchException;
import java.util.Scanner;

public class pinCodeMainTasks {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        pinCodeMainTasks pinCodeTasks = new pinCodeMainTasks();
        System.out.print("Select witch task u wanna try:");
        try{
            int UserInputSelection = scanner.nextInt();
            switch (UserInputSelection){
                case 1 -> pinCodeTasks.pinCodeTaskOne();
                case 2 -> pinCodeTasks.pinCodeTaskTwo();
                default -> System.out.println("U have only two option! Please select from taskOne or taskTwo");
            }
        } catch (InputMismatchException InputMismatchException){
            System.out.println("Please use numbers to select a task!");
        }
    }
    public void pinCodeTaskOne(){
        try{
            int correctPinCode = 5619;
            int correctPinCodeGuessCount = 5; int pinCodeGuessCount = 2; int indicatorPinGuessCount = 3;
            int minimalPinCode = 999;  int maximumPinCode = 9999;
            while(pinCodeGuessCount != correctPinCodeGuessCount){
                System.out.print("U only have " + indicatorPinGuessCount + " chance\n");
                System.out.print("Enter your pin code:");
                int pinCodeGuessInput = scanner.nextInt();
                pinCodeGuessCount++;
                indicatorPinGuessCount--;
                if(pinCodeGuessCount == correctPinCodeGuessCount){
                    System.out.println("Phone locked!");
                }
                else if(pinCodeGuessCount < correctPinCodeGuessCount && pinCodeGuessInput == correctPinCode){
                    System.out.println("Phone unlocked!");
                    break;
                }
                else if(pinCodeGuessInput <= minimalPinCode || pinCodeGuessInput >= maximumPinCode){
                    System.out.println("The pin code is four number!");
                    break;
                }
                else {
                    System.out.println("Wrong pin!");}
            }
        }catch (NumberFormatException NumberFormatException){
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
    public void pinCodeTaskTwo(){
        try{
            int correctSafeCode = 777777;
            int UserGuessInput = 0; int UserGuessInputMax = 999999; int UserGuessInputMin = 99999;
            while(correctSafeCode != UserGuessInput){
                System.out.print("Enter the safe code: ");
                if(scanner.hasNext("q")){
                    System.exit(0);
                } else { }
                UserGuessInput = scanner.nextInt();
                {
                    if(UserGuessInput == correctSafeCode){
                        System.out.println("Safe unlocked!");
                        System.exit(0);
                    }
                    else if(UserGuessInput <= UserGuessInputMin || UserGuessInput >= UserGuessInputMax){
                        System.out.println("The safe code is six number!");
                        System.exit(0);
                    }
                    else {
                        System.out.println("Wrong Code!");
                    }
                }
            }
        } catch (NumberFormatException NumberFormatException){
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}
