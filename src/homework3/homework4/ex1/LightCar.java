package homework3.homework4.ex1;

public class LightCar implements Washing {
    private boolean isDirty;
    private double width, height, length;
    private boolean hasCruiseControl;

    public LightCar(boolean isDirty, double width, double height, double length, boolean hasCruiseControl) {
        this.isDirty = isDirty;
        this.width = width;
        this.height = height;
        this.length = length;
        this.hasCruiseControl = hasCruiseControl;
    }

    @Override
    public boolean isDirty() {
        return isDirty;
    }

    @Override
    public void wash() {
        isDirty = false;
    }

    @Override
    public int cleaningCost() {
        if (length > 6 || height > 2.5 || width > 2) {
            return 4000; // цена за крупную машину
        } else {
            return 2000; // цена за маломерную машину
        }
    }
}
