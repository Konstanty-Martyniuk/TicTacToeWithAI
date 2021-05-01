import java.util.Scanner;

public class Main {

    public static double pow(double a, long n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double powerOfHalfN = pow(a, n / 2);
            return powerOfHalfN * powerOfHalfN;
        } else {
            return a * pow(a, n - 1);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double a = Double.parseDouble(scanner.nextLine());
        final int n = Integer.parseInt(scanner.nextLine());
        System.out.println(pow(a, n));
    }
}