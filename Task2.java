public class Task2 {
    static String[][] colors = new String[3][5];
    public static void  colorsArrayTask(String[] colorArrayofGreen, String[] colorArrayofRed, String[] colorArrayofPink){

        for (int j = 0; j <= 4; j++) {
            colors[0][j] = colorArrayofGreen[j];
            System.out.println(colors[0][j]);
        }
        System.out.println();
        for (int j = 0; j <= 2; j++) {
            colors[1][j] = colorArrayofRed[j];
            System.out.println(colors[1][j]);
        }
        System.out.println();
        for (int j = 0; j <= 3; j++) {
            colors[2][j] = colorArrayofPink[j];
            System.out.println(colors[2][j]);
        }
    }
}
