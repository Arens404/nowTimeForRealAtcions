package src.pinCodeTasks;

import java.util.Scanner;

public class pinCodeTask2 {
    public static void main(String[] args) {
        try{
            Scanner userInputScanner = new Scanner(System.in);
            int correctSafeCode = 777777;
            int safeCodeCount = 0;
            while(safeCodeCount != 77777){
                System.out.print("Enter the safe code: ");
                if(userInputScanner.hasNext("q")){
                    System.exit(0);
                } else { }
                int safeGuessInput = userInputScanner.nextInt();
                {
                    if(safeGuessInput == correctSafeCode){
                        System.out.println("Safe unlocked!");
                        System.exit(0);
                    }
                    else if(safeGuessInput <= 99999 || safeGuessInput >= 999999){
                        System.out.println("The safe code is six number!");
                        System.exit(0);
                    }
                    else {
                        System.out.println("Wrong Code!");
                    }
                }
            }
        } catch (IllegalArgumentException NumberFormatException){
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}
