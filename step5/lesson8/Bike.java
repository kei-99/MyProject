package step5.lesson8;

// BikeクラスはVehicleを継承し、move()をオーバーライド
public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("自転車がゆっくり進んでいます");
    }
}