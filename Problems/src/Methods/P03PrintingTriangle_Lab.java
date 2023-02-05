package Methods;

import java.util.Scanner;

public class P03PrintingTriangle_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        triangle(n);
    }

    //3
    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
        for (int i = n-1; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }
}
