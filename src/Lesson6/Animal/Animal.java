package Lesson6.Animal;

public abstract class Animal {// абстракт говорит о том что я не могу создать экземпляр класса, я могу только наследоваться от этого класса

    protected int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    public abstract void makeSound(); // тут мы пишум что бы каждое животное идало голос, но аждое животное сделает это по своему
}
