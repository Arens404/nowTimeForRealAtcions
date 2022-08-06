public class Circle{
    Setter scanner = new Setter();
    public double CirclePerimeter(){
        System.out.print("Enter the circle radius length:");
        int circleRadius = scanner.input();
        double circlePerimeter = 2*Math.PI*circleRadius;

        return circlePerimeter;
    }
    public double CircleArea(){
        System.out.print("Enter the circle radius length:");
        int circleRadius = scanner.input();
        double circleArea = Math.PI*circleRadius*circleRadius;

        return circleArea;
    }
    public double CircleArc(String DegreesOrRadiant){
        System.out.print("Enter the circle radius length:");
         int circleRadius = scanner.input();
        System.out.print("Enter the circle alpha angle size:");
        int circleAlphaAngle = scanner.input();
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
