import java.util.Scanner;

public class Main {
    static Scanner userInputScanner = new Scanner(System.in);
    static ControlPanel UserInputSelectOptionPanel = new ControlPanel();

    public static void main(String[] args) {
        System.out.println("1 - Circle Perimeter calculation");
        System.out.println("2 - Circle Area calculation");
        System.out.println("3 - Circle Arc calculation");
        System.out.println("4 - Rectangle Perimeter calculation");
        System.out.println("5 - Rectangle Area calculation");
        System.out.println("6 - Rectangle Diagonal calculation");
        System.out.print("Select an options:");
        try{
            int userInputNumber = Integer.parseInt(userInputScanner.nextLine());
            UserInputSelectOptionPanel.controlPanelForOperations(userInputNumber);
        } catch (IllegalArgumentException NumberFormatException){
            System.out.println("Wrong Format! Please use numbers!");
        }

    }

}