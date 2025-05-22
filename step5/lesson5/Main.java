package  step5.lesson5;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("ポチ");
        dog.makeSound(); // ワンワン と出力される

        Animal cat = new Cat("ミケ");
        cat.makeSound(); // ニャーニャー と出力される
    }
}
