package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class P01ConvertMetersToKilometers_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int meters = Integer.parseInt(scan.nextLine());
        BigDecimal kilometer = new BigDecimal(meters);
        kilometer = kilometer.divide(BigDecimal.valueOf(1000));
        System.out.printf("%.2f", kilometer);
    }
}
