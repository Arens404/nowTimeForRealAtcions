import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;

public class FileReadFunction { public static Path myFilePath;

  static Map<Integer, Integer> NumberRate = new HashMap<>(3065);
  static Map<Integer, Integer> NumberRates = new HashMap<>(3065);

  static void fillUpMap(String number){
    /*
    for(int i = 0; i < count; i++){
      NumberRate.put(lotteryNumberOne[i] + lotteryNumberTwo[i] + lotteryNumberThree[i] + lotteryNumberFour[i] + lotteryNumberFive[i], 1);
    }
    int startIndex = 0;
    for (int i = startIndex; i < NumberRate.size(); i++) {
      for (int j = 0; j < count; j++) {
        int Numbers = lotteryNumberOne[j] + lotteryNumberTwo[j] + lotteryNumberThree[j] + lotteryNumberFour[j] + lotteryNumberFive[j];
        if (NumberRate.get(i).equals(Numbers)) {
          System.out.println("uwu");
        }
      }
    }

     */
  }

  public static void main(String[] args) {
    myFilePath = Paths.get("igen.txt");

    String line = ",";
    String[] oneLine = new String[3065];
    int[] lotteryNumberOne = new int[3065];
    int[] lotteryNumberTwo = new int[3065];
    int[] lotteryNumberThree = new int[3065];
    int[] lotteryNumberFour = new int[3065];
    int[] lotteryNumberFive = new int[3065];
    int count = 0;
    try {
      BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(myFilePath)));
      while((line = reader.readLine()) != null) {
        oneLine = line.split(";");
        lotteryNumberOne[count] = Integer.parseInt(oneLine[11]);
        lotteryNumberTwo[count] = Integer.parseInt(oneLine[12]);
        lotteryNumberThree[count] = Integer.parseInt(oneLine[13]);
        lotteryNumberFour[count] = Integer.parseInt(oneLine[14]);
        lotteryNumberFive[count] = Integer.parseInt(oneLine[15]);
        count++;
      } reader.close();


      for(int i = 0; i < count; i++){
        NumberRate.put(lotteryNumberTwo[i], 1);
      }

      int startIndex = 0;
      for (int i = startIndex; i < NumberRate.size(); i++) {
        for (int j = 0; j < 5; j++) {
          Integer Numbers = lotteryNumberTwo[j];
          if (Numbers.equals(NumberRate.get(i))) {
              NumberRates.put(Numbers,NumberRates.get(i)+1);
          } else {
            NumberRates.put(Numbers, 1);
          }
        }
      }

      for (Entry<Integer, Integer> item: NumberRates.entrySet()) {
        System.out.println("Key: " + item.getKey() + " | Value: " + item.getValue());
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
