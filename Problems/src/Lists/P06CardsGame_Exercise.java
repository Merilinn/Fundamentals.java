package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayer.size() != 0 && secondPlayer.size() != 0) {

            int firstPlayerCard = firstPlayer.get(0);
            int secondPlayerCard = secondPlayer.get(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
                firstPlayer.remove(firstPlayer.get(0));
                secondPlayer.remove(secondPlayer.get(0));
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayer.add(secondPlayerCard);
                secondPlayer.add(firstPlayerCard);
                firstPlayer.remove(firstPlayer.get(0));
                secondPlayer.remove(secondPlayer.get(0));

            } else {
                firstPlayer.remove(firstPlayer.get(0));
                secondPlayer.remove(secondPlayer.get(0));
            }


        }
        int sum = 0;
        for (Integer cards : winner(firstPlayer, secondPlayer)) {
            sum += cards;

        }
        System.out.printf("%s player wins! Sum: %d", player(firstPlayer, secondPlayer), sum);


    }

    public static List<Integer> winner(List<Integer> a, List<Integer> b) {
        if (a.size() != 0) {
            return a;
        } else {
            return b;
        }

    }

    public static String player(List<Integer> a, List<Integer> b) {
        if (a.size() > b.size()) {
            return "First";
        } else {
            return "Second";

        }
    }
}

