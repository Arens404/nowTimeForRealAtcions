package src.simpleTrianglePatterns;

import java.util.Scanner;
public class simpleTrianglePattern {
    public static void main(String[] args){
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        try{
            int UserInputNumber = userInputScanner.nextInt();
            for(int i = 1; i <= UserInputNumber; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }     System.out.println();
        } catch (RuntimeException TimeOutException){
            System.out.println("Time out!");
        } catch (Exception WrongFormatException) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}
