package DataTypesAndVariables;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid_Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double lenght = Double.parseDouble(scanner.nextLine());
        System.out.print("Length: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double volume = (lenght * width * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}