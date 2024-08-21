package homework4.ex4.predators;

import homework4.ex4.exceptions.CannotAttackException;
import homework4.ex4.Living;

public class Tiger extends Predator {
    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public void attack(Living prey) throws CannotAttackException {
        if (!this.isAlive()) {
            throw new CannotAttackException("Животное не может нападать");
        }
        if (prey.getWeight() > this.getWeight() * 2) {
            this.die();
            System.out.println("Тигр погибает.");
        } else {
            prey.die();
            this.increaseWeight(prey.getWeight() / 3);
            System.out.println("Тигр нападает и увеличивает вес.");
        }
    }
}
