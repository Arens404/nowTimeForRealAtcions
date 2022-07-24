package pinCodeTasks;

import java.util.Scanner;

public class pinCodeTask2 {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            int trueSafeCode = 777777;
            int safeCodeCount = 0;


            while(safeCodeCount != 77777){
                System.out.print("Enter the safe code: ");
                if(scan.hasNext("q")){
                    System.exit(0);
                } else { }

                int safe = scan.nextInt();
                {
                    if(safe == trueSafeCode){
                        System.out.println("Safe unlocked!");{
                            break;
                        }
                    }
                    else if(safe <= 99999 || safe >= 999999){
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
