import java.util.Scanner;

public class Lesson11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("整数値を入力してください: ");
            num = scanner.nextInt();
            if (num < 2) {
                System.out.println("2以上の整数を入力してください。");
            }
        } while (num < 2);

        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("入力された数値 " + num + " は素数です");
        } else {
            System.out.println("入力された数値 " + num + " は素数ではありません");
        }

        scanner.close();
    }
}
