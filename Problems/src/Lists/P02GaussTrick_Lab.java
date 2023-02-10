package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <Double> numbers =Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble)
                                                                            .collect(Collectors.toList());


            numbers.set(0, numbers.get(0) + numbers.get(numbers.size()-1));
            numbers.remove(numbers.size()-1);
            numbers.set(1, numbers.get(1) + numbers.get(numbers.size()-1));
            numbers.remove(numbers.size()-1);

        for (Double number : numbers) {
            String num = new DecimalFormat("0.##").format(number);
            System.out.print(num + " ");

        }


    }
}
