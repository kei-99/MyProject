import java.util.Random;
import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int targetNumber = rand.nextInt(101); // 0〜100のランダムな整数
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;

        while (true) {
            System.out.print("0～100の間の整数を入力してください: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < 0 || guess > 100) {
                System.out.println("0～100の範囲内で入力してください。");
                continue;
            }

            if (guess > targetNumber) {
                System.out.println("小さい数を試してください。");
            } else if (guess < targetNumber) {
                System.out.println("大きい数を試してください。");
            } else {
                System.out.println("正解です！あなたは" + attempts + "回で当てました。");
                break;
            }
        }

        scanner.close();
    }
}
