public class Lesson18 {
    public static void main(String[] args) {
        // 配列の宣言と初期化
        int[] numbers = {34, 12, 25, 90, 45, 8, 67, 3, 56, 18};

        // 配列の内容を表示
        System.out.print("配列の要素: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println(); // 改行

        // 最初の値を最大・最小と仮定
        int max = numbers[0];
        int min = numbers[0];

        // for文で最大値・最小値を探す
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // より大きい値が見つかったら更新
            }
            if (numbers[i] < min) {
                min = numbers[i]; // より小さい値が見つかったら更新
            }
        }

        // 結果を表示
        System.out.println("配列の最大値は: " + max);
        System.out.println("配列の最小値は: " + min);
    }
}
