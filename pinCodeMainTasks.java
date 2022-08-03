import java.util.InputMismatchException;
import java.util.Scanner;

public class pinCodeMainTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select witch task u wanna try:");
        try{
            int UserInputContainer = scanner.nextInt();
            switch (UserInputContainer){
                case 1 -> pinCodeTaskOne();
                case 2 -> pinCodeTaskTwo();
                default -> System.out.println("U have only two option! Please select from taskOne or taskTwo");
            }
        } catch (InputMismatchException IllegalArgumentException){
            System.out.println("Please use numbers to select a task!");
        }
    }
    public static void pinCodeTaskOne(){
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
    public static void pinCodeTaskTwo(){
        try{
            Scanner userInputScanner = new Scanner(System.in);
            int correctSafeCode = 777777;
            int UserGuessInput = 0;
            while(correctSafeCode != UserGuessInput){
                System.out.print("Enter the safe code: ");
                if(userInputScanner.hasNext("q")){
                    System.exit(0);
                } else { }
                UserGuessInput = userInputScanner.nextInt();
                {
                    if(UserGuessInput == correctSafeCode){
                        System.out.println("Safe unlocked!");
                        System.exit(0);
                    }
                    else if(UserGuessInput <= 99999 || UserGuessInput >= 999999){
                        System.out.println("The safe code is six number!");
                        System.exit(0);
                    }
                    else {
                        System.out.println("Wrong Code!");
                    }
                }
            }
        } catch (NumberFormatException IllegalArgumentException){
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}
