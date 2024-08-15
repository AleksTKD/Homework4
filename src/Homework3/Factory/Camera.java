package Homework3.Factory;

/**
 * класс камера
 */
public class Camera {
    private int megapixels;

    public Camera(int megapixels) {
        this.megapixels = megapixels;
    }

    public void takePhoto() {
        System.out.println("Сделано фото");
    }
}
