import java.util.Scanner;

public class Lesson12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("文字列を入力してください（終了するには 'quit' と入力）: ");
            input = scanner.nextLine();

            if (input.equals("quit")) {
                System.out.println("プログラムを終了します");
                break;
            }

            System.out.println("あなたが入力した文字列: " + input);
        }

        scanner.close();
    }
}
