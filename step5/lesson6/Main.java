package step5.lesson6;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5); // 半径5の円
        System.out.println("円の面積: " + circle.getArea()); // 78.5

        Shape square = new Square(4); // 一辺4の正方形
        System.out.println("正方形の面積: " + square.getArea()); // 16.0
    }
}

