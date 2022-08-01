import java.util.Scanner;

public class ControlPanel {
    static Scanner userInputScanner = new Scanner(System.in);
    static Circle mainCircle = new Circle();
    static Rectangle mainRectangle = new Rectangle();
    public void controlPanelForOperations(int selectInputNumber){
        switch(selectInputNumber){
            case 1:
                double resultOfCirclePerimeter = mainCircle.CirclePerimeter(0);
                System.out.println(resultOfCirclePerimeter);
                break;
            case 2:
                double resultOfCircleArea = mainCircle.CircleArea(0);
                System.out.println(resultOfCircleArea);
                break;
            case 3:
                double resultOfCircleArc = mainCircle.CircleArc(0, 0, "o");
                System.out.println(resultOfCircleArc);
                break;
            case 4:
                int resultOfSquarePerimeter = mainRectangle.RectanglePerimeter(0, 0);
                System.out.println(resultOfSquarePerimeter);
                break;
            case 5:
                int resultOfSquareArea = mainRectangle.RectangleArea(0, 0);
                System.out.println(resultOfSquareArea);
                break;
            case 6:
                double resultOfRectangleDiagonal = mainRectangle.RectangleDiagonal(0, 0, " ");
                System.out.println(resultOfRectangleDiagonal);
                break;
            default:
                System.out.println("Tahts not a valid options, please select an available option!");
        }
    }
}
