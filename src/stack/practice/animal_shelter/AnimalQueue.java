package stack.practice.animal_shelter;

import java.util.LinkedList;

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();

    private int order = 0;

    public void enqueue(Animal a) {
        a.setOrder(order);
        order++;

        if (a instanceof Dog) {
            dogs.addLast((Dog) a);
        } else if (a instanceof Cat) {
            cats.addLast((Cat) a);
        }
    }

    public int size() {
        return dogs.size() + cats.size();
    }

    public Dog dequeueDogs() {
        // retrieve and removes the first element
        return dogs.poll();
    }

    public Dog peekDogs() {
        // returns the first element
        return dogs.peek();
    }

    public Cat dequeueCats() {
        // retrieve and removes the first element
        return cats.poll();
    }

    public Cat peekCats() {
        // returns the first element
        return cats.peek();
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return dequeueCats();
        } else if (cats.isEmpty()) {
            return dequeueDogs();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThanAnimal(cat)) {
            return dogs.poll();
        }

        return cats.poll();
    }

    public Animal peek() {
        if (dogs.isEmpty()) {
            return peekCats();
        } else if (cats.isEmpty()) {
            return peekDogs();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThanAnimal(cat)) {
            return peekDogs();
        }

        return peekCats();
    }
}
