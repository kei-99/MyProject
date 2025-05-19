import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 4;

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("商: " + quotient + ", 余り: " + remainder);

        Scanner scanner = new Scanner(System.in);

        System.out.print("1つ目の整数を入力してください: ");
        int input1 = scanner.nextInt();

        System.out.print("2つ目の整数を入力してください: ");
        int input2 = scanner.nextInt();

        int inputQuotient = input1 / input2;
        int inputRemainder = input1 % input2;

        System.out.println("商: " + inputQuotient + ", 余り: " + inputRemainder);

        scanner.close();
    }
}
