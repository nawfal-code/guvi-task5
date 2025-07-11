package guvi.task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class RajeshApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = sc.nextLine();
        try {
            // Parse input and current date
            LocalDate birthDate = LocalDate.parse(input);
            LocalDate currentDate = LocalDate.now();

            // Check for future date
            if (birthDate.isAfter(currentDate)) {
                System.out.println("Birthdate cannot be in the future.");
                return;
            }
            // Calculate age using Period
            Period age = Period.between(birthDate, currentDate);

            System.out.println("Your age is " + age.getYears() + " years, "
                    + age.getMonths() + " months, and "
                    + age.getDays() + " days.");

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter in yyyy-mm-dd format.");
        }
    }
}
