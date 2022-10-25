import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scanner.nextInt();

        int sum = 0;
        while (a != 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println("Sum of digits " + sum);
    }
}
