package Homework3.Factory;

/**
 * создание Самсунга
 */

public class Samsung_Factory {
    public static Samsung createSamsung() {

        Processor processor = new Processor(1500);
        Camera camera = new Camera(16);
        PhoneCase phoneCase = new PhoneCase(60,200,15);
        return new Samsung(processor, camera, phoneCase);
    }

}
