import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;

public class FileReadFunction { public static Path myFilePath;

  static Map<Integer, Integer> NumberRate = new HashMap<>(3065);

  static void fillUpMap(String number){
      int lotteryNumber = Integer.parseInt(number);
      if(NumberRate.containsKey(lotteryNumber)) {
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
      while((line = reader.readLine()) != null) {
        oneLine = line.split(";");

        fillUpMap(oneLine[11]);
        fillUpMap(oneLine[12]);
        fillUpMap(oneLine[13]);
        fillUpMap(oneLine[14]);
        fillUpMap(oneLine[15]);
      } reader.close();

      int max = 0;
      int maxNum = 0;

      for(Integer numbers: NumberRate.keySet()){
        if(NumberRate.get(numbers) > max){
          max = NumberRate.get(numbers);
          maxNum = numbers;
        }
      }

      System.out.println(max + "  " + maxNum);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
