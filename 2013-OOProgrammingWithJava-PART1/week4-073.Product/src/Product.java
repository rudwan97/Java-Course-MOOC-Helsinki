/**
 * Created by Jeannette on 20/04/2017.
 */
public class Product {

    private String name;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountPriceAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountPriceAtStart;
    }

    public void printProduct() {
        System.out.println(this.name + " price " + this.price + " amount " + this.amount);
    }
}
