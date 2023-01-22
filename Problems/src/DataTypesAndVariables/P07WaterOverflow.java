package DataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte n = Byte.parseByte(scan.nextLine());
        short sum = 0;
        while (n > 0) {
            short pour = Short.parseShort(scan.nextLine());
            sum += pour;
            if (sum > 255 || pour > 255) {
                sum -= pour;
                System.out.println("Insufficient capacity!");
            }
            n--;
        }
        System.out.println(sum);
    }
}
