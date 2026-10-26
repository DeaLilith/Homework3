import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] secondArray = {1.57, 7.654, 9.986};

        int[] customArray = {15, 126, 322, 58, 29};

        //Task 2
        System.out.println("Task 2");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(secondArray[i]);
            if (i < secondArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < customArray.length; i++) {
            System.out.print(customArray[i]);
            if (i < customArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        //Task 3
        System.out.println("Task 3");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(secondArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = customArray.length - 1; i >= 0; i--) {
            System.out.print(customArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        //Task 4
        System.out.println("Task 4");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}