import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1から5まで表示
        System.out.println("1から5まで表示:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 6から10まで表示
        System.out.println("\n6から10まで表示:");
        for (int i = 6; i <= 10; i++) {
            System.out.println(i);
        }

        // ユーザー入力
        System.out.print("\nカウントアップしたい数を入力してください: ");
        int maxCount = scanner.nextInt();

        // 1からmaxCountまで表示
        System.out.println("\n1から" + maxCount + "まで表示:");
        for (int i = 1; i <= maxCount; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
