package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class P01AdvertisementMessage_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String [] phrasesArr = {
                "Such a great product.",
                "Excellent product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        String [] eventsArr = {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String [] authorsArr = {
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva",};
        String [] citiesArr = {
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"};

        Random index = new Random();
        for (int i = 1; i <= n; i++) {
           int currentPhrase = index.nextInt(phrasesArr.length);
           int currentEvent = index.nextInt(eventsArr.length);
           int currentAuthor = index.nextInt(authorsArr.length);
           int currentCity = index.nextInt(citiesArr.length);
            System.out.printf("%s %s %s – %s%n", phrasesArr[currentPhrase], eventsArr[currentEvent], authorsArr[currentAuthor], citiesArr[currentCity]);
        }




    }
}
