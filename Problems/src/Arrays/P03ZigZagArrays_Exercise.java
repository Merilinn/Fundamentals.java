package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] arrOne = new int[n];
        int[] arrTwo = new int[n];
        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                arrOne[i] = input[0];
                arrTwo[i] = input[1];
            } else {
                arrOne[i] = input[1];
                arrTwo[i] = input[0];
            }
        }
        for (int i : arrOne) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arrTwo) {
            System.out.print(i + " ");
        }
    }
}
