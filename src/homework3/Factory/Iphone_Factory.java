package homework3.Factory;

/**
 * создание айфона
 */
public class Iphone_Factory {
    public static Iphone createIphone() {
        Processor[] processors = {new Processor(1000), new Processor(1000)};
        Camera camera = new Camera(8);
        PhoneCase phoneCase = new PhoneCase(60, 200, 10);
        return new Iphone(processors, camera, phoneCase);
    }
}
