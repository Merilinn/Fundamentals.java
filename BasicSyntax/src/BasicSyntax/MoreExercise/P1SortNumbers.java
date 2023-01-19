package BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P1SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());
        int count = 1;
        int bigNumber = Integer.MIN_VALUE;
        while (count <= 3){
            if (n1 >= n2 && n1 >= n3){
                bigNumber = n1;
                System.out.println(bigNumber);
                n1 = Integer.MIN_VALUE;
                bigNumber = Integer.MIN_VALUE;
            }else if (n2 >= n1 && n2 >= n3){
               bigNumber = n2;
                System.out.println(bigNumber);
                n2 = Integer.MIN_VALUE;
                bigNumber = Integer.MIN_VALUE;
            } else {
                bigNumber =n3;
                System.out.println(bigNumber);
                n3 = Integer.MIN_VALUE;
                bigNumber = Integer.MIN_VALUE;


            }
            count++;



        }    }
}
