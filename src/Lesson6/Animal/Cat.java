package Lesson6.Animal;

public class Cat extends Animal {

    public Cat(int weight) {
        super(weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Кошка говорит: Мяу");
    }

    @Override
    public String toString() {
        return "Эта кошечка с весом " + this.weight;
    }
}
