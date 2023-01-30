package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < numbersArr.length; i++) {
            for (int j = 0; j < numbersArr.length - i; j++) {
                if (j < numbersArr.length - i - 1) {
                    numbersArr[j] = numbersArr[j] + numbersArr[j + 1];
                }

            }

        }
        System.out.println(numbersArr[0]);


    }

}

