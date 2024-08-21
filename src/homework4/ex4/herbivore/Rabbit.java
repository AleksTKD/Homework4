package homework4.ex4.herbivore;

import homework4.ex4.exceptions.CannotRunException;

public class Rabbit extends Herbivore {
    public Rabbit(double weight) {
        super(weight);
    }

    @Override
    public void run() throws CannotRunException {
        if (!this.isAlive()) {
            throw new CannotRunException("Животное не может бегать");
        }
        System.out.println("Кролик быстро бежит");
    }
}
