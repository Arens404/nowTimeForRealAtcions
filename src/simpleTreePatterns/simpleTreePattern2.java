package simpleTreePatterns;

import java.util.Scanner;

public class simpleTreePattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number:");
        try{
            int n = scan.nextInt();
            int b = scan.nextInt();
            for(int o = 1; o <= b; o++){
                for(int j = 1; j <= b+1; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= b; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int k = 1; k <= 3; k++){
                for(int i = 1; i <= n; i++){
                    for(int j = 1; j <= i; j++){
                        System.out.print(" ");
                    }
                    for(int j = i; j <= n; j++){
                        System.out.print("*");
                    }
                    for(int j = i; j < n; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}
