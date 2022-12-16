package Question3;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Barks");
    }
    public static void main(String[] args) {
        Animal animal;
        Dog dog = new Dog();
        animal = dog;
        animal.sound();
    }
}
