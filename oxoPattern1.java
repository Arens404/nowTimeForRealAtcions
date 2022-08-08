import java.util.Scanner;

public class oxoPattern1{

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        oxoPattern1 TasksFromChezo = new oxoPattern1();
        System.out.print("Select witch task u wanna try:");
        try{
            int UserInputSelectionInt = scanner.nextInt();
            switch (UserInputSelectionInt){
                case 1 -> TasksFromChezo.oxoPatternTaskOne();
                case 2 -> TasksFromChezo.oxoPatternTaskTwo();
                default -> System.out.println("U have only two option! Please select from taskOne or taskTwo");
            }
        } catch (RuntimeException InputMismatchException){
            System.out.println("Please use numbers to select a task!");
        }
    }
    public void oxoPatternTaskOne(){
        try{
            System.out.print("Line:");
            int userInputLines = scanner.nextInt();
            System.out.print("Column:");
            int userInputColumns = scanner.nextInt();
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
        } catch (RuntimeException InputMismatchException) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
    public void oxoPatternTaskTwo(){
        try{
            System.out.print("Line:");
            int userInputLines = scanner.nextInt();
            System.out.print("Column:");
            int userInputColumns = scanner.nextInt();
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
        } catch (RuntimeException InputMismatchException) {
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
    }
}

