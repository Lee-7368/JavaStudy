package min.java.abstraction.animal;

public abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void eat() {
        System.out.println(name+"가 사료를 먹습니다");
    }
    abstract void sound();
}
