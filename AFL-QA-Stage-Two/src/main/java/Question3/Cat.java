package Question3;

public class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("Meows");
    }

    public static void main(String[] args) {
        Animal animal;
        Cat cat = new Cat();
        animal = cat;
        animal.sound();
    }
}
