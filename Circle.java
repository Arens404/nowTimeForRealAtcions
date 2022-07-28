import java.util.Scanner;

public class Circle {
    static Scanner userInputScanner = new Scanner(System.in);
    public static double CirclePerimeter(int circleRadius){
        System.out.print("Enter the circle radius length:");
        circleRadius = Integer.parseInt(userInputScanner.nextLine());
        double circlePerimeter = 2*Math.PI*circleRadius;

        return circlePerimeter;
    }
    public static double CircleArea(int circleRadius){
        System.out.print("Enter the circle radius length:");
        circleRadius = Integer.parseInt(userInputScanner.nextLine());
        double circleArea = Math.PI*circleRadius*circleRadius;

        return circleArea;
    }
    public double CircleArc(int circleRadius, int circleAlphaAngle, String DegreesOrRadiant){
        System.out.print("Enter the circle radius length:");
        circleRadius = Integer.parseInt(userInputScanner.nextLine());
        System.out.print("Enter the circle alpha angle size:");
        circleAlphaAngle = Integer.parseInt(userInputScanner.nextLine());
        double circleAlphaAngleInRadian = circleAlphaAngle*Math.PI/180;
        double circleArc = circleAlphaAngleInRadian*circleRadius;
        System.out.println("How do you wanna print out the result?");
        System.out.println("(Degrees or Radian)");
        DegreesOrRadiant = userInputScanner.nextLine();
        switch (DegreesOrRadiant){
            case "Degrees" -> System.out.print(Math.toDegrees(circleArc));
            case "Radian" -> System.out.print(circleArc);
            default -> System.out.println("That's not an option please select from Degrees/Radiant options!");
         }
        return circleAlphaAngleInRadian;
    }
}
