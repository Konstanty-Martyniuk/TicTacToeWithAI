import java.util.Scanner;

public class Main {

    public static long fib(long n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 2) - fib(n - 1);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}