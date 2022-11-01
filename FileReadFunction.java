import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class FileReadFunction { public static Path myFilePath;

  static Map<Integer, Integer> NumberRate = new HashMap<>(100);

  static void fillUpMap(String number) {
    int lotteryNumber = Integer.parseInt(number);
    if (NumberRate.containsKey(lotteryNumber)) {
      NumberRate.replace(lotteryNumber, NumberRate.get(lotteryNumber) + 1);
    } else {
      NumberRate.put(lotteryNumber, 1);
    }
  }

  public static void main(String[] args) {
    myFilePath = Paths.get("myTestDoc.txt");

    String line = ",";
    String[] oneLine = new String[3065];

    try {
      BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(myFilePath)));
      while ((line = reader.readLine()) != null) {
        oneLine = line.split(";");

        fillUpMap(oneLine[11]);
        fillUpMap(oneLine[12]);
        fillUpMap(oneLine[13]);
        fillUpMap(oneLine[14]);
        fillUpMap(oneLine[15]);

      }

      reader.close();

      int max = 0;
      ArrayList<Integer> fiveBestNum = new ArrayList<>();
      for (Integer numbers: NumberRate.keySet()) {
        if (NumberRate.get(numbers) > max) {
          max = NumberRate.get(numbers);
          fiveBestNum.add(NumberRate.get(numbers));
        } else if (max > numbers - 4) {
          fiveBestNum.add(NumberRate.get(numbers));
        }
      }

      System.out.println("The five most occurring number: ");
      for (int i = 0; i < 5; i++) {
        System.out.println(fiveBestNum.get(i));
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
