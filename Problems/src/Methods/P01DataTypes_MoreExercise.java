package Methods;

import java.util.Scanner;

public class P01DataTypes_MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();

        switch (type) {
            case "int":
                int number = Integer.parseInt(scan.nextLine());
                System.out.println(manipulation(number));
                break;
            case "real":
                double inputNumber = Double.parseDouble(scan.nextLine());
                System.out.printf("%.2f", manipulation(inputNumber));
                break;
            case "string":
                String input = scan.nextLine();
                manipulation(input);
        }
    }

    public static void manipulation(String input) {
        System.out.printf("$%s$", input);
    }

    public static int manipulation(int number) {
        return number * 2;
    }

    public static double manipulation(double num) {
        return num * 1.5;
    }

}
