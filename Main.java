import java.util.*;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("Select an option(1-2):");
        int option = scanner.nextInt();
        switch (option){
            case 1 -> {
                List<String> resultList = listOfName(listOfMaps);
                for(int i = 0; i < resultList.size(); i++){
                    System.out.println(resultList.get(i));
                }
            }
            case 2 -> {
                Double result = sumOfAge(listOfMaps);
                System.out.println(result);
            }
        }
    }

    public static List<String> listOfName(List<Map<String, Object>> student) {
        List<String> listOfStudent = new ArrayList<>();
        int startIndex = 0;
        for (int i = startIndex; i < student.size(); i++) {
            for (Entry<String, Object> index : student.get(i).entrySet()) {
                if (index.getKey().equals("candies")) {
                    int minCandieAmount = 4;
                    if ((int) index.getValue() > minCandieAmount) {
                        String studentNames = (String) student.get(i).get("name");
                        for (Entry<String, Object> entry : student.get(i).entrySet()) {
                            if (entry.getValue() == studentNames) {
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
        int indexStart = 0;
        for (int i = indexStart; i < students.size(); i++) {
            for (Entry<String, Object> j : students.get(i).entrySet()) {
                if (j.getKey().equals("candies")) {
                    if (toDouble(toString(j.getValue())) < 5) {
                        Double studentAge = (Double) students.get(i).get("age");
                        for(Entry<String, Object> entry: students.get(i).entrySet()) {
                            if (entry.getValue() == studentAge) {
                                sum = sum + toDouble(toString(entry.getValue()));
                            }
                        }
                    }
                }
            }
        }
        return sum;
    }
    public static String toString(Object convertToString){
        String something = String.valueOf(convertToString);

        return something;
    }
    public static Double toDouble(String convertToDouble){
        Double something = Double.parseDouble(convertToDouble);

        return something;
    }
}
