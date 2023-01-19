package BasicSyntax;

import java.util.Scanner;

public class P3GamingStore_MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = Double.parseDouble(scan.nextLine());
        String turn = scan.nextLine();
        double spent = 0.0;
        boolean flag = false;

        while (!turn.equals("Game Time")){
            switch (turn){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    if (balance < 39.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    balance -= 39.99;
                    spent += 39.99;
                    System.out.println("Bought " + turn);
                    if (balance <= 0){
                        System.out.println("Out of money!");
                        flag = true;
                        break;
                    }
                    break;
                case "CS: OG":
                    if (balance < 15.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    balance -= 15.99;
                    spent += 15.99;
                    System.out.println("Bought " + turn);
                    if (balance <= 0){
                        System.out.println("Out of money!");
                        flag = true;
                        break;
                    }
                    break;
                case "Zplinter Zell":
                    if (balance < 19.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    balance -= 19.99;
                    spent += 19.99;
                    System.out.println("Bought " + turn);
                    if (balance <= 0){
                        System.out.println("Out of money!");
                        flag = true;
                        break;
                    }
                    break;
                case "Honored 2":
                    if (balance < 59.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    balance -= 59.99;
                    spent += 59.99;
                    System.out.println("Bought " + turn);
                    if (balance <= 0){
                        System.out.println("Out of money!");
                        flag = true;
                        break;
                    }
                    break;
                case "RoverWatch":
                    if (balance < 29.99){
                        System.out.println("Too Expensive");
                        break;
                    }
                    balance -= 29.99;
                    spent += 29.99;
                    System.out.println("Bought " + turn);
                    if (balance <= 0){
                        System.out.println("Out of money!");
                        flag = true;
                        break;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;

            }
            turn = scan.nextLine();
        }
        if (flag){
            System.out.close();
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, balance);

        }    }
}
