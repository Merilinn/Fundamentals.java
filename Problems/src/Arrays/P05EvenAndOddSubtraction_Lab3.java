package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction_Lab3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbersArr = Arrays.
                stream(scan.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;
        for (int currentN : numbersArr) {
            if (currentN % 2 == 0) {
                sumEven += currentN;
            } else {
                sumOdd += currentN;
            }
        }
        System.out.println(sumEven - sumOdd);
    }

}
