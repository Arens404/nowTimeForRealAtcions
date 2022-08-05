package SumTasks;
import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Sum.numbersSum(arrayNumbers));

        List numbers = new ArrayList<>();
        int[] inputNumbers = {1, 11, 22, 54, 21, 11, 78};
        for(int i = 0; i < inputNumbers.length; i++){
            numbers.add(inputNumbers[i]);
        }
        Sum.numbersCheck((ArrayList<Integer>) numbers);
    }
    public static int numbersSum(int[] numbersArray){
        int ArrayNumberSum = 0;
        for(int i = 0; i < numbersArray.length; i++){
            ArrayNumberSum += numbersArray[i];
        }
        return ArrayNumberSum;
    }
    public static void numbersCheck(ArrayList<Integer> inputNumberArray) {
        for (int i = 0; i < inputNumberArray.size(); i++) {
            int currentNumber = inputNumberArray.get(i);
            int numberCheckCount = 0;
            for (int j = 0; j < inputNumberArray.size(); j++) {
                if (currentNumber == inputNumberArray.get(j)) {
                    numberCheckCount++;
                }
                if(numberCheckCount == 2){
                    inputNumberArray.remove(j);
                }
            }
        }
        for(int i = 0; i < inputNumberArray.size(); i++){
            System.out.println(inputNumberArray.get(i));
        }
    }
}