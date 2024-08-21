package homework3.homework4.ex1;

public class CarWash {
    public int washCar(Washing car) {
        if (car.isDirty()) {
            car.wash();
            return car.cleaningCost();
        }
        return 0;
    }

    public int washAllCars(Washing[] cars) {
        int totalCost = 0;
        for (Washing car : cars) {
            totalCost += washCar(car);
        }
        return totalCost;
    }
}
