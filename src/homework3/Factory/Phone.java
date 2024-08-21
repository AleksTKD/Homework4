package homework3.Factory;

/**
 * класс телефон
 */
public abstract class Phone {
    abstract String getName();

    protected Camera camera;
    protected PhoneCase phoneCase;

    public Phone(Camera camera, PhoneCase phoneCase) {
        this.camera = camera;
        this.phoneCase = phoneCase;
    }

    public void takePhoto() {
        camera.takePhoto();
    }
}
