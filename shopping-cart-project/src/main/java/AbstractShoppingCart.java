import java.util.List;
import java.util.UUID;

public abstract class AbstractShoppingCart implements ShoppingCart {

    List<Product> products;

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void remove(UUID id) {
        products.removeIf(product -> product.getId() == id);
    }

    @Override
    public abstract double checkOut();
}