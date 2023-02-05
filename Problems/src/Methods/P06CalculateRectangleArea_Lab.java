package Methods;

import java.util.Scanner;

public class P06CalculateRectangleArea_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        System.out.println(area(a, b));


    }public static int area (int a, int b){

        return a * b;
    }

}
