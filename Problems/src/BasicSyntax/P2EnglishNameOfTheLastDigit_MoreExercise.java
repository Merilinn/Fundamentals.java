package BasicSyntax;

import java.util.Scanner;

public class P2EnglishNameOfTheLastDigit_MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int digit = 0;
        String output = "";
        while (output.equals("")){
            digit = input % 10;
            switch (digit){
                case 1:
                    output = "one";
                    break;
                case 2:
                    output = "two";
                    break;
                case 3:
                    output = "three";
                    break;
                case  4:
                    output = "four";
                    break;
                case 5:
                    output = "five";
                    break;
                case 6:
                    output = "six";
                    break;
                case 7:
                    output = "seven";
                    break;
                case 8:
                    output = "eight";
                    break;
                case 9:
                    output = "nine";
                    break;
                case 0:
                    output = "zero";
                    break;
            }
        } System.out.println(output);
    }
}

