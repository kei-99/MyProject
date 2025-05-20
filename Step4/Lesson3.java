public class Lesson3 {
    public static void main(String[]args) throws Exception{
        float f = 3.14f;
        double d = 123.456789;

        System.out.println("float: " + f);
        System.out.println("double: " + d);

        f = 10.5f;
        d = 0.00123;

        double result = f * d;
        System.out.println("Multiplication result: " + result);
    }
}
