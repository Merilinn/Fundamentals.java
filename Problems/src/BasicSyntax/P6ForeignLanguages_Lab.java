package BasicSyntax;

import java.util.Scanner;

public class P6ForeignLanguages_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        String output = "";
        switch (country){
            case "England":
            case "USA":
                output = "English";
                break;
            case "Spain":
            case "Argentina":
            case  "Mexico":
                output = "Spanish";
                break;
            default:
                output = "unknown";
                break;
        }
        System.out.print(output);
    }
}
