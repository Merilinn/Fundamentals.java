import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Работа с дати
        LocalDate birthdayMerry = LocalDate.of(1990, 4, 24);
        LocalDate birthdayDanny = LocalDate.of(1989, 1, 3);
        //добавяне
        int merri = birthdayMerry.plusMonths(2).getDayOfMonth();
        //взимане на елемент
        int danny = birthdayDanny.getDayOfMonth();
//Random
        Random mix = new Random();
        //определяне на граница
        int index = mix.nextInt(100);
//принтиране на лист/масив - всеки елемент на нов ред
        System.out.println(String.join(System.lineSeparator()));
        //Big Integer
        BigInteger num = new BigInteger(scan.nextLine());
        //Задаване на стойност
        BigInteger result = new BigInteger("1");
        BigInteger result2 = new BigInteger(String.valueOf(1));



    }


}
