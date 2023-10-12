package seminars.first.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        // Создаем копию списка продуктов, чтобы не изменять оригинальный список
        List<Product> sortedProducts = new ArrayList<>(products);

        // Сортируем список продуктов по цене
        Collections.sort(sortedProducts, Comparator.comparing(Product::getCost));

        return sortedProducts;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        if (products.isEmpty()) {
            return null; // Если список продуктов пуст, вернем null
        }

        // Используем компаратор для поиска самого дорогого продукта
        return Collections.max(products, Comparator.comparing(Product::getCost));
    }

}