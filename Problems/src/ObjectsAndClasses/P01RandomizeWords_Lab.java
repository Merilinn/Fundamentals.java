package ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01RandomizeWords_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> textList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        Random mixText = new Random();
        for (int i = 0; i < textList.size(); i++) {
            int index = mixText.nextInt(textList.size());
            String currentWord = textList.get(index);
            textList.remove(currentWord);
            textList.add(i, currentWord);

        }
        for (String word : textList) {
            System.out.println(String.join(System.lineSeparator(), word));

        }
    }
}
