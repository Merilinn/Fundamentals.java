package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        long coolNum = 1;
        String regexNum = "[0-9]";
        Pattern pattern = Pattern.compile(regexNum);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            int currentNumber = Integer.parseInt(matcher.group());
            coolNum = coolNum * currentNumber;
        }
        String regexEmoji = "(?<delimeter>[:]{2}|[*]{2})(?<name>[A-Z][a-z]{2,})\\1";
        Pattern patternEmoji = Pattern.compile(regexEmoji);
        Matcher matcherEmoji = patternEmoji.matcher(input);
        int countEmoji = 0;
        List<String> coolList = new ArrayList<>();
        while (matcherEmoji.find()) {
            countEmoji++;
            String currentEmoji = matcherEmoji.group("name");
            int emojiPoints = 0;
            for (int i = 0; i < currentEmoji.length(); i++) {
                char currentSymbol = currentEmoji.charAt(i);
                emojiPoints += currentSymbol;
            }
            if (emojiPoints >= coolNum) {
                coolList.add(matcherEmoji.group());

            }
        }
        System.out.println("Cool threshold: " + coolNum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", countEmoji);
        System.out.println(String.join(System.lineSeparator(), coolList));
    }
}
