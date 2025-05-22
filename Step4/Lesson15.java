import java.util.Scanner;

public class Lesson15 {
    public static void main(String[] args) {
        // 配列の宣言
        String[] names = new String[5];

        // Scannerでユーザー入力を受け取る
        Scanner scanner = new Scanner(System.in);

        System.out.println("5人の名前を入力してください");
        // ユーザーに5人の名前を入力してもらう
        for (int i = 0; i < names.length; i++) {
            System.out.print((i + 1) + "人目の名前を入力してください: ");
            names[i] = scanner.nextLine();
        }

        // 名前の表示（出力例に合わせて表示）
        for (int i = 0; i < names.length; i++) {
            System.out.println("名前" + (i + 1) + ": " + names[i]);
        }

        scanner.close();
    }
}
