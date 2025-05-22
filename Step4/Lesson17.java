public class Lesson17 {
    public static void main(String[] args) {
        // 配列の宣言と初期化
        int[] numbers = {34, 12, 25, 90, 45, 8, 67, 3, 56, 18};

        // 並べ替え前の配列を表示
        System.out.print("並べ替え前の配列: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // 改行

        // バブルソートの実装（昇順）
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // 交換
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // 並べ替え後の配列を表示
        System.out.print("並べ替え後の配列: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
