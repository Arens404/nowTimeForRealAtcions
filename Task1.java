public class Task1 {
    public static void animalsArrayTask(String[] animalArray){
        String animals[] = animalArray;
        for(int i = 0; i < animals.length; i++){
            animals[i] = animals[i] + "a";
            System.out.println(animals[i]);
        }
    }
}
