import java.util.UUID;

class Runner {
    public static void main (String[] args) {
        System.out.println("Hello Shopping Cart");

        Product p1 = new Product(UUID.randomUUID(), "Toothbrush", 1.5);
        Product p2 = new Product(UUID.randomUUID(), "Toothpaste", 2.0);

        SimpleShoppingCart simpleShoppingCart = new SimpleShoppingCart();
        simpleShoppingCart.add(p1);
        simpleShoppingCart.add(p2);
        System.out.println(simpleShoppingCart.products.size());
        simpleShoppingCart.remove(p2.getId());
        System.out.println(simpleShoppingCart.products.size());

        double total = simpleShoppingCart.checkOut();
        System.out.println(total);
    }
}