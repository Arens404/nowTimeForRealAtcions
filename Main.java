import java.util.HashMap;
import java.util.Scanner;

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
        String keySelect = scanner.nextLine();
        switch (keySelect){
            case "William A. Lathan" -> {
                System.out.println("PhoneNumber or Name? (P/N)");//2
                if(scanner.hasNext("P")){
                    System.out.println(telephoneNumbers.get("William A. Lathan"));
                } else if (scanner.hasNext("N")) {
                    System.out.println((telephoneNumbers.keySet().toArray()[2]));
                }
            }
            case "John K. Miller" -> {
                System.out.println("PhoneNumber or Name? (P/N)");
                if(scanner.hasNext("P")){
                    System.out.println(telephoneNumbers.get("John K. Miller"));//0
                } else if (scanner.hasNext("N")) {
                    System.out.println((telephoneNumbers.keySet().toArray()[0]));
                }
            }
            case "Hortensia E. Foster" -> {
                System.out.println("PhoneNumber or Name? (P/N)");
                if(scanner.hasNext("P")){
                    System.out.println("Hortensia E. Foster");
                } else if (scanner.hasNext("N")) {
                    System.out.println((telephoneNumbers.keySet().toArray()[4]));
                }
            }
            case "Amanda D. Newland" -> {
                System.out.println("PhoneNumber or Name? (P/N)");
                if(scanner.hasNext("P")){
                    System.out.println(telephoneNumbers.get("Amanda D. Newland"));
                } else if (scanner.hasNext("N")) {
                    System.out.println((telephoneNumbers.keySet().toArray()[3]));
                }

            }
            case "Brooke P. Askew" -> {
                System.out.println("PhoneNumber or Name? (P/N)");
                if(scanner.hasNext("P")){
                    System.out.println(telephoneNumbers.get("Brooke P. Askew"));//1
                } else if (scanner.hasNext("N")) {
                    System.out.println((telephoneNumbers.keySet().toArray()[1]));
                }

            }
            default -> {
                System.out.println("I dont have this phone number and name!");
            }
        }
    }
}
