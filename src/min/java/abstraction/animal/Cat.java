package min.java.abstraction.animal;

public class Cat extends Feline {
    Cat(String name) {
        super(name);
    }
    @Override
    void sound() {
        System.out.println(name +"가 야옹 거립니다.");
    }
    @Override
    void hunt() {
        System.out.println(name+"가 쥐를 사냥 합니다.");
    }
}
