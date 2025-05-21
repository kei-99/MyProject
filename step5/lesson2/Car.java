package step5.lesson2;

public class Car {
    private int speed;

    // Constructor to initialize speed to 0
    public Car() {
        this.speed = 0;
    }

    // 加速（accelerate） method
    public void accelerate() {
        speed += 10;
    }

    // 減速 (Brake) method
    public void brake() {
        if (speed >= 10) {
            speed -= 10;
        } else {
            speed = 0;
        }
    }

    // Show current speed
    public void showSpeed() {
        System.out.println("現在の速度: " + speed + " km/h");
    }
}
