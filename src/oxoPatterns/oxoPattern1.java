package src.oxoPatterns;

import java.util.Scanner;

public class oxoPattern1 {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        try{
            System.out.print("Line:");
            int userInputNumbersOfLines = userInputScanner.nextInt();
            System.out.print("Column:");
            int userInputNumbersOfColumns = userInputScanner.nextInt();
            for(int i = 1; i <= userInputNumbersOfLines; i++){
                if(i % 2 == 0){
                    for(int j = 1; j <= userInputNumbersOfColumns; j++){
                        System.out.print("xo");
                    }
                } else {
                    for(int j = 1; j <= userInputNumbersOfColumns; j++){
                        System.out.print("ox");
                    }
                }
                System.out.println();
            }
        } catch (NumberFormatException IllegalArgumentException) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}

