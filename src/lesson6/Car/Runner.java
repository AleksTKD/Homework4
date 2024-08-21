package lesson6.Car;


public class Runner {
    public static void main(String[] args) {
        LightCar lightCar = new LightCar(1200,220, "Black");
        System.out.println(lightCar);
        lightCar.printInfo();

        HavyCar havyCar = new HavyCar(20000,150,"white");
        System.out.println(havyCar);


    }
}
