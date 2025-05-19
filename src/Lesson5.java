public class Lesson5 {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int temp;

        System.out.println("値を交換する前: 変数1=" + num1 +",変数2=" + num2 );

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("値を交換した後: 変数1=" + num1 +",変数2=" + num2 );
    }
}
