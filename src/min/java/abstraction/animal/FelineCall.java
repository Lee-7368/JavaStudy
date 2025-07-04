package min.java.abstraction.animal;

public class FelineCall {
    public static void main(String[] args) {
        Feline feline = new Cat("나비");

        feline.eat();
        feline.sound();
        feline.hunt();
    }
}
