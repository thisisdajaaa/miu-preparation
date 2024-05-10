package stack.practice.animal_shelter;

public class Main {
    public static void main(String[] args) {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Cat1"));
        animals.enqueue(new Dog("Dog1"));
        animals.enqueue(new Cat("Cat2"));
        animals.enqueue(new Dog("Dog2"));
        animals.enqueue(new Cat("Cat3"));
        animals.enqueue(new Cat("Cat4"));

        System.out.println(animals.dequeueAny().getName());
        System.out.println(animals.dequeueCats().getName());
    }
}
