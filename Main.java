import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task 1.
        HashMap<String, String> FirstHashMap = new HashMap<String, String>();
        FirstHashMap.put("978-1-60309-452-8", "A letter to Jo");
        FirstHashMap.put("978-1-60309-459-7", "Lupus");
        FirstHashMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        FirstHashMap.put("978-1-60309-461-0", "The Lab");
        System.out.println("1 - out print the map values and keys");
        System.out.println("2 - remove an element from the map");
        System.out.println("3 - remove another element from the map");
        System.out.println("4 - put two element in to the map");
        System.out.println("5 - Is there a specific value associated with the key?");
        System.out.println("6 - Get a key value");
        System.out.println("Select an option (1-7):");
        int selection = scanner.nextInt();
        switch(selection){
            case 1 -> {
                for (String i : FirstHashMap.keySet()) {
                    System.out.println(FirstHashMap.get(i) + "(ISBN: " + i + ")");
                }
            }
            case 2 -> {
                FirstHashMap.remove("978-1-60309-444-3", "Red Panda and Moon Bear");
            }
            case 3 -> {
                FirstHashMap.remove("978-1-60309-461-0","The Lab");
            }
            case 4 -> {
                FirstHashMap.put("978-1-60309-450-4", "They Called Us Enemy");
                FirstHashMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
            }
            case 5 -> {
                if(FirstHashMap.containsValue(FirstHashMap.get("478-0-61159-424-8"))){
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            }
            case 6 -> {
                System.out.println(FirstHashMap.get("978-1-60309-453-5"));
            }
        }
    }
}
