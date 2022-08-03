import java.util.InputMismatchException;
import java.util.Scanner;
public class oxoPattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select witch task u wanna try:");
        try{
            int UserInputContainer = scanner.nextInt();
            switch (UserInputContainer){
                case 1 -> oxoPatternTaskOne();
                case 2 -> oxoPatternTaskTwo();
                default -> System.out.println("U have only two option! Please select from taskOne or taskTwo");
            }
        } catch (InputMismatchException IllegalArgumentException){
            System.out.println("Please use numbers to select a task!");
        }
    }
    public static void oxoPatternTaskOne(){
        Scanner userInputScanner = new Scanner(System.in);
        try{
            System.out.print("Line:");
            int userInputLines = userInputScanner.nextInt();
            System.out.print("Column:");
            int userInputColumns = userInputScanner.nextInt();
            for(int i = 1; i <= userInputLines; i++){
                for(int j = 1; j <= userInputColumns; j++){
                    if(i % 2 == 0){
                        System.out.print("ox");
                    } else {
                        System.out.print("xo");
                    }
                }
            System.out.println();
            }
        } catch (InputMismatchException IllegalArgumentException) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
    public static void oxoPatternTaskTwo(){
        try{
            Scanner userInputScanner = new Scanner(System.in);
            System.out.print("Line:");
            int userInputLines = userInputScanner.nextInt();
            System.out.print("Column:");
            int userInputColumns = userInputScanner.nextInt();
            for(int i = 1; i <= userInputLines; i++){
                if( i % 3 == 0 || i % 5 == 0 || i % 6 == 0){
                    for(int j = 1; j <= userInputColumns; j++){
                        System.out.print("III");
                    }
                } else{
                    if(i % 2 == 0){
                        for(int j = 1; j <= userInputColumns; j++){
                            System.out.print("xo");
                            if(j % 2 == 0){
                                System.out.print("II");
                            }
                        }
                    } else {
                        for(int j = 1; j <= userInputColumns; j++){
                            System.out.print("xo");
                            if(j % 2 == 0){
                                System.out.print("II");
                            }
                        }
                    }
                }
                System.out.println();
            }
        } catch (InputMismatchException IllegalArgumentException) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}

