package oxoPatterns;

import java.util.Scanner;

public class oxoPattern2 {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);

            System.out.print("Line:");
            int n = scan.nextInt();
            System.out.print("Column:");
            int c = scan.nextInt();
            for(int i = 1; i <= n; i++){
                if( i % 3 == 0 || i % 5 == 0 || i % 6 == 0){
                    for(int j = 1; j <= c; j++){
                        System.out.print("III");
                    }
                } else{
                    if(i % 2 == 0){
                        for(int j = 1; j <= c; j++){
                            System.out.print("xo");
                            if(j % 2 == 0){
                                System.out.print("II");
                            }
                        }

                    } else {
                        for(int j = 1; j <= c; j++){
                            System.out.print("xo");
                            if(j % 2 == 0){
                                System.out.print("II");
                            }
                        }
                    }
                }
                System.out.println();

            }
        }catch (Exception e){
            System.out.println("Wrong format! Please use numbers to enter the input!");
        }
        //uwu
    }
}
