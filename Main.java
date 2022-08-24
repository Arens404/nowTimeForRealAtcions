import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Task
        List<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        //2. Task
        List<String> listB = new ArrayList<String>(4);
        for(int i = 0; i < 5; i++){
            listB.add(listA.get(i));
        }
        //3. Task
        System.out.println("Select an option (1-6):");
        int option = scanner.nextInt();
        switch(option){
            case 1 -> {
                for(int i = 0; i < 5; i++){
                    if(listA.get(i) == "Durian"){
                        System.out.println("True");
                    }
                    else {
                        System.out.println("False");
                    }
                }
            }
            case 2 -> {
                listB.remove(3);
            }
            case 3 -> {
                for(int i = 0; i < 5; i++){
                    if(listA.get(i) == "Durian"){
                        listA.add(4, "Kivifruit");
                    }
                }
            }
            case 4 -> {
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
            }
            case 5 -> {
                System.out.println(listA.indexOf("Avocado"));
            }
            case 6 -> {
                System.out.println(listB.indexOf("Durian"));
            }
            case 7 -> {
                System.out.println("How many element u wan to add:");
                int elementAmount = scanner.nextInt();
                String[] elements = new String[elementAmount];
                String currentElement = "";
                System.out.println("Add as many items as you want to add (use , to separate the elements):");
                for(int j = 0; j < elementAmount; j++){
                    currentElement = scanner.nextLine();
                    elements[j] = currentElement;
                }
                System.out.println(listB);
            }
            case 8 -> {
                System.out.println(listA.get(3));
            }
        }
    }
    public static void multipleAdd(List<String> list, String[] elementArray){
        for(int i = 0; i < elementArray.length; i++){
            list.add(elementArray[i]);
        }
    }
}
