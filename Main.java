import java.util.ArrayList;
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
    for (int i = 0; i < 5; i++) {
      listB.add(listA.get(i));
    }
    // 3. Task
    int q = 0;

    while (q == 0) {
      System.out.println("Select an option (1-8):");
      if (scanner.hasNext("q")) {
        System.exit(0);
      }
      int option = scanner.nextInt();
      switch (option) {
        case 1 -> {
          for (int i = 0; i < 5; i++) {
            if (listA.get(i) == "Durian") {
              System.out.println("True");
            } else {
              System.out.println("False");
            }
          }
        }
        case 2 -> {
          listB.remove(3);
        }
        case 3 -> {
          for (int i = 0; i < 5; i++) {
            if (listA.get(i) == "Durian") {
              listA.add(4, "Kivifruit");
            }
          }
        }
        case 4 -> {
          int listACount = 0;
          int listBCount = 0;
          for (int i = 0; i < listA.stream().count(); i++) {
            listACount = listACount + 1;
          }
          for (int i = 0; i < listB.stream().count(); i++) {
            listBCount = listBCount + 1;
          }
          if (listBCount < listACount) {
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
          String[] elements = new String[2];
          String currentElement = "";
          System.out.println("Add as many items as you want to add (use , to separate the elements):");
          for (int j = 0; j < 2; j++) {
            currentElement = scanner.nextLine();
            elements[j] = currentElement;
          }
          multipleAdd(listB, elements);
          listB.remove(5);
          System.out.println(listB);
        }
        case 8 -> {
          System.out.println(listA.get(3));
        }
        default -> {
          System.out.println("This program dosent have any other option");
        }
      }
    }
  }

  public static void multipleAdd(List<String> list, String[] elementArray) {
    for (int i = 0; i < elementArray.length; i++) {
      list.add(elementArray[i]);
    }
  }
}
