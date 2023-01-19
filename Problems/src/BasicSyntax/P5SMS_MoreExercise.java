package BasicSyntax;

import java.util.Scanner;

public class P5SMS_MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        char print = 0;

        while (n>0) {
            int digit = Integer.parseInt(scan.nextLine());
            if (digit == 0){
                System.out.print(" ");
            } else if (digit == 2) {
                System.out.print("a");
            } else if (digit == 22) {
                System.out.print("b");
            } else if (digit == 222) {
                System.out.print("c");
            } else if (digit == 3) {
                System.out.print("d");
            } else if (digit == 33) {
                System.out.print("e");
            } else if (digit == 333) {
                System.out.print("f");
            } else if (digit == 4) {
                System.out.print("g");
            }  else if (digit == 44) {
                System.out.print("h");
            } else if (digit == 444) {
                System.out.print("i");
            } else if (digit == 5) {
                System.out.print("j");
            } else if (digit == 55) {
                System.out.print("k");
            } else if (digit == 555) {
                System.out.print("l");
            } else if (digit == 6) {
                System.out.print("m");
            } else if (digit == 66) {
                System.out.print("n");
            } else if (digit == 666) {
                System.out.print("o");
            } else if (digit == 7) {
                System.out.print("p");
            } else if (digit == 77) {
                System.out.print("q");
            } else if (digit == 777) {
                System.out.print("r");
            } else if (digit == 7777) {
                System.out.print("s");
            }else if (digit == 8) {
                System.out.print("t");
            } else if (digit == 88) {
                System.out.print("u");
            } else if (digit == 888) {
                System.out.print("v");
            } else if (digit == 9) {
                System.out.print("w");
            } else if (digit == 99) {
                System.out.print("x");
            } else if (digit == 999) {
                System.out.print("y");
            } else if (digit == 9999) {
                System.out.print("z");
            }
            n--;
        }

    }
}
