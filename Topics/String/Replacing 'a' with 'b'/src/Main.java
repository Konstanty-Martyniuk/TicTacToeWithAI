import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] word = scanner.nextLine().toCharArray();
        for (int i = 0; i < word.length; i++) {
            if (word[i] == 'a') {
                word[i] = 'b';
            }
        }
        System.out.println(String.valueOf(word));
    }
}