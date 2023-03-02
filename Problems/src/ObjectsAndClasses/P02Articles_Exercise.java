package ObjectsAndClasses;

import java.util.Scanner;

public class P02Articles_Exercise {
    static class Articles {
        String title;
        String content;
        String author;
        public Articles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public void setContent(String content) {
            this.content = content;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];
        Articles inputArticles = new Articles(title, content, author);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String command = scan.nextLine();
            String currentCommand = command.split(": ")[0];
            switch (currentCommand) {
                case "Edit":
                    String newContent = command.split(": ")[1];
                    inputArticles.setContent(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = command.split(": ")[1];
                    inputArticles.setAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = command.split(": ")[1];
                    inputArticles.setTitle(newTitle);
            }
        }
        System.out.println(inputArticles);
    }
}
