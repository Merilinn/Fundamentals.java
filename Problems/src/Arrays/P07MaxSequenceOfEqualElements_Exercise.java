package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scan.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int length = 1;
        int maxIndex = Integer.MIN_VALUE;
        int maxLength = 0;
        for (int i = 1; i < numbersArr.length; i++) {
            int previousN = numbersArr[i - 1];
            int currentN = numbersArr[i];

            if (previousN == currentN) {

                length += 1;
            } else {
                length = 1;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }
        for (int i = maxIndex; i > maxIndex - maxLength; i--) {
            System.out.print(numbersArr[i] + " ");

        }
    }
}
