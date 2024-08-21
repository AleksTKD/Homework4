package homework4.ex2;

public class Runner {
    public static void main(String[] args) {
        Duck heatlyDuck = new Duck(false);
        Duck injuredDuck = new Duck(true);

        Airplane airplaneWithPassengers = new Airplane(10);
        Airplane airplaneWithoutPassengers = new Airplane(-1);

        // вызов объектов которые испульзуют интерфейс Flyable
        Flyable[] flyables = {heatlyDuck,injuredDuck,airplaneWithPassengers,airplaneWithoutPassengers};

        // вызов метода fly с перехватом исключений
        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
