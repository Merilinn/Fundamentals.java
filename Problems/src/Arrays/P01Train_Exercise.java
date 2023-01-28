package Arrays;

import java.util.Scanner;

public class P01Train_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wagon = Integer.parseInt(scan.nextLine());
        int [] people = new int[wagon];
        int sum = 0;
        for (int i = 0; i < wagon; i++) {
            people[i] = Integer.parseInt(scan.nextLine());
            sum = sum + people[i];
            System.out.print(people[i] + " ");

        }
        System.out.println();
        System.out.println(sum);


    }
}
