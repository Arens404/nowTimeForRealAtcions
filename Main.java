import java.util.Scanner;

public class Main { final static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter a number to divide it:");
    double divideThisNumber = scanner.nextInt();
    System.out.println(dividerFunction(divideThisNumber));
  }

  public static double dividerFunction(double dividedNum) {
    double result = 0;
    if (dividedNum == 0) {
      System.out.println("Error! I Can't divide this number!");
    } else {
      result = 10 / dividedNum;
    }
    return result;
  }
}