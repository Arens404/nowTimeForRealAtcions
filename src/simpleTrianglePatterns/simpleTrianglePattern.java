package simpleTrianglePatterns;

import java.util.Scanner;
public class simpleTrianglePattern {
    public static void main(String[] args){
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        try{
            int userInputScanner = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
