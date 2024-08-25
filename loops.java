package loops;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range : ");
        int range = sc.nextInt();

        System.out.println("natural numbers fall between 1 to the range are printed below :");
        for(int i=1; i<=range; i++) {
            System.out.println(i);
        }
    }
}
