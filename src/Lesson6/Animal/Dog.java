package Lesson6.Animal;

public class Dog extends Animal {

    public Dog(int weight) {
        super(weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Собачка говорит: Гав");
    }

    @Override
    public String toString() {
        return "Это сабачка с весом " + this.weight;
    }
}
