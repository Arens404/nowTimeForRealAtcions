package pinCodeTasks;

import java.util.Scanner;

public class pinCodeTask2 {
    public static void main(String[] args) {
        try{
            Scanner userInputScanner = new Scanner(System.in);
            int correctSafeCode = 777777;
            int safeCodeGuessCount = 0;
            while(safeCodeGuessCount != 77777){
                System.out.print("Enter the safe code: ");
                if(userInputScanner.hasNext("q")){
                    System.exit(0);
                } else { }
                int safeCode = userInputScanner.nextInt();
                {
                    if(safeCode == trueSafeCode){
                        System.out.println("Safe unlocked!");{
                            break;
                        }
                    }
                    else if(safeCode <= 99999 || safeCode >= 999999){
                        System.out.println("The safe code is six number!");
                        break;
                    }
                    else {
                        System.out.println("Wrong Code!");
                    }
                }
            }
        } catch (NumberFormatException IllegalArgumentException) {
            System.out.println("Wrong format!Please use numbers to enter the input!");
        }
    }
}
