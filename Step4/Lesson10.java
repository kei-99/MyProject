public class Lesson10 {
    public static void main(String[] args) {
        // 3の倍数と5の倍数を表示
        System.out.println("3の倍数のみ表示:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        
        // 3の倍数と5の倍数を表示
        System.out.println("3の倍数と5の倍数を表示:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        // FizzBuzz表示
        System.out.println("FizzBuzz表示:");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {  // 3かつ5の倍数
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
