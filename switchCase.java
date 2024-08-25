package conditional_coding;
import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        String day = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a number to denote the day : (1. Monday, 2. Tuesday, 3. Wednesday, 4. Thursday, 5. Friday, 6. Saturday, 7. Sunday)");
        int dayNumber = sc.nextInt();

        // This is the example of if-else
        if (dayNumber == 1) {
            day = "Monday";
        }

        else if (dayNumber == 2) {
            day = "Tuesday";
        }

        else if (dayNumber == 3) {
            day = "Wednesday";
        }

        else if (dayNumber == 4) {
            day = "Thursday";
        }

        else if (dayNumber == 5) {
            day = "Friday";
        }

        else if (dayNumber == 6) {
            day = "Saturday";
        }

        else if (dayNumber == 7) {
            day = "Sunday";
        }

        else {
            System.out.println("idiot! rerun the program again and put the correct input.");
        }

        switch (day) {
            case "Monday":
                System.out.println("1st day of the week.");
                break;
            case "Tuesday":
                System.out.println("2nd day of the week.");
                break;
            case "Wednesday":
                System.out.println("3rd day of the week.");
                break;
            case "Thursday":
                System.out.println("4th day of the week.");
                break;
            case "Friday":
                System.out.println("5th day of the week.");
                break;
            case "Saturday":
                System.out.println("6th day of the week.");
                break;
            case "Sunday":
                System.out.println("7th day of the week.");
                break;
            default:
                break;
        }
    }
}
