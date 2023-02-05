package Methods;

import java.util.Scanner;

public class P05AddAndSubtract_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int sumAB = sum(a, b);


        System.out.println(subtract(sumAB, c));

    }public static int sum (int a, int b){

       return  a + b;
    }public static int subtract (int sum, int c){
        return sum - c;

    }    }

