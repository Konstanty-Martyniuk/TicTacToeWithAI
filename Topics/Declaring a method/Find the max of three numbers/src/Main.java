import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int result = 0;
        if (a >= b && a >= c) {
            result = 1;
        } else if (b >= a && b >= c) {
            result = 2;
        } else {
            result = 3;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}