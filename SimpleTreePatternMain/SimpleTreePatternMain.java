package SimpleTreePatternMain;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleTreePatternMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Select witch task u wanna try:");
        try {
            int UserInputSelection = scanner.nextInt();
            switch (UserInputSelection) {
                case 1 -> simpleTreePatternOne();
                case 2 -> simpleTreePatternTwo();
                default -> System.out.println("U have only two option! Please select from taskOne or taskTwo");
            }
        } catch (InputMismatchException IllegalArgumentException) {
            System.out.println("Please use numbers to select a task!");
        }
    }

    public static void simpleTreePatternOne() {
        System.out.println("Enter two number:");
        try {
            int userIntTreeTop = scanner.nextInt();
            int userIntTreeBotton = scanner.nextInt();
            for (int o = 1; o <= userIntTreeBotton; o++) {
                for (int j = 1; j <= userIntTreeBotton + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= userIntTreeBotton; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int k = 1; k <= 3; k++) {
                for (int i = 1; i <= userIntTreeTop; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i; j <= userIntTreeTop * 2 - i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        } catch (RuntimeException InputMismatchException) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }

    public static void simpleTreePatternTwo() {
        System.out.println("Enter two number:");
        try {
            int userIntTreeTop = scanner.nextInt();
            int userIntTreeBotton = scanner.nextInt();
            for (int i = 1; i <= userIntTreeTop; i++) {
                for (int j = i; j <= userIntTreeTop; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int o = 1; o <= userIntTreeBotton; o++) {
                for (int j = 1; j <= userIntTreeBotton + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= userIntTreeBotton; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (RuntimeException InputMismatchException) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}

