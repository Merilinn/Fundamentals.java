package DataTypesAndVariables;

import java.util.Scanner;

public class P11Snowballs_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int snowBalls = Integer.parseInt(scan.nextLine());
        double bestValue = 0.0;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;

        for (int i = 0; i < snowBalls; i++) {
            int snow = Integer.parseInt(scan.nextLine());
            int time = Integer.parseInt(scan.nextLine());
            int quality = Integer.parseInt(scan.nextLine());

            int value = (snow / time);
            double valueTotal = Math.pow(value, quality);
            if (valueTotal > bestValue){
                bestValue = valueTotal;
                bestSnow = snow;
                bestTime = time;
                bestQuality = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestValue, bestQuality);
    }
}
