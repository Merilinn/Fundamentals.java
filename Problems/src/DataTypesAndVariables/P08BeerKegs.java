package DataTypesAndVariables;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String biggerKeg = "";
        double volume = 0.0;
        for (int i = 0; i < n; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double volumeOr = Math.PI * Math.pow(radius, 2) * height;
            if (volumeOr > volume){
                volume = volumeOr;
                biggerKeg = model;
            }
        }
        System.out.println(biggerKeg);
    }
}
