package src.oxoPatterns;

import java.util.Scanner;

public class oxoPattern1 {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        try{
            System.out.print("Line:");
            int userInputNumber = userInputScanner.nextInt();
            System.out.print("Column:");
            int c = userInputScanner.nextInt();
            for(int i = 1; i <= userInputNumber; i++){
                if(i % 2 == 0){
                    for(int j = 1; j <= c; j++){
                        System.out.print("xo");
                    }
                } else {
                    for(int j = 1; j <= c; j++){
                        System.out.print("ox");
                    }
                }
                System.out.println();
            }
        } catch (Exception wrongFormatException){
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}

