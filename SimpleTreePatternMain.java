import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleTreePatternMain {
    static Scanner userInputScanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Select witch task u wanna try:");
        try {
            int UserInputContainer = userInputScanner.nextInt();
            switch (UserInputContainer) {
                case 1 -> simpleTreePatternOne();
                case 2 -> simpleTreePatternTwo();
                default -> System.out.println("U have only two option! Please select from taskOne or taskTwo");
            }
            } catch (InputMismatchException IllegalArgumentException){
                System.out.println("Please use numbers to select a task!");
            }
        }
    public static void simpleTreePatternOne(){
        System.out.println("Enter two number:");
        try{
            int userInputTreeTop = userInputScanner.nextInt();
            int userInputTreeBotton = userInputScanner.nextInt();
            for(int o = 1; o <= userInputTreeBotton; o++){
                for(int j = 1; j <= userInputTreeBotton+1; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= userInputTreeBotton; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int k = 1; k <= 3; k++){
                for(int i = 1; i <= userInputTreeTop; i++){
                    for(int j = 1; j <= i; j++){
                        System.out.print(" ");
                    }
                    for(int j = i; j <= userInputTreeTop*2-i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
       } catch (InputMismatchException IllegalArgumentException) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
    public static void simpleTreePatternTwo() {
        System.out.println("Enter two number:");
        try{
            int userIntegerTreeTop = userInputScanner.nextInt();
            int userIntegerTreeBotton = userInputScanner.nextInt();
            for(int i = 1; i <= userIntegerTreeTop; i++){
                    for(int j = i; j <= userIntegerTreeTop; j++){
                        System.out.print(" ");
                    }
                    for(int j = 1; j <= i*2-1; j++){
                    System.out.print("*");
                    }
                    System.out.println();
                    }
            for(int o = 1; o <= userIntegerTreeBotton; o++){
                for(int j = 1; j <= userIntegerTreeBotton+1; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= userIntegerTreeBotton; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (InputMismatchException IllegalArgumentException) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}
