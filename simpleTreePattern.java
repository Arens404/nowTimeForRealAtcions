import java.util.Scanner;

public class simpleTreePattern {
    public static void main(String[] args){
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Enter two number:");
        try{
            int userInputTreeTop = userInputScanner.nextInt();
            int userInputTreeBotton = userInputScanner.nextInt();
            for(int k = 1; k <= 3; k++){
                for(int i = 1; i <= userInputTreeTop; i++){
                    for(int j = i; j <= userInputTreeTop; j++){
                        System.out.print(" ");
                    }
                    for(int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
                    for(int j = 1; j < i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            for(int o = 1; o <= userInputTreeBotton; o++){
                for(int j = 1; j <= userInputTreeBotton+1; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= userInputTreeBotton; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (NumberFormatException IllegalArgumentException) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
