package homework3.Factory;

/**
 * телефон Самсунг
 */
public class Samsung extends Phone{

    @Override
    String getName() {
        return "Samsung";
    }

    private Processor processor;

    public Samsung(Processor processor, Camera camera, PhoneCase phoneCase) {
        super(camera, phoneCase);
        this.processor = processor;
    }
}
