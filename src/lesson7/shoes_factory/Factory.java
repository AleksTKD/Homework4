package lesson7.shoes_factory;

public class Factory {
    private CountryEnum countryFrom;

    public Factory(CountryEnum countryFrom) {

        this.countryFrom = countryFrom;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "countryFrom='" + countryFrom.getName() + '\'' +
                '}';
    }
}