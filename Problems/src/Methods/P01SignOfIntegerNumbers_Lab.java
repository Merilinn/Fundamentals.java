package Methods;

import java.util.Scanner;

public class P01SignOfIntegerNumbers_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        signNumber(number);
    }
    public static void signNumber (int number){
        String type = "";

        if (number < 0){
            type = "negative";

        } else if (number > 0) {
            type = "positive";

        }
        else {
            type = "zero";

        }
        System.out.printf("The number %d is %s.", number, type);
    }
}
