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
        int arrayNumbersSum = 0;
        for(int i = 0; i < numbersArray.length; i++){
            arrayNumbersSum += numbersArray[i];
        }
        return arrayNumbersSum;
    }
    public static void numbersCheck(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.stream().count(); i++) {
            int currentNumber = numbers.get(i);
            int numberCheckCount = 0;
            for (int j = 0; j < numbers.stream().count(); j++) {
                if (currentNumber == numbers.get(j)) {
                    numberCheckCount++;
                }
                if(numberCheckCount == 2){
                    numbers.remove(j);
                }
            }
        }
        for(int i = 0; i < numbers.stream().count(); i++){
            System.out.println(numbers.get(i));
        }
    }

}