package TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class
P04TextFilter_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] bannedArr = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (int i = 0; i < bannedArr.length; i++) {
            String banWord = bannedArr[i];
            if (text.contains(banWord)) {
                int count = banWord.length();
                StringBuilder replacement = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    replacement.append("*");
                }
                text = text.replace(banWord, replacement);
            }

        }
        System.out.println(text);

    }
}
