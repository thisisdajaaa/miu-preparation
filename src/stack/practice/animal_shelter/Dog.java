package stack.practice.animal_shelter;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Dog: " + super.getName();
    }
}
