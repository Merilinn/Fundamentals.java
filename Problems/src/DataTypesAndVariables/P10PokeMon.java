package DataTypesAndVariables;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        byte y = Byte.parseByte(scan.nextLine());
        int countTarget = 0;
        int newN = n;
        while (newN >= m){
            newN -= m;
            countTarget++;

            if (n / 2 == newN && y != 0){
            newN = newN / y;
;
            }
        }
        System.out.println(newN);
        System.out.println(countTarget);
    }
}
