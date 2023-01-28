package Arrays;

import java.util.Scanner;

public class P04ReverseArrayOfStrings_Lab2 {

        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);

            String[] input = scan.nextLine().split(" ");

            for (int i = 0; i < input.length; i++) {
                String currentE = input[input.length - 1 - i];

                System.out.printf("%s ", currentE);

            }
        }
    }
