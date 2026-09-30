//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Задание 1
        System.out.println("Задание 1");

        int userOS = 1;
        if (userOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        System.out.println("Задание 2");

        int clientOS = 1;
        int clientsDeviceYear = 2014;

        if (clientOS == 0 && clientsDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else if (clientOS == 0 && clientsDeviceYear >= 2015) {
            System.out.println("Установите обычную версию для iOS по ссылке");
        } else if (clientOS == 1 && clientsDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android");
        } else {
            System.out.println("Установите обычную версию для Android по ссылке");
        }

        //Задание 3
        System.out.println("Задание 3");

        int year = 2021;

        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год является не високосным");
            }

            //Задание 4
            System.out.println("Задание 4");

            int deliveryDistance = 95;

            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: " + 1);
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется  дней: " + 2);
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + 3);
            } else {
                System.out.println("Доставки нет");
            }

            //Задание 5
            System.out.println("Задание 5");

            int monthNumber = 12;

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Неверный месяц года!");
            }
        }
    }
