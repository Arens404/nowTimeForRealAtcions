import java.util.Scanner;

public class Circle {
    public static int userInputScanner(int userInput){
        Scanner userInputScanner = new Scanner(System.in);
        userInput = Integer.parseInt(userInputScanner.nextLine());

        return userInput;
    }
    public static double CirclePerimeter(int circleRadius){
        System.out.print("Enter the circle radius length:");
        circleRadius = userInputScanner(circleRadius);
        double circlePerimeter = 2*Math.PI*circleRadius;

        return circlePerimeter;
    }
    public static double CircleArea(int circleRadius){
        System.out.print("Enter the circle radius length:");
        circleRadius = userInputScanner(circleRadius);
        double circleArea = Math.PI*circleRadius*circleRadius;

        return circleArea;
    }
    public double CircleArc(int circleRadius, int circleAlphaAngle, String DegreesOrRadiant){
        System.out.print("Enter the circle radius length:");
        circleRadius = userInputScanner(circleRadius);
        System.out.print("Enter the circle alpha angle size:");
        circleAlphaAngle = userInputScanner(circleAlphaAngle);
        double circleAlphaAngleInRadian = circleAlphaAngle*Math.PI/180;
        double circleArc = circleAlphaAngleInRadian*circleRadius;
        switch (DegreesOrRadiant){
            case "Degrees" -> System.out.print(Math.toDegrees(circleArc));
            case "Radian" -> System.out.print(circleArc);
            default -> System.out.println("That's not an option please select from Degrees/Radiant options!");
        }
        return circleAlphaAngleInRadian;
     }
}
