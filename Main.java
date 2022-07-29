public class Main {
    public static void main(String[] args) {
        //Az első feladat megoldása metódussal
        String[] animals = {"koal", "pand", "zebr"};
        Task1.animalsArrayTask(animals);
        System.out.println();
        //A második feladat megoldása metódossal
        String[] colorGreen = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] colorRed = {"orange red", "red", "tomato"};
        String[] colorPink = {"orchid", "violet", "pink", "hot pink"};
        Task2.colorsArrayTask(colorGreen, colorRed ,colorPink);
        System.out.println();
        //A haramdik feladat megoldása metódussal
        int[] numbers = {4, 5, 6, 7};
        Task3.sumNumbersArrayTask(numbers);
        System.out.println();
        //A negyedik feladat megoldása metódussal
        int[] revertNumbers = {4, 5, 6, 7};
        Task4.revertElementsInArrayTask(revertNumbers);
    }
}