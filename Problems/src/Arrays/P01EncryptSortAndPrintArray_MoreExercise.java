package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray_MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int [] numbers = new int[n];
        while (n > 0){
            String input = scan.nextLine();
            for (int i = 0; i < input.length(); i++) {
                char symbol  = input.charAt(i);

                if (symbol == 65 || symbol == 69 || symbol == 73 || symbol == 79 || symbol == 85 ||
                        symbol == 97 || symbol == 101 || symbol == 105 || symbol == 111 || symbol == 117){

                    sum += symbol * input.length();
                }
                else {
                    sum += symbol / input.length();
                }
            }
            numbers [n-1] = sum;
            sum = 0;
            n--;
        }
        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }


            
        }
    }

