package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06ListOfProducts_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String productToAdd = scan.nextLine();
            productList.add(i, productToAdd);

        }
        Collections.sort(productList);
        int number = 1;
        for (String product : productList) {
            System.out.printf("%d.%s%n", number, product);
            number++;

        }
    }
}
