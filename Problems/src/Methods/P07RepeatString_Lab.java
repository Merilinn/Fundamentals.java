package Methods;

import java.util.Scanner;

public class P07RepeatString_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(repeat(text, n));

    }

    private static String repeat(String text, int n) {
        String result = "";
        for (int i = 0; i <  n; i++) {
            result = result + text;
        }
        return result;


    }
}
