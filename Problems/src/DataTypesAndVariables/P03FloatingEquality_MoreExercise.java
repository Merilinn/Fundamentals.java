package DataTypesAndVariables;

import java.util.Scanner;

public class P03FloatingEquality_MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
         double result = b - a;

         if (Math.abs(result) < 0.000001){
             System.out.println("True");
         }else {
             System.out.println("False");

         }    }
}
