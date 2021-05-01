import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > -15 && number <= 12 || number > 14 && number < 17 || number >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}