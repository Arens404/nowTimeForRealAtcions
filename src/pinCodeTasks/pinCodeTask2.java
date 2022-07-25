package src.pinCodeTasks;

import java.util.Scanner;

public class pinCodeTask2 {
    public static void main(String[] args) {
        try{
            Scanner userInputScanner = new Scanner(System.in);
            int trueSafeCode = 777777;
            int safeCodeEnterCount = 0;


            while(safeCodeEnterCount != 77777){
                System.out.print("Enter the safe code: ");
                if(userInputScanner.hasNext("q")){
                    System.exit(0);
                } else { }

                int safeCodeInput = userInputScanner.nextInt();
                {
                    if(safeCodeInput == trueSafeCode){
                        System.out.println("Safe unlocked!");{
                            break;
                        }
                    }
                    else if(safeCodeInput <= 99999 || safeCodeInput >= 999999){
                        System.out.println("The safe code is six number!");
                        break;
                    }
                    else {
                        System.out.println("Wrong Code!");
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}
