package step5.lesson11;

public class Circle {
    // privateフィールド
    private double radius;

    // 半径のgetter
    public double getRadius() {
        return radius;
    }

    // 半径のsetter（エラーチェックあり）
    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("半径は0以上の値を指定してください。");
        } else {
            this.radius = radius;
        }
    }

    // 面積計算メソッド
    public double calculateArea() {
        return radius * radius * 3.14;
    }
}

