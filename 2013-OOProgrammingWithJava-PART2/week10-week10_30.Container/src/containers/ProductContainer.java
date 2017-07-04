package containers;

public class ProductContainer extends Container {
    private String productName;

    public ProductContainer(String productName, double capicity) {
        super(capicity);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        productName = newName;
    }

    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }
}
