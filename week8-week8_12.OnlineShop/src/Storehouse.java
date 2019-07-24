
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    
    private Map<String, Integer> productsPrice;
    private Map<String, Integer> totalStock;
    
    public Storehouse() {
        productsPrice = new HashMap<String, Integer>();
        totalStock = new HashMap<String, Integer>();
    }
    public void addProduct(String product, int price, int stock) {
        this.productsPrice.put(product, price);
        this.totalStock.put(product, stock);
    }
    
    public int price(String product) {
        if(this.productsPrice.containsKey(product)) {
             return this.productsPrice.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        
        if(this.totalStock.containsKey(product)) {
            return this.totalStock.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if(this.totalStock.containsKey(product) && this.totalStock.get(product) > 0) {
            this.totalStock.put(product, this.totalStock.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> list = new HashSet<String>();
        for(String key : totalStock.keySet()) {
            list.add(key);
        }
        return list;
    }
}
