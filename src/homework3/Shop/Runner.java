package homework3.Shop;

public class Runner {
    public static void main(String[] args) {
        Shop shop = new Shop(true, false, 3);

        Customer customer = new Customer("Aleks");

        customer.ceckShop(shop);
    }
}
