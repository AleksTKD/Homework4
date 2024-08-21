package homework3.homework4.ex4.herbivore;

import homework3.homework4.ex4.exceptions.CannotRunException;

public class Elephant extends  Herbivore {
    public Elephant(double weight) {
        super(weight);
    }

    @Override
    public void run() throws CannotRunException {
        if (!this.isAlive()) {
            throw new CannotRunException("Животное не может бегать");
        }
        System.out.println("Слон медленно бежит");
    }
}
