public class Task4 {
    public static void revertElementsInArrayTask(int[] revertNumsInAnArray){
        int min = 0;
        for(int i = 0; i < revertNumsInAnArray.length; i++){
            if(revertNumsInAnArray[min] >= revertNumsInAnArray[i]){
                revertNumsInAnArray[i] = revertNumsInAnArray[min];
            }
            int change = revertNumsInAnArray[i];
            revertNumsInAnArray[i] = revertNumsInAnArray[min];
            revertNumsInAnArray[min] = change;
        }
        for(int i = 0; i < revertNumsInAnArray.length; i++){
            System.out.print(revertNumsInAnArray[i]+",");
        }
    }
}
