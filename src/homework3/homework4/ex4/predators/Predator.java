package homework3.homework4.ex4.predators;

import homework3.homework4.ex4.exceptions.CannotAttackException;
import homework3.homework4.ex4.Living;

public abstract class Predator extends Living {
    public Predator(double weight) {
        super(weight);
    }

    public void attack(Living prey) throws CannotAttackException {
        if (!this.isAlive()) {
            throw new CannotAttackException("Животное не может нападать");
        }

        if (prey.getWeight() > this.getWeight()) {
            this.die();
            System.out.println("Хищник погибает.");
        } else {
            prey.die();
            this.increaseWeight(prey.getWeight() / 3);
            System.out.println("Хищник нападает.");
        }
    }
}

