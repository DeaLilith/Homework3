import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");

        int[] inputArray1 = {63_529, 52_338, 85_495, 53_799, 69_697};

         int sum = 0;
         int max = inputArray1[0];
         int min = inputArray1[0];

         for (int value : inputArray1) {
             sum = sum += value;

             if (value > max) {
                 max = value;
             }
             if (value < min) {
                 min = value;
             }
         }
         float average = (float) sum / inputArray1.length;

         double[] outputArray = new double[4];
         outputArray[0] = sum;
         outputArray[1] = max;
         outputArray[2] = min;
         outputArray[3] = average;

        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray));

        //Task 2
        System.out.println("Task 2");

        int[] inputArray2 = {75_000, 48_000, 92_000, 60_000, 83_000};

        double[] outputArray2 = new double[5];

        int indexTask2 = 0;

        for (int salary : inputArray2) {
            outputArray2[indexTask2] = salary * 0.13;
            indexTask2++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        //Task 3
        System.out.println("Task 3");

        int[] inputArray3 = {6000, 3500, 5000, 8200, 4900};
        boolean[] outputArray3 = new boolean[5];
        int indexTask3 = 0;
        for (int value : inputArray3) {
            if (value < 0) {
            break;
            }
            outputArray3[indexTask3] = value > 5000;
            indexTask3++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        //Task 4
        System.out.println("Task 4");

        int[] inputArray4 = {1500, 2300, -500, 4000, 1200};
        boolean[] outputArray4 = new boolean[1];
        outputArray4[0] = true;

        for(int balance : inputArray4) {
            if (balance < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        //Task 5
        System.out.println("Task 5");

        int[] inputArray5 = {500_000, -20_000, 0, 150_000, -5_000};
        int profitableMonthCount = 0;
        for(int profit : inputArray5) {
            if (profit > 0) {
                profitableMonthCount++;
            }
        }
        int[] outputArray5 = new int[1];
        outputArray5[0] = profitableMonthCount;

        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}