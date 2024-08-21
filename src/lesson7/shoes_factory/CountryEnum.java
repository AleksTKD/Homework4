package lesson7.shoes_factory;

public enum CountryEnum {
    RUSSIA("Россия", 145_000_000),
    FRANCE("Франция", 80_000_000);

    private String name;
    private int countPeople;

    CountryEnum(String name, int countPeople) {
        this.name = name;
        this.countPeople = countPeople;
    }

    public String getName() {
        return name;
    }

    public int getCountPeople() {
        return countPeople;
    }
}