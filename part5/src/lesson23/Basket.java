package lesson23;

import java.util.List;

interface Basket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    List<Integer> getQuantity();

    int getProductQuantity(String product);
}
