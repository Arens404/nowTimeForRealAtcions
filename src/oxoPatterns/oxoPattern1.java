package oxoPatterns;

import java.util.Scanner;

public class oxoPattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.print("Line:");
            int n = scan.nextInt();
            System.out.print("Column:");
            int c = scan.nextInt();
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0){
                    for(int j = 1; j <= c; j++){
                        System.out.print("xo");
                    }
                } else {
                    for(int j = 1; j <= c; j++){
                        System.out.print("ox");
                    }
                }
                System.out.println();
            }
        } catch (Exception e){
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }

    }
}
//u
