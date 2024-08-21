package lesson7.independent.traffic_Light;

public class Runner {
    public static void main(String[] args) {
        ControllerLight controllerLight = new ControllerLight(TrafficLight.RED);
        controllerLight.showCurrentLihgt();

        controllerLight.changeLight();
        controllerLight.showCurrentLihgt();

        controllerLight.changeLight();
        controllerLight.showCurrentLihgt();
    }
}
