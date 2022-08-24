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
        System.out.println("4 - put two an element in to the map");
        System.out.println("5 - key value check");
        System.out.println("6 - Get a key value");
        System.out.println("Select an option (1-6):");
        int selection = scanner.nextInt();
        switch(selection){
            case 1 -> {
                for (String i : FirstHashMap.keySet()) {
                    System.out.println(FirstHashMap.get(i) + "(ISBN: " + i + ")");
                }
            }
            case 2 -> {
                System.out.println("Enter the key that you wanna delete:");
                String deleteThisKey = scanner.nextLine();
                System.out.println("Enter the value that you wanna delete");
                String deleteThisValue = scanner.nextLine();
                FirstHashMap.remove(deleteThisKey, deleteThisValue);
            }
            case 4 -> {
                System.out.println("Enter the key that you wanna add:");
                String addThisKey = scanner.nextLine();
                System.out.println("Enter the value that you wanna add");
                String addThisValue = scanner.nextLine();
                FirstHashMap.put(addThisKey, addThisValue);
            }
            case 5 -> {
                System.out.println("Enter the key that you wanna check:");
                String keyCheck = scanner.nextLine();
                if(FirstHashMap.containsValue(FirstHashMap.get(keyCheck))){
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            }
            case 6 -> {
                System.out.println("Enter the key that you wanna print out value:");
                String printOutThisValue = scanner.nextLine();
                System.out.println(FirstHashMap.get(printOutThisValue));
            }
        }
    }
}
