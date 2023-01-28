package Arrays;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int [] numbersArr = new int[n];

        for (int i = 0; i < n; i++) {
           int number = Integer.parseInt(scan.nextLine());
           numbersArr [i] = number;
        }
        for (int i = n-1; i >= 0 ; i--) {
            System.out.print(numbersArr[i] + " ");

        }
    }
}
