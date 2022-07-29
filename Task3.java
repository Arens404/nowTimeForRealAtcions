public class Task3 {
    public static void sumNumbersArrayTask(int[] sumNumbersArray){
        int numbersSum = 0;
        for(int i = 0;i < sumNumbersArray.length; i++){
            numbersSum += sumNumbersArray[i];
        }
        System.out.println(numbersSum);
    }
}
