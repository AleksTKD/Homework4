package lesson7.independent.traffic_Light;

public class ControllerLight {
    TrafficLight currentLight;

    public ControllerLight(TrafficLight currentLight) {
        this.currentLight = currentLight;
    }

    public void changeLight () {
        switch (currentLight) {
            case RED:
                currentLight = TrafficLight.GREEN;
                break;
            case YELLOW:
                currentLight = TrafficLight.YELLOW;
                break;
            case GREEN:
                currentLight = TrafficLight.GREEN;
                break;
        }
    }

    public void showCurrentLihgt () {
        System.out.println("Текущий свет световофа: " + currentLight);
    }
}
