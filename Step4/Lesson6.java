import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 67;
        int num3 = 32;

        int max = num1;
        if(num2 > max) {
            max = num2;
        }

        if(num3 > max){
            max = num3;
        }
        System.out.println("最も大きい値は: " + max);

        // ユーザー入力で最大値を判定
        Scanner scanner = new Scanner(System.in);

        System.out.print("1つ目の整数を入力してください:");
        int input1 =scanner.nextInt();

        System.out.print("2つ目の整数を入力してください:");
        int input2 =scanner.nextInt();

        System.out.print("3つ目の整数を入力してください:");
        int input3 =scanner.nextInt();

        int inputMax = input1;
        if(input2 > inputMax){
            inputMax = input2;
        }
        if(input3 > inputMax){
            inputMax = input3;
        }

        System.out.println("最も大きい値は: " + inputMax);

        scanner.close();
    }
}
