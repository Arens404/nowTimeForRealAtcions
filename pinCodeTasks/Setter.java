package pinCodeTasks;

public class Setter {
    private java.util.Scanner scanner = new java.util.Scanner(System.in);
    public int input() {
        int input = scanner.nextInt();
        return input;
    }
    public String nextLine() {
        String test = scanner.nextLine();
        return test;
    }
    public boolean hasNext(String input){
        input = scanner.nextLine();
        if(input == "q"){
            return true;
        }
        else {
            return false;
        }
    }
}
