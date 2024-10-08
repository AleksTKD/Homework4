package homework4.ex2;

public class Airplane implements Flyable {
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers <= 0) {
            throw new FlyException("Колличество пассажиров не мможет быть меньше нуля");
        } else {
            System.out.println("Самолет летит");
        }
    }
}
