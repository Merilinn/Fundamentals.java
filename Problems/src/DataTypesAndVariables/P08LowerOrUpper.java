package DataTypesAndVariables;

import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char first = scan.nextLine().charAt(0);


        if (Character.isUpperCase(first)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(first)) {
            System.out.println("lower-case");
        }
    }
}
