//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Задание 1
        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задание 3
        System.out.println("Задание 3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        //Задание 4
        System.out.println("Задание 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Задание 5
        System.out.println("Задание 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        //Задание 6
        System.out.println("Задание 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);

        }

        //Задание 7
        System.out.println("Задание 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задание 8
        System.out.println("Задание 8");
        int sum = 29000;

        for (int month = 1; month <= 12; month++) {
            sum = sum + 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        //Задание 9
        System.out.println("Задание 9");

        int sum1 = 29000;

        for (int month = 1; month <= 12; month++) {
            sum1 = sum1 + 29000;
            sum1 = sum1 + sum1 * 1 / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum1 + " рублей");
        }

        //Задание 10
        System.out.println("Задание 10");

        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}