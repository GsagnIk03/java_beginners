package loops;
import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of which you want to take out the table till 10 : ");
        int number = sc.nextInt();

        System.out.println("Here's the table of " + number);
        for (int i=1;i<=10;i++) {
            System.out.println("" + number + "*" + i + "=" + number*i);
        }
    }
}
