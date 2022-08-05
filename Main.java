import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ControlPanel UserInputSelectOptionPanel = new ControlPanel();
        System.out.println("1 - Circle:");
        System.out.println("2 - Rectangle:");
        System.out.println("3 - Exit:");
        try{
            int userInputNumber = Integer.parseInt(scanner.nextLine());
            switch (userInputNumber){
                case 1 -> {
                    System.out.println(" 1*  Perimeter calculation");
                    System.out.println(" 2*  Area calculation");
                    System.out.println(" 3*  Arc calculation");
                    UserInputSelectOptionPanel.controlPanelForOperations(userInputNumber);
                }
                case 2 -> {
                    System.out.println(" 4*  Perimeter calculation");
                    System.out.println(" 5*  Area calculation");
                    System.out.println(" 6*  Diagonal calculation");
                    UserInputSelectOptionPanel.controlPanelForOperations(userInputNumber);
                }
                case 3 -> {
                    System.out.println("Shut Down!");
                    System.exit(0);
                }
                default -> System.out.println("This is not an option! Please select form the three option!");
            }
        } catch (RuntimeException NumberFormatException){
            System.out.println("Wrong format! Please Enter numbers!");
        }
    }
}

