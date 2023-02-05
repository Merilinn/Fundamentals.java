package Methods;

import java.util.Scanner;

public class P07NxNMatrix_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        matrix(n);
        
    }public static void matrix (int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");

            }
            System.out.println();
            
        }
    }
}
