package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scan.nextLine().split(" ")).
                map(Double::parseDouble).collect(Collectors.toList());

        int count = 0;
        while (count < numbers.size()) {
            double leftNumber = numbers.get(count);
            if (count + 1 == numbers.size()) {
                count++;
                continue;
            }
            double rightNumber = numbers.get(count + 1);

            if (rightNumber == leftNumber) {
                numbers.set(count, rightNumber + leftNumber);
                numbers.remove(rightNumber);
                count = 0;
                continue;

            }
            count++;

        }
        for (Double number : numbers) {
            String numb = new DecimalFormat("0.##").format(number);
            System.out.print(numb + " ");
        }

    }
}

