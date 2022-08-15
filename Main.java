public class Main {
    public static void main(String[] args) {
        String testString = "Have a nice day my friend";
        char[] result = ReverseString(testString);
        System.out.println(result);
        //ReverseString(testString);
    }
    public static char[] ReverseString(String userString){
        int length = userString.length()-1;
        char[] block = new char[length+1];
        for(int i = 0; i < userString.length();i++){
           block[i] = (userString.charAt(length-i));
        }
        return block;
    }
}
