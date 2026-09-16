//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        {

            //Задача 1


            int a = 1003555267;
            System.out.println("Значение переменной a с типом int равно " + a);
            byte b = 100;
            System.out.println("Значение переменной b с типом byte равно " + b);
            short c = 28585;
            System.out.println("Значение переменной c с типом short равно " + c);
            long d = 2354589456851235985L;
            System.out.println("Значение переменной d с типом long равно " + d);
            float e = 2.75f;
            System.out.println("Значение переменной e с типом float равно " + e);
            double f = 1.6958495;
            System.out.println("Значение переменной f с типом double равно " + f);


        }


        {


        //Задача 2

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        System.out.println("Значению " + a + " присвоен тип переменной float");
        System.out.println("Значению " + b + " присвоен тип переменной long");
        System.out.println("Значению " + c + " присвоен тип переменной float");
        System.out.println("Значению " + d + " присвоен тип переменной short");
        System.out.println("Значению " + e + " присвоен тип переменной short");
        System.out.println("Значению " + f + " присвоен тип переменной short");
        System.out.println("Значению " + g + " присвоен тип переменной byte");

        //Задача 3

        int ludmilaStudents = 23;
        int annaStudents = 27;
        int ekaterinaStudents = 30;
        int totalSheets = 480;
        int perStudent = totalSheets/(ludmilaStudents + annaStudents + ekaterinaStudents);
        System.out.println("На каждого ученика рассчитано " + perStudent + " листов бумаги");

        //Задача 4

        int buttlesPerTwoMinutes = 16;
        int minutesInterval = 2;
        int buttlesPerMinutes = buttlesPerTwoMinutes / minutesInterval;

        int minutes20 = 20;
        int buttlesPer20Minutes = buttlesPerMinutes * minutes20;
        System.out.println("За 20 минут машина произвела " + buttlesPer20Minutes + " штук бутылок");

        int minutesInDay = 60 * 24;
        int buttlesInDay = minutesInDay * buttlesPerMinutes;
        System.out.println("За 1 день машина произвела " + buttlesInDay + " штук бутылок");

        int buttlesIn3Days = minutesInDay * buttlesPerMinutes;
        System.out.println("За 3 дня машина произвела " + buttlesIn3Days + " штук бутылок");

        int minutesInMonth = minutesInDay * 10;
        int buttlesInMonth = minutesInMonth * buttlesPerMinutes;
        System.out.println("За месяц машина произвела " + buttlesInMonth + " штук бутылок");

        //Задача 5

        int totalCansPaint = 120;
        int cansWhitePaintInClass = 2;
        int cansBrownPaintInClass = 4;
        int totalCansPaintPerClass = cansWhitePaintInClass + cansBrownPaintInClass;
        int numberOfClasses = totalCansPaint / totalCansPaintPerClass;
        int totalCansWhitePaint = cansWhitePaintInClass * numberOfClasses;
        int totalCansBrownPaint = cansBrownPaintInClass * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + "классов, нужно " + totalCansWhitePaint + " банок белой краски и " + totalCansBrownPaint + " банок коричневой краски");

        //Задача 6

        byte weightBanana = 80;
        byte bananaPortion = 5;
        byte portionMilk = 2;
        byte weightPortionMilk = 105;
        byte icecreamCount = 2;
        byte icecreamPortion = 100;
        byte eggsCount = 4;
        byte eggsPortion = 70;

        int totalBananasWeight = weightBanana * bananaPortion;
        int totalMilkWeight = portionMilk * weightPortionMilk;
        int totalIcecreamWeight = icecreamCount * icecreamPortion;
        int totalEggsWeight = eggsCount * eggsPortion;

        int totalBreakfastWeightGram = totalBananasWeight + totalMilkWeight + totalIcecreamWeight + totalEggsWeight;
        double totalBreakfastWeightKilograms = totalBreakfastWeightGram / 1000.0;

        System.out.println("Завтрак спортмена весил " + totalBreakfastWeightGram + " грамм.");
        System.out.println("Завтрак спортмена весил " + totalBreakfastWeightKilograms + " килограмм.");

        //Задача 7

        byte totalWeight = 7;
        int totalWeightGram = 7 * 1000;
        short minKkalPerDay = 250;
        short maxKkalPerDay = 500;

        int dayInMinSpeed = totalWeightGram / minKkalPerDay;
        int dayInMaxSpeed = totalWeightGram / maxKkalPerDay;
        int averageDays = (dayInMinSpeed + dayInMaxSpeed) / 2;

        System.out.println("При потере 250 грамм в день потребуется " + dayInMinSpeed + " дней.");
        System.out.println("При потере 500 грамм в день потребуется " + dayInMaxSpeed + " дней.");
        System.out.println("В среднем потребуется " + averageDays + " дней.");

        //Задача 8

        int currentIncomeMasha = 67760;
        int currentIncomeDenis = 83690;
        int currentIncomeKristina = 76230;
        int salaryMasha = currentIncomeMasha * 10 / 100;
        int salaryDenis = currentIncomeDenis * 10 / 100;
        int salaryKristina = currentIncomeKristina * 10 / 100;

        int newCurrentIncomeMasha = currentIncomeMasha + salaryMasha;
        int newCurrentIncomeDenis = currentIncomeDenis + salaryDenis;
        int newCurrentIncomeKristina = currentIncomeKristina + salaryKristina;

        int monthInYear = 12;
        int mashaYearDiff = salaryMasha * monthInYear;
        int denisYearDiff = salaryDenis * monthInYear;
        int kristinaYearDiff = salaryKristina * monthInYear;

        System.out.println("Маша теперь получает " + newCurrentIncomeMasha + " рублей. Годовой доход вырос на " + mashaYearDiff + " рублей");
        System.out.println("Денис теперь получает " + newCurrentIncomeDenis + " рублей. Годовой доход вырос на " + denisYearDiff + " рублей");
        System.out.println("Кристина теперь получает " + newCurrentIncomeKristina + " рублей. Годовой доход вырос на " + kristinaYearDiff + " рублей");

        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        }
    }
}