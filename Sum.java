import java.util.ArrayList;
public class Sum {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Sum.numbersSum(arrayNumbers));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int[] inputNumbers = {1, 11, 22, 54, 21, 11, 78};
        for(int i = 0; i < inputNumbers.length; i++){
            numbers.add(inputNumbers[i]);
        }
        Sum.numbersCheck(numbers);
    }
    public static int numbersSum(int[] numbersArray){
        int inputArrayNumbersSum = 0;
        for(int i = 0; i < numbersArray.length; i++){
            inputArrayNumbersSum += numbersArray[i];
        }
        return inputArrayNumbersSum;
    }
    public static void numbersCheck(ArrayList<Integer> numbersOfInputArray) {
        for (int i = 0; i < numbersOfInputArray.size(); i++) {
            int currentNumber = numbersOfInputArray.get(i);
            int numberCheckCount = 0;
            for (int j = 0; j < numbersOfInputArray.size(); j++) {
                if (currentNumber == numbersOfInputArray.get(j)) {
                    numberCheckCount++;
                }
                if(numberCheckCount == 2){
                    numbersOfInputArray.remove(j);
                }
            }
        }
        for(int i = 0; i < numbersOfInputArray.size(); i++){
            System.out.println(numbersOfInputArray.get(i));
        }
    }
}