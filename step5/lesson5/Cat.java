package  step5.lesson5;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("ニャーニャー");
    }
}
