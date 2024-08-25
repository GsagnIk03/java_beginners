package loops;
import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range : ");
        int range = sc.nextInt();

        System.out.println("natural numbers printed in the reverse order to 1 from the range below : ");
        for (int i=range;i>=1;i--) {
            System.out.println(i);
        }
    }
}
