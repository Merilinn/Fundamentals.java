package Methods;

import java.util.Scanner;

public class P10TopNumber_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        topNumber(n);

    }
    public static void topNumber(int n) {
        int sumCurrentN = 0;
        for (int i = 16; i < n; i++) {
            int currentN = i;
            int firstN = currentN;
            int topNumber = firstN;

            while (currentN > 0) {
                int lastDigit = currentN % 10;
                sumCurrentN += lastDigit;
                currentN = currentN / 10;
            }
            if (sumCurrentN % 8 == 0) {
                while (firstN > 0) {
                    int lastdigit = firstN % 10;
                    if (lastdigit % 2 != 0) {
                        System.out.println(topNumber);
                        break;
                    }
                    firstN = firstN / 10;
                }
            }
            sumCurrentN = 0;
        }
    }
}

