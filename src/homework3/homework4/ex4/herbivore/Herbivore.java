package homework3.homework4.ex4.herbivore;

import homework3.homework4.ex4.exceptions.CannotRunException;
import homework3.homework4.ex4.Living;

public abstract class Herbivore extends Living {
    public Herbivore(double weight) {
        super(weight);
    }
    public abstract void run() throws CannotRunException;
}
