package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] array = Arrays.stream(scan.nextLine().split(" "))
                                .mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < array.length; i++) {
            int first = array [i];

            for (int j = i+1; j < array.length; j++) {
                int second = array[j];
                if (first + second == n){
                    System.out.printf("%d %d%n",first, second);
                }

            }
            
        }
    }
}
