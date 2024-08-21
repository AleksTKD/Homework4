package homework3.homework4.ex4;

import homework3.homework4.ex4.exceptions.CannotAttackException;
import homework3.homework4.ex4.exceptions.CannotRunException;
import homework3.homework4.ex4.herbivore.Elephant;
import homework3.homework4.ex4.herbivore.Rabbit;
import homework3.homework4.ex4.predators.Tiger;
import homework3.homework4.ex4.predators.Wolf;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(300);
        Wolf wolf = new Wolf(50);
        Rabbit rabbit = new Rabbit(2);
        Elephant elephant = new Elephant(2000);

        //кролик бежит
        try {
            rabbit.run();
        } catch (CannotRunException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Волк ест кролика
        try {
            wolf.attack(rabbit);
        } catch (CannotAttackException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тигр ест волка
        try {
            tiger.attack(wolf);
        } catch (CannotAttackException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тигр пытается съесть слона
        try {
            tiger.attack(elephant);
        } catch (CannotAttackException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Слон пробегает
        try {
            elephant.run();
        } catch (CannotRunException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Вызов бега у съеденного кролика
        try {
            rabbit.run();
        } catch (CannotRunException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
