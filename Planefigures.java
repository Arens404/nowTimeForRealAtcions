import java.util.Scanner;

public class Planefigures {
    protected static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1 - Circle:");
        System.out.println("2 - Rectangle:");
        System.out.println("3 - Exit:");
        try{
            int userInputNumber = scanner.nextInt();
            switch (userInputNumber){
                case 1 -> {
                    System.out.println(" 1*  Perimeter calculation");
                    System.out.println(" 2*  Area calculation");
                    System.out.println(" 3*  Arc calculation");
                    controlPanelForOperations(userInputNumber);
                }
                case 2 -> {
                    System.out.println(" 4*  Perimeter calculation");
                    System.out.println(" 5*  Area calculation");
                    System.out.println(" 6*  Diagonal calculation");
                    controlPanelForOperations(userInputNumber);
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
    public static void controlPanelForOperations(int selectInputNumber){
        Circle mainCircle = new Circle();
        Rectangle mainRectangle = new Rectangle();
        int userInputNumberSelection = scanner.nextInt();
        switch (userInputNumberSelection) {
            case 1 -> {
                double resultOfCirclePerimeter = mainCircle.CirclePerimeter();
                System.out.println(resultOfCirclePerimeter);
            }
            case 2 -> {
                double resultOfCircleArea = mainCircle.CircleArea();
                System.out.println(resultOfCircleArea);
            }
            case 3 -> {
                System.out.print("How do you wanna print out the result? (Degrees/Radian):");
                String DegreesOrRadiantSelection = scanner.nextLine();
                switch (DegreesOrRadiantSelection){
                    case "Degrees" -> {
                        String Indicator = "Degrees";
                        double resultOfCircleArc = mainCircle.CircleArc(Indicator);
                        System.out.println(resultOfCircleArc);
                    }
                    case "Radian" -> {
                        String Indicator = "Radian";
                        double resultOfCircleArc = mainCircle.CircleArc(Indicator);
                        System.out.println(resultOfCircleArc);
                    }
                }
            }
            case 4 -> {
                int resultOfSquarePerimeter = mainRectangle.RectanglePerimeter();
                System.out.println(resultOfSquarePerimeter);
            }
            case 5 -> {
                int resultOfSquareArea = mainRectangle.RectangleArea();
                System.out.println(resultOfSquareArea);
            }
            case 6 -> {
                System.out.print("How do you wanna print out the result? (Degrees/Radian):");
                String DegreesOrRadiantSelection = scanner.nextLine();
                switch (DegreesOrRadiantSelection){
                    case "Degrees" -> {
                        String Indicator = "Degrees";
                        double resultOfRectangleDiagonal = mainRectangle.RectangleDiagonal(Indicator);
                        System.out.println(resultOfRectangleDiagonal);
                    }
                    case "Radian" -> {
                        String Indicator = "Radian";
                        double resultOfRectangleDiagonal = mainRectangle.RectangleDiagonal(Indicator);
                        System.out.println(resultOfRectangleDiagonal);
                    }
                }
            }
            default ->
                    System.out.println("That's not a valid options, please select an available option!");
        }
    }
}


