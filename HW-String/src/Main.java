//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        { // Task 1
            System.out.println("Task 1");

            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;

            System.out.println("Ф. И. О. сотрудника — " + fullName);

        }

        {
            // Task 2
            System.out.println("Task 2");

            String fullName = "Ivanov Ivan Ivanovich";
            String upperFullName = fullName.toUpperCase();

            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperFullName);
        }

        {
            // Task 3
            System.out.println("Task 3");

            String fullName3WithYo = "Иванов Семён Семёнович";
            String fullName3Fixed = fullName3WithYo.replace("ё", "е");

            System.out.println("Данные Ф. И. О. сотрудника — " + fullName3Fixed);
        }
    }
}