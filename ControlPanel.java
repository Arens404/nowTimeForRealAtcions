import java.util.Scanner;

public class ControlPanel {
    static Scanner userInputScanner = new Scanner(System.in);
    static Circle mainCircle = new Circle();
    static Rectangle mainRectangle = new Rectangle();
    public static void controlPanelForOperations(int selectInputNumber){
        int userInputNumberSelection = Integer.parseInt(userInputScanner.nextLine());
        switch (userInputNumberSelection) {
            case 1 -> {
                double resultOfCirclePerimeter = mainCircle.CirclePerimeter(0);
                System.out.println(resultOfCirclePerimeter);
            }
            case 2 -> {
                double resultOfCircleArea = mainCircle.CircleArea(0);
                System.out.println(resultOfCircleArea);
            }
            case 3 -> {
                System.out.print("How do you wanna print out the result? (Degrees/Radian):");
                String DegreesOrRadiantSelection = userInputScanner.nextLine();
                switch (DegreesOrRadiantSelection){
                    case "Degrees" -> {
                        double resultOfCircleArc = mainCircle.CircleArc(0, 0, "Degrees");
                        System.out.println(resultOfCircleArc);
                    }
                    case "Radian" -> {
                        double resultOfCircleArc = mainCircle.CircleArc(0, 0, "Radian");
                        System.out.println(resultOfCircleArc);
                    }
                }
             }
            case 4 -> {
                int resultOfSquarePerimeter = mainRectangle.RectanglePerimeter(0, 0);
                System.out.println(resultOfSquarePerimeter);
            }
            case 5 -> {
                int resultOfSquareArea = mainRectangle.RectangleArea(0, 0);
                System.out.println(resultOfSquareArea);
            }
            case 6 -> {
                double resultOfRectangleDiagonal = mainRectangle.RectangleDiagonal(0, 0, " ");
                System.out.println(resultOfRectangleDiagonal);
            }
            default ->
                    System.out.println("Tahts not a valid options, please select an available option!");
            }
        }
    }

