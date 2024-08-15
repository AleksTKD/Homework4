package Homework3.Factory;

/**
 * телефон Айфон
 */
public class Iphone extends Phone {

    @Override
    String getName() {
        return "iPhone";
    }

    private Processor[] processors;

    public Iphone(Processor[] processors, Camera camera, PhoneCase phoneCase) {
        super(camera,phoneCase);
        this.processors = processors;
    }

    public void processorInfo() {
        for (int i = 0; i < processors.length; i++) {
            System.out.println((i + 1) + "й процессор: " + processors[i].getMhz() + " Mhz");
        }

    }
}
