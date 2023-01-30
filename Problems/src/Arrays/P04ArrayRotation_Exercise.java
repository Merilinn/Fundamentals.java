package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotation = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotation; i++) {
            int currentN = array[0];

            for (int j = 0; j < array.length-1; j++) {
                array [j] = array [j+1];
                if (j + 1 == array.length-1){
                    array [array.length-1] = currentN;
                }
            }


        }
        for (int i : array) {
            System.out.print(i + " ");

        }
    }
}
