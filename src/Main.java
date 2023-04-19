import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }

    public static void calculateHightYear(int year) {
        int multipleOfFour = year % 4;
        int multipleOfOnehundred = year % 100;
        int multipleOfFourhundred = year % 400;
        if (multipleOfOnehundred != 0 && multipleOfFour == 0 || multipleOfFourhundred == 0) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
    }

    public static void getDeviceInfo(int deviceYear, int deviceOs) {
        int currentYear = LocalDate.now().getYear();
        if(currentYear<=deviceYear){
            if(deviceOs == 0){
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }else {
            if(deviceOs == 0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }
    }


    public static void task1() {
        System.out.println("Задача 1");
        System.out.print("Введите год: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        calculateHightYear(year);
    }
    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        System.out.print("Введите год выпуска устройства: ");
        Scanner scanner = new Scanner(System.in);
        int deviceYear = scanner.nextInt();
        System.out.print("Введите модель операционной системы, 0 - iOS, 1 - Android: ");
        int deviceOs = scanner.nextInt();
        getDeviceInfo(deviceYear, deviceOs);
    }

}