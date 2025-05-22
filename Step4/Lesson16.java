import java.util.Random;

public class Lesson16 {
    public static void main(String[] args) {
        // 配列の宣言（長さ10の整数型配列）
        int[] numbers = new int[10];

        // Randomクラスのインスタンスを作成
        Random random = new Random();

        // 0～100 の範囲でランダムな整数を生成して配列に格納
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101); // 0〜100までの整数
        }

        // 配列の表示（出力例に従って）
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("配列の要素 " + (i + 1) + ": " + numbers[i]);
        }
    }
}
