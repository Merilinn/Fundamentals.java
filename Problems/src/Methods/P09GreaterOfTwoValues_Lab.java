package Methods;

import java.util.Scanner;

public class P09GreaterOfTwoValues_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();


        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(scan.nextLine());
                int secondNum = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(firstNum, secondNum));
                break;
            case "string":
                String first = scan.nextLine();
                String second = scan.nextLine();
                System.out.println(getMax(first, second));
                break;

            case "char":
                char firstSymbol = scan.nextLine().charAt(0);
                char secondSymbol = scan.nextLine().charAt(0);
                System.out.println(getMax(firstSymbol, secondSymbol));
                break;
        }


    }

    public static int getMax(int first, int second) {

        return Math.max(first, second);

    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) > 0) {
            return first;
        } else {
            return second;
        }
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }

    }

}

