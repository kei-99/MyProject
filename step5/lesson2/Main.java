package step5.lesson2;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.showSpeed();   // Should print: 現在の速度: 0 km/h
        myCar.accelerate();  // Speed becomes 10
        myCar.showSpeed();   // Should print: 現在の速度: 10 km/h
        myCar.brake();       // Speed becomes 0
        myCar.showSpeed();   // Should print: 現在の速度: 0 km/h
    }
}
