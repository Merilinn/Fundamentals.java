package BasicSyntax.BasicSyntaxExercise;

import java.util.Scanner;

public class P6StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int newNum = num;
        int factorialnum = 1;
        int sum = 0;
        while (num>0){

            int currentNum = num % 10;
            for (int i = 1; i < currentNum ; i++) {
                factorialnum += factorialnum * i;

                
            }
            sum += factorialnum;
            factorialnum = 1;
             num = num / 10;
        }
        if (newNum == sum){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
