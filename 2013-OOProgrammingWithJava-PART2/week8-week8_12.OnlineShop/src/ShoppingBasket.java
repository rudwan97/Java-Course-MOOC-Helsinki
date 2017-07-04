import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jeannette on 25/05/2017.
 */
public class ShoppingBasket {
    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new HashMap<>();
    }

    public void add(String product, int price) {
        Purchase shop = new Purchase(product, 1, price);
        if (purchases.containsKey(product)) {
            purchases.get(product).increaseAmount();
        } else {
            purchases.put(product, shop);
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Purchase item : purchases.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Purchase item : purchases.values()) {
            System.out.println(item);
        }
    }
}
