import java.util.UUID;

public interface ShoppingCart {
    void add(Product product);
    void remove(UUID id);
    double checkOut();
}