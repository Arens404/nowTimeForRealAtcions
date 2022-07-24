package simpleTrianglePatterns;

import java.util.Scanner;

public class simpleTrianglePattern2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        try{
            int n = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1;j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
