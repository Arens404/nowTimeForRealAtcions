import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileReadFunction { public static Path myFilePath;

  public static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter your file name:");
    String userFileName = scanner.nextLine();
    myFilePath = Paths.get(userFileName);
    try {
      List<String> content = Files.readAllLines(myFilePath);
      for (int i = 0; i < content.size(); i++) {
        System.out.println(content.get(i));
      }
    } catch (NoSuchFileException NoSuchFileException) {
      System.out.print("Unable to read file: " + myFilePath.getFileName());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
