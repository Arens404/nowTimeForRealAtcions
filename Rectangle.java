public class Rectangle extends Planefigures{
    public int RectanglePerimeter(){
        System.out.print("Enter a number to calculate the rectangle perimeter:");
        int SideOfaRectangle = scanner.nextInt();
        System.out.print("Enter another number to calculate the rectangle perimeter:");
        int AnotherSideOfaRectangle = scanner.nextInt();
        int perimeterResult = (AnotherSideOfaRectangle+SideOfaRectangle)*2;

        return perimeterResult;
    }
    public int RectangleArea(){

        System.out.print("Enter a number to calculate the rectangle area:");
        int SideOfaRectangle = scanner.nextInt();
        System.out.print("Enter another number to calculate the rectangle area:");
        int AnotherSideOfaRectangle = scanner.nextInt();
        int areaResult = SideOfaRectangle*AnotherSideOfaRectangle;

        return areaResult;
    }
    public double rectangleArcCoTangens(double RectangleArcCoTangent){
        double coTanA,rads, degs;
        degs = RectangleArcCoTangent;
        rads = Math.toRadians(degs);
        coTanA = 1.0 / Math.tan(rads);
        rads = Math.atan(1 / coTanA);
        degs = Math.toDegrees(rads);

        return degs;
    }
    public double RectangleDiagonal(String DegreesOrRadiant){

        System.out.print("Enter a number to calculate the rectangle area:");
        int SideOfaRectangle = scanner.nextInt();
        System.out.print("Enter another number to calculate the rectangle area:");
        int AnotherSideOfaRectangle = scanner.nextInt();
        double RectangleDiagonalOperationOfDiagonal = (SideOfaRectangle*SideOfaRectangle) + (AnotherSideOfaRectangle*AnotherSideOfaRectangle);
        double RectangleSqrt = Math.sqrt(RectangleDiagonalOperationOfDiagonal);
        double RectangleAlphaTangense = RectangleSqrt/SideOfaRectangle;
        double RectangleShiftTanOperation = rectangleArcCoTangens(RectangleAlphaTangense);
        switch (DegreesOrRadiant){
            case "Degrees" -> System.out.print(Math.toDegrees(RectangleShiftTanOperation));
            case "Radian" -> System.out.print(RectangleShiftTanOperation);
            default -> System.out.println("That's not an option please select from Degrees/Radiant options!");
        }
        return RectangleDiagonalOperationOfDiagonal;
    }
}
