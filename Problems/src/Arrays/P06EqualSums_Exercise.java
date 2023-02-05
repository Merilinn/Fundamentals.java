package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int [] longArray = new int[numArray.length+2];
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;

        for (int i = 1; i < longArray.length; i++) {
            longArray [0] = 0;
            longArray [i] = numArray[i-1];
            if (numArray.length == 1) {
                System.out.println(i);
                break;
            }

            rightSum = Integer.MIN_VALUE;
            leftSum += longArray[i-1];


//10 5 5 99 3 4 2 5 1 1 4
            for (int j = i + 1; j < longArray.length; j++) {
                longArray [longArray.length-1] = 0;
                longArray [j] = i + 2;
                rightSum += longArray[j+1];
                if (j + 2 != longArray.length){
                    continue;
                }
                if (leftSum == rightSum) {
                    System.out.println(i+1);
                    return;
                } else if (numArray.length == 3) {
                    System.out.println("no");
                    return;

                }
            }
        }
        if (rightSum != leftSum) {
            System.out.println("no");
        }
    }
}
