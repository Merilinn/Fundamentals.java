package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int sum = 0;

        for (int i = 0; i < numbersArr.length-1; i++) {

            for (int j = 0; j < numbersArr.length - i -1; j++) {
                if (j < numbersArr.length - i - 1) {
                    int firstNum = numbersArr[j];
                    int secondNum = numbersArr[j + 1];
                    int result = firstNum + secondNum;
                    sum += result;
                }

            }


        }
        System.out.println(sum);


    }
}
