package book.ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe();

        Cat cat = new Cat();
        cat.breathe();

        animalSound(dog);
        animalSound(cat);
    }
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
