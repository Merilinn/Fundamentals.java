package BasicSyntax;

import java.util.Scanner;

public class P8TriangleOfNumbers_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= rows ; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print(i + " ");


            }
            System.out.println();
        }
        }
    }

