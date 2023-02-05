package Methods;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        smallestNum(first, second, third);
    }

    public static void smallestNum(int a, int b, int c) {
        int min = Math.min(a, b);
        if (c < min) {
            System.out.println(c);
        } else {
            System.out.println(min);
        }
    }
}
