package step5.lesson8;

// CarクラスはVehicleを継承し、move()をオーバーライド
public class Car implements  Vehicle {
    @Override
    public void move() {
        System.out.println("車が速く走っています");
    }
}
