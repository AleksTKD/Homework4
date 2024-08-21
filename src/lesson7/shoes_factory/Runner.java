package lesson7.shoes_factory;

public class Runner {
    public static void main(String[] args) {
        Factory russiaFactory = new Factory(CountryEnum.RUSSIA);
        Factory franceFactory = new Factory(CountryEnum.FRANCE);

        System.out.println(russiaFactory);
        System.out.println(franceFactory);

    }
}