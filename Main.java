import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Task 1.
        HashMap<String, String> FirstHashMap = new HashMap<String, String>();
        FirstHashMap.put("978-1-60309-452-8", "A letter to Jo");
        FirstHashMap.put("978-1-60309-459-7", "Lupus");
        FirstHashMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        FirstHashMap.put("978-1-60309-461-0", "The Lab");
        //Task 2.
        for (String i : FirstHashMap.keySet()) {
            System.out.println(FirstHashMap.get(i) + "(ISBN: " + i + ")");
        }
        //Task 3.
        FirstHashMap.remove("978-1-60309-444-3", "Red Panda and Moon Bear");
        //Task 4.
        FirstHashMap.remove("978-1-60309-461-0","The Lab");
        //Task 5.
        FirstHashMap.put("978-1-60309-450-4", "They Called Us Enemy");
        FirstHashMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
        //Task 6.
        if(FirstHashMap.containsValue(FirstHashMap.get("478-0-61159-424-8"))){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //Task 7.
        System.out.println(FirstHashMap.get("978-1-60309-453-5"));

    }
}
