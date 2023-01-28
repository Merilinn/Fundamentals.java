package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int biggerN = Integer.MIN_VALUE;
        int biggerIndex = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            int currentN = numbersArr[i];

            if (currentN > biggerN) {
                biggerN = currentN;
                biggerIndex = i;
            }
            if (i + 1 == numbersArr.length) {
                System.out.print(biggerN + " ");

                for (int j = biggerIndex + 1; j < numbersArr.length; j++) {
                    int leftN = numbersArr[j];
                    if (j + 1 == numbersArr.length) {
                        System.out.print(leftN);
                        break;
                    }
                    int rightN = numbersArr[j + 1];
                    if (leftN > rightN) {
                        System.out.print(leftN + " ");
                    }
                }
            }
        }
    }
}

