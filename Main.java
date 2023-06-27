import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    List<Color> colorList = new ArrayList<>();
    try{
      BufferedReader reader = new BufferedReader(new FileReader("kep.txt"));
      int index=0;
      String line;
      while ((line = reader.readLine()) != null) {
        String[] colors = line.split(" ");
        colorList.add(new Color(Integer.parseInt(colors[index]), Integer.parseInt(colors[index+1]), Integer.parseInt(colors[index+2])));
        index+=3;
      }
      reader.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("2. Task:");
    System.out.println("Give me a pixel coordinates!");
    System.out.print("Row:");
    int coordinateInputX = Integer.parseInt(scanner.next());
    System.out.print("Column:");
    int coordinateInputY = Integer.parseInt(scanner.next());
    for (int i = 0; i < colorList.size(); i++) {
      if (i == coordinateInputX) {
        for (int j = 0; j < colorList.size(); j++) {
          if (j == coordinateInputY) {
            System.out.println("The pixel color RGB(" + colorList.get(j).getBlue() + "," + colorList.get(j).getGreen() + "," + colorList.get(j).getRed() + ")");
          }
        }
      }
    }

  }
}