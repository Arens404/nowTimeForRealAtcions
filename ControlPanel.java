public class ControlPanel extends Main{
    public void controlPanelForOperations(int selectInputNumber){
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

