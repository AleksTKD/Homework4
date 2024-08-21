package lesson6.Car;

/**
 * Легковая машина
 */
public class LightCar extends Car {

    public LightCar(int weight, int maxSpeed, String color) {
        super(weight, maxSpeed, color);
    }

    public void printInfo () {
        System.out.println("Вес машины: " + this.weight);
    }
}
