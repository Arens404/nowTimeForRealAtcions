import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileManagementFunction { public static Path myFilePath;

  public static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter your file name:");
    String userFileName = scanner.nextLine();
    myFilePath = Paths.get(userFileName);
    int linesCountResult = countLines(userFileName);
    System.out.println(linesCountResult);
  }

  public static int countLines(String userFile) {
    int count = 0;
    try {
      List<String> content = Files.readAllLines(Path.of(userFile));
      for (int i = 0; i < content.size(); i++) {
        count++;
      }
    } catch (NoSuchFileException NoSuchFileException) {
      System.out.print("This file is doesn't exists -> lines int the file:");
    } catch (IOException e) {
      e.printStackTrace();
    }
    return count;
  }
}
