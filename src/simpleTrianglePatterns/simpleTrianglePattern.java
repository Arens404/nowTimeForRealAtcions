package simpleTrianglePatterns;

import java.util.Scanner;
public class simpleTrianglePattern {
    public static void main(String[] args){
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        try{
            int number = userInputScanner.nextInt();
        } catch (WrongUserInputException wuie) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        } catch (RunTimeException rte){
            System.out.println(rte);
        }
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
