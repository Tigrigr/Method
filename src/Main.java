import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void hightYear(int year) {
        int multipleOfFour = year % 4;
        int multipleOfOnehundred = year % 100;
        int multipleOfFourhundred = year % 400;
        if (multipleOfOnehundred != 0 && multipleOfFour == 0 || multipleOfFourhundred == 0) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
    }

    public static void task1() {
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        hightYear(year);
    }

}