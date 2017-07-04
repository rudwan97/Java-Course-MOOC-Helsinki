import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> storePrices = new HashMap<>();
    private Map<String, Integer> storeStocks = new HashMap<>();

    public void addProduct(String product, int price, int stock) {
        storePrices.put(product, price);
        storeStocks.put(product, stock);
    }

    public int price(String product) {
        if (storePrices.containsKey(product)) {
            return storePrices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (storeStocks.containsKey(product)) {
            return storeStocks.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        int currentStock = stock(product);
        if (currentStock > 0) {
            currentStock--;
            storeStocks.put(product, currentStock);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> products = new HashSet<>();
        for (String key : storeStocks.keySet()) {
            products.add(key);
        }
        return products;
    }


}
