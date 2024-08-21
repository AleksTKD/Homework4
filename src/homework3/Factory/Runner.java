package homework3.Factory;

public class Runner {
    public static void main(String[] args) {

        Samsung samsung = Samsung_Factory.createSamsung();
        System.out.println("Телефон: " + samsung.getName());
        samsung.takePhoto();

        Iphone iphone = Iphone_Factory.createIphone();
        System.out.println("Телефон: " + iphone.getName());
        iphone.takePhoto();
        iphone.processorInfo();
    }
}
