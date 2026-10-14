//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Task 1
        System.out.println("Task 1");

        int firstFriday = 5;

        for (int i = 1; i <= 31; i++) {
            if (i >= firstFriday && (i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }

        // Task 2
        System.out.println("Task 2");

// Var1
        int marathonDistance = 42195;
        int distance = 0;
        int step = 500;
        do {
            distance += step;
            int remainingDistance = marathonDistance - distance;
            System.out.println("Держись! Осталось " + remainingDistance + " метров.");
        } while (distance < marathonDistance);
// Var2
        int marathonDistance1 = 42195;
        int step1 = 500;
        for (int distance1 = 0; distance1 < marathonDistance1; distance1 += step1) {
            int remainingDistance1 = marathonDistance1 - distance1;
            System.out.println("Держись! Осталось " + remainingDistance1 + " метров.");
        }

        // Task 3
        System.out.println("Task 3");
//Var 1
        int parkingFee = 1800;
        int daylyFee = 100;
        int day = 1;
        int daysCount = 0;
        while (parkingFee >= daylyFee) {
            if (day % 5 == 0) {
                daysCount++;
                day++;
                continue;
            }

            parkingFee -= daylyFee;
            daysCount++;
            day++;
        }
        System.out.println("Количество парковочных дней: " + daysCount);

// Var 2

        int parkingPay = 1800;
        int daylyPay = 100;
        int daysCount1 = 0;

        for (int day1 = 1; parkingPay >= daylyPay; day1++) {
            if (day1 % 5 == 0) {
                daysCount1++;
                continue;
            }
            parkingPay -= daylyPay;
            daysCount1++;
        }
        System.out.println("Количество парковочных дней: " + daysCount1);

        // Task 4
        System.out.println("Task 4");

        int totalAmount = 12_000_000;
        int monthlyDeposit = 15_000;
        int interestRate = 7;
        int month = 0;
        int total = 0;

        do {
            month++;
            total += monthlyDeposit;
            if (month % 6 == 0) {
                total += total * interestRate / 100;
            }
            System.out.println("Количество месяцев: " + month + ". Сумма накоплений: " + total + " руб.");

            if (total >= totalAmount) {
                break;
            }
        } while (true);
        System.out.println("Итоговая сумма накоплений: " + total);
        System.out.println("Количество месяцев: " + month);

        // Task 5
        System.out.println("Task 5");

        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100) {
            charge += 2;
            minute++;

            if ((minute - overheats * 2) % 10 == 0) {
                overheats++;
                if (overheats == 3) {
                    break;
                }
                minute += 2;
            }
        }
        System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
        System.out.println("Время зарядки составило " + minute + " минут");

    }
}
