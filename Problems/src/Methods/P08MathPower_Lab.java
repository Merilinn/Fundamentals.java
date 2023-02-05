package Methods;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        double power = Double.parseDouble(scan.nextLine());
        System.out.println(new DecimalFormat("0.####").format(numPow(number, power)));
    }
    private static double numPow (double num, double pow){
        double result = Math.pow(num, pow);
        return result;
    }
}
