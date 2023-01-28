package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < firstArr.length; i++) {

            int firstElement = firstArr[i];
            int secondElement = secondArr[i];

            if (firstElement == secondElement) {
                sum += firstElement;
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                flag = true;
                break;
            }

        }
        if (!flag) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}






