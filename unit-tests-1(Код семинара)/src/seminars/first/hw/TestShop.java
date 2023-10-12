package seminars.first.hw;

import seminars.first.Shop.Product;
import seminars.first.Shop.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class TestShop {
    public static void main(String[] args) {
        testShopStoresCorrectProducts();
        testGetMostExpensiveProduct();
        testSortProductsByPrice();
    }


    public static void testShopStoresCorrectProducts() {
        // Создаем продукты
        Product product1 = new Product();
        product1.setTitle("Product 1");
        product1.setCost(10);

        Product product2 = new Product();
        product2.setTitle("Product 2");
        product2.setCost(20);

        // Создаем магазин
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        shop.setProducts(products);

        // Проверяем, что магазин хранит верный список продуктов
        List<Product> storedProducts = shop.getProducts();
        assertThat(storedProducts).hasSize(2);
        assertThat(product1).isEqualTo(storedProducts.get(0));
        assertThat(product2).isEqualTo(storedProducts.get(1));
    }


    public static void testGetMostExpensiveProduct() {
        // Создаем продукты
        Product product1 = new Product();
        product1.setTitle("Product 1");
        product1.setCost(10);

        Product product2 = new Product();
        product2.setTitle("Product 2");
        product2.setCost(20);

        // Создаем магазин
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        shop.setProducts(products);

        // Проверяем, что метод getMostExpensiveProduct возвращает самый дорогой продукт
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        assertThat(product2).isEqualTo(mostExpensiveProduct);
    }


    public static void testSortProductsByPrice() {
        // Создаем продукты
        Product product1 = new Product();
        product1.setTitle("Product 1");
        product1.setCost(20);

        Product product2 = new Product();
        product2.setTitle("Product 2");
        product2.setCost(10);

        // Создаем магазин
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        shop.setProducts(products);

        // Сортируем продукты по цене
        List<Product> sortedProducts = shop.sortProductsByPrice();

        // Проверяем, что продукты отсортированы по возрастанию цены
        assertThat(sortedProducts).hasSize(2);
        assertThat(product2).isEqualTo(sortedProducts.get(0));
        assertThat(product1).isEqualTo(sortedProducts.get(1));

    }
}
