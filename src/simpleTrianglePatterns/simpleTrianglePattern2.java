package src.simpleTrianglePatterns;

import java.util.Scanner;

public class simpleTrianglePattern2 {
    public static void main(String[] args){
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        try{
            int userInputNumber = userInputScanner.nextInt();
            for(int i = 1; i <= userInputNumber; i++){
                for(int j = i; j <= userInputNumber; j++){
                    System.out.print(" ");
                }
                for(int j = 1;j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception InputMismatchException) {
        System.out.println("Wrong format! Please use numbers!");
        }
    }
}
