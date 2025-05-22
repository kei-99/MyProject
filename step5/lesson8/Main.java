package step5.lesson8;

// 実行用クラス
public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.move(); // 自転車がゆっくり進んでいます

        Vehicle car = new Car();
        car.move(); // 車が速く走っています
    }
}