package ru.itpark.repository;

import ru.itpark.model.AbstractProduct;

import java.util.*;

public class ProductRepository {
    private final Collection <AbstractProduct> products = new LinkedList<>();
    private long nextId = 1;

    public void save(AbstractProduct item){
        if (item.getId() == 0) {
            item.setId(nextId++);
        }
        products.add(item);
    }

    public boolean delete(int id) {
        return products.removeIf(product -> product.getId() == id);
    }

    public Collection<AbstractProduct> getAll() {
        return products;
    }
}


