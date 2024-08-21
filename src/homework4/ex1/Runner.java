package homework3.homework4.ex1;

public class Runner {
    public static void main(String[] args) {
        // Создаем 4 легковых машины
        LightCar[] cars = {
                new LightCar(true, 1.8, 2, 5, true),
                new LightCar(true, 1.8, 2, 5, true),
                new LightCar(true, 1.8, 2, 5, true),
                new LightCar(true, 1.8, 2, 5, true)
        };

        // Создаем 5 автобусов
        Bus[] buses = {
                new Bus(true, 2.3, 3, 12, 50),
                new Bus(true, 2.3, 3, 12, 50),
                new Bus(true, 2.3, 3, 12, 50),
                new Bus(true, 2.3, 3, 12, 50),
                new Bus(true, 2.3, 3, 12, 50)
        };

        // Создаем автомойку
        CarWash carWash = new CarWash();

        // Моем все машины
        int totalCost = 0;
        totalCost += carWash.washAllCars(cars);
        totalCost += carWash.washAllCars(buses);

        // Выводим результат
        System.out.println("Мэрия заплатит за мойку всех машин: " + totalCost + " рублей.");
    }
}
