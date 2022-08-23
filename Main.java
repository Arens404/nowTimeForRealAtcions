import java.util.*;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {
        List<Map<String, Object>> listOfMaps = new ArrayList<>();

        Map<String, Object> row0 = new HashMap<>();
        row0.put("name", "Theodor");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        listOfMaps.add(row0);

        Map<String, Object> row1 = new HashMap<>();
        row1.put("name", "Paul");
        row1.put("age", 10);
        row1.put("candies", 1);
        listOfMaps.add(row1);

        Map<String, Object> row2 = new HashMap<>();
        row2.put("name", "Mark");
        row2.put("age", 7);
        row2.put("candies", 3);
        listOfMaps.add(row2);

        Map<String, Object> row3 = new HashMap<>();
        row3.put("name", "Peter");
        row3.put("age", 12);
        row3.put("candies", 5);
        listOfMaps.add(row3);

        Map<String, Object> row4 = new HashMap<>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        listOfMaps.add(row4);

        Map<String, Object> row5 = new HashMap<>();
        row5.put("name", "George");
        row5.put("age", 3);
        row5.put("candies", 2);
        listOfMaps.add(row5);
       //1. Task
       List<String> asd = listOfName(listOfMaps);
       for(int i = 0; i < asd.size(); i++){
           System.out.println(asd.get(i));
       }
       //2. Task
       Object result = sumOfAge(listOfMaps);
       System.out.println(result);

    }

    public static List<String> listOfName(List<Map<String, Object>> student) {
        List<String> listOfStudent = new ArrayList<>();
        for (int i = 0; i < student.size(); i++) {
            for (Entry<String, Object> index : student.get(i).entrySet()) {
                if (index.getKey().equals("candies")) {
                    if ((int) index.getValue() > 4) {
                        Object value = student.get(i).get("name");
                        for (Entry<String, Object> entry : student.get(i).entrySet()) {
                            if (entry.getValue() == value) {
                                listOfStudent.add((String) entry.getValue());
                            }
                        }
                    }
                }
            }
        }
        return listOfStudent;
    }

    public static double sumOfAge(List<Map<String, Object>> students) {
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            for (Entry<String, Object> j : students.get(i).entrySet()) {
                if (j.getKey().equals("candies")) {
                    if (Double.parseDouble(String.valueOf(j.getValue())) < 5) {
                        Object value = (students.get(i).get("age"));
                        for(Entry<String, Object> entry: students.get(i).entrySet()) {
                            if (entry.getValue() == value) {
                                sum = sum + Double.parseDouble(String.valueOf(entry.getValue()));
                            }
                        }
                    }
                }
            }
        }
        return sum;
    }
}
