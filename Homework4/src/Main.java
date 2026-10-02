//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {

            //Задание 1

            int age = 16;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
            }


            //Задача 2
            int temp = 0;
            if (temp > 5) {
                System.out.println("На улице " + temp + " градусов, сегодня тепло, можно идти без шапки");
            } else {
                System.out.println("На улице " + temp + " градусов, холодно, нужно надеть шапку");
            }

            //Задача 3

            int speed = 67;
            if (speed < 60) {
                System.out.println("Если скорость " + speed + " то, можно ездить спокойно");
            } else {
                System.out.println("Если скорость " + speed + " то, придется заплатить штраф");
            }

            //Задача 4
            int years = 15;
            if (years >= 2 && years <= 6) {
                System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад");
            }
            if (years >= 7 && years <= 17) {
                System.out.println("Если возраст человека равен " + years + ",  то ему нужно ходить в школу");
            }
            if (years >= 18 && years <= 24) {
                System.out.println("Если возраст человека равен " + years + ",  то ему нужно ходить в университет");
            }
            if (years > 24) {
                System.out.println("Если возраст человека равен " + years + ",  то ему нужно ходить на работу");
            }

            //Задача 5

            int yearsOld = 10;
            if (yearsOld < 5) {
                System.out.println("Если возраст ребенка равен " + yearsOld + " то, ему нельзя кататься на аттракционе");
            }
            if (yearsOld >= 5 && yearsOld <= 14) {
                System.out.println("Если возраст ребенка равен " + yearsOld + " то, ему можно кататься на аттракционе в сопровождении взрослого");
            }
            if (yearsOld > 14) {
                System.out.println("Если возраст ребенка равен " + yearsOld + " то, ему можно кататься на аттракционе без сопровождения взрослого");
            }

            //Задача 6

            int places = 102;
            int placesSit = 60;
            int passengers = 33;
            if (passengers < placesSit) {
                System.out.println("Если в вагоне " + passengers + " пассажира, то есть сидячие и стоячие места");
            }
            if (passengers >= placesSit && passengers < places) {
                System.out.println("Если в вагоне " + passengers + " пассажира, то есть только стоячие места");
            }
            if (passengers >= places) {
                System.out.println("Если в вагоне " + passengers + " пассажира, то мест нет");
            }

            //Задача 7
            int one = 1;
            int two = 2;
            int three = 3;
            if (one >= two && one >= three) {
                System.out.println("Наибольшее число в переменной one, равно " + one);
            } else {
                if (two >= three) {
                    System.out.println("Наибольшее число в переменной two, равно " + two);
                } else {
                    System.out.println("Наибольшее число в переменной three, равно " + three);
                }
            }
        }
    }
}
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.


