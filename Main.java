import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //1. Task
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        //2. Task
        ArrayList<String> listB = new ArrayList<String>(4);
        for(int i = 0; i < 5; i++){
            listB.add(listA.get(i));
        }
        //3. Task
        for(int i = 0; i < 5; i++){
            if(listA.get(i) == "Durian"){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
        //4. Task
        listB.remove(3);
        //5. Task
        for(int i = 0; i < 5; i++){
            if(listA.get(i) == "Durian"){
                listA.add(4, "Kivifruit");
            }
            else { }
        }
        //6. Task
        int listACount = 0;
        int listBCount = 0;
        for(int i = 0; i < listA.stream().count(); i++){
            listACount = listACount + 1;
        }
        for(int i = 0; i < listB.stream().count(); i++){
            listBCount = listBCount + 1;
        }
        if(listBCount < listACount){
            System.out.println("ListA is the bigger!");
        } else {
            System.out.println("ListB is the bigger!");
        }
        //7. task
        System.out.println(listA.indexOf("Avocado"));
        //8. Tas
        System.out.println(listB.indexOf("Durian"));
        //9. Task
        Collections.addAll(listB, "Passion Fruit", "Pomelo");
        //10. Task
        System.out.println(listA.get(3));
    }
}
