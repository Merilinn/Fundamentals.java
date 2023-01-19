package BasicSyntax.BasicSyntaxExercise;

import java.util.Scanner;

public class P2Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int divisible = Integer.MIN_VALUE;

        while (true){
       if (n % 2 == 0){
           divisible = 2;
       } if (n % 3 == 0) {
           divisible = 3;
       } if (n % 6 == 0) {
           divisible = 6;
       } if (n % 7 == 0) {
           divisible = 7;
       } if (n % 10 == 0) {
           divisible = 10;
       } break;
        } if (divisible >= 2 && divisible <= 10){
            System.out.printf("The number is divisible by %d", divisible);
        }else {
            System.out.println("Not divisible");
        }
    }
}
