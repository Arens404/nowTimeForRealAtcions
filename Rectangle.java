import java.util.Scanner;

public class Rectangle {
    public static int userInputScanner(int userInput){
        Scanner userInputScanner = new Scanner(System.in);
        userInput = Integer.parseInt(userInputScanner.nextLine());

        return userInput;
    }

    public static int RectanglePerimeter(int rectangleLateralFace, int anotherRectangleLateralFace){

        System.out.print("Enter a number to calculate the rectangle perimeter:");
        int SideOfaRectangle = userInputScanner(rectangleLateralFace);
        System.out.print("Enter another number to calculate the rectangle perimeter:");
        int AnotherSideOfaRectangle = userInputScanner(anotherRectangleLateralFace);
        int perimeterResult = (AnotherSideOfaRectangle+SideOfaRectangle)*2;

        return perimeterResult;
    }
    public static int RectangleArea(int rectangleLateralFace, int anotherRectangleLateralFace){
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate the rectangle area:");
        int SideOfaRectangle = Integer.parseInt(userInputScanner.nextLine());
        System.out.print("Enter another number to calculate the rectangle area:");
        int AnotherSideOfaRectangle = Integer.parseInt(userInputScanner.nextLine());
        int areaResult = SideOfaRectangle*AnotherSideOfaRectangle;

        return areaResult;
    }
    public static double rectangleArcCoTangens(double RectangleArcCoTanegnt){
        double coTanA,rads, degs;
        degs = RectangleArcCoTanegnt;
        rads = Math.toRadians(degs);
        coTanA = 1.0 / Math.tan(rads);
        rads = Math.atan(1 / coTanA);
        degs = Math.toDegrees(rads);

        return degs;
    }
    public double RectangleDiagonal(double rectangleLateralFace, double anotherRectangleLateralFace, String DegreesOrRadiant){
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate the rectangle area:");
        int SideOfaRectangle = Integer.parseInt(userInputScanner.nextLine());
        System.out.print("Enter another number to calculate the rectangle area:");
        int AnotherSideOfaRectangle = Integer.parseInt(userInputScanner.nextLine());
        double RectangleDiagonalOperations = (SideOfaRectangle*SideOfaRectangle) + (AnotherSideOfaRectangle*AnotherSideOfaRectangle);
        double RectangleSqrt = Math.sqrt(RectangleDiagonalOperations);
        double RectangleAlphaTangense = RectangleSqrt/SideOfaRectangle;
        double RectangleShiftTanOperation = rectangleArcCoTangens(RectangleAlphaTangense);
        System.out.println("How do you wanna print out the result?");
        System.out.println("(Degrees or Radian)");
        DegreesOrRadiant = userInputScanner.nextLine();
        switch (DegreesOrRadiant){
            case "Degrees" -> System.out.print(Math.toDegrees(RectangleShiftTanOperation));
            case "Radian" -> System.out.print(RectangleShiftTanOperation);
            default -> System.out.println("That's not an option please select from Degrees/Radiant options!");
        }
        return RectangleDiagonalOperations;
    }
}
