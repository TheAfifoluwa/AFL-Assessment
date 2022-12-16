package Question3;

public class Animal {
    //Using the OOP feature Inheritance, create a class Animal with the method sound()
    //and then create a Cat and Dog class that inherits from the Animal class.
    //The Cat and Dog class should override the sound class and print a different sound
    public void sound(){
        System.out.println("Sings");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
    }
}
