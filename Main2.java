import java.util.Scanner;
public class Main {
    static Scanner userInputScanner = new Scanner(System.in);
    static ControlPanel UserInputSelectOptionPanel = new ControlPanel();
    public static void main(String[] args) {
        System.out.println("1 - Circle:");
        System.out.println("2 - Rectangle:");
        System.out.println("3 - Exit:");
        int userInputNumber = Integer.parseInt(userInputScanner.nextLine());
        switch (userInputNumber){
            case 1 -> {
                System.out.println(" 1*  Perimeter calculation");
                System.out.println(" 2*  Area calculation");
                System.out.println(" 3*  Arc calculation");
                UserInputSelectOptionPanel.controlPanelForOperations(userInputNumber);
                }
            case 2 -> {
                System.out.println(" 1*  Perimeter calculation");
                System.out.println(" 2*  Area calculation");
                System.out.println(" 3*  Diagonal calculation");
                UserInputSelectOptionPanel.controlPanelForOperations(userInputNumber);
            }
            case 3 -> {
                System.out.println("Shut Down!");
                System.exit(0);
            }
            default -> System.out.println("This is not an option! Please select form the three option!");
            }
        }
    }

