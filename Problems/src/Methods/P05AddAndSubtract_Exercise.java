package Methods;

import java.util.Scanner;

public class P05AddAndSubtract_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());



        System.out.println(sum(a, b) - c);

    }public static int sum (int a, int b){

       return  a + b;
    }
    }

