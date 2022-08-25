import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> telephoneNumbers = new HashMap<String, String>();
        telephoneNumbers.put("William A. Lathan", "405-709-1865");
        telephoneNumbers.put("John K. Miller", "402-247-8568");
        telephoneNumbers.put("Hortensia E. Foster", "606-481-6467");
        telephoneNumbers.put("Amanda D. Newland", "319-243-5613");
        telephoneNumbers.put("Brooke P. Askew", "307-687-2982");
        System.out.print("Select key:");
        String selectedKey = scanner.nextLine();
        System.out.println("(Press P for phone number/Press N for the phone user name)");
        if (scanner.hasNext("P")) {
            System.out.println(telephoneNumbers.get("Phone Number: " + selectedKey));
        } else if (scanner.hasNext("N")) {
            String value = telephoneNumbers.get(selectedKey);
            for(Entry<String,String> entry: telephoneNumbers.entrySet()){
                if(entry.getValue() == value){
                    System.out.println("Name: " + entry.getKey());
                }
            }
        } else {
            System.out.println("I dont have this phone number and name!");
        }
    }
}



