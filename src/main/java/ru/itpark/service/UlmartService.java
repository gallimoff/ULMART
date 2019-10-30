package ru.itpark.service;

import ru.itpark.model.AbstractProduct;
import ru.itpark.repository.ProductRepository;

import java.util.*;

public class UlmartService {
    private final ProductRepository repository;

    public UlmartService(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(AbstractProduct item) {
        if (item.getId() != 0) {
            throw new IllegalArgumentException("id must be zero!");
        }
        if (item.getName() == null) {
            throw new IllegalArgumentException("the field must not be empty");
        }
        if (item.getPrice() <= 0) {
            throw new IllegalArgumentException("price must be greater than zero");
        }
        repository.save(item);
    }

    public boolean deleteById(int id) {
        return repository.delete(id);
    }

    public List<AbstractProduct> searchByName(String name) {
        List<AbstractProduct> products = new LinkedList<>();
        for (AbstractProduct item : repository.getAll()) {
            if (item.getName().toLowerCase().contains(name.toLowerCase())) {
                products.add(item);
            }
        }
        products.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return products;
    }

    public List<AbstractProduct> searchByCategory(String category) {
        List<AbstractProduct> products = new LinkedList<>();
        for (AbstractProduct item : repository.getAll()) {
            if (item.getCategory().toLowerCase().contains(category.toLowerCase())) {
                products.add(item);
            }
        }
        products.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return products;
    }

    public List<AbstractProduct> getSortedBy(Comparator<AbstractProduct> comparator) {
        List<AbstractProduct> result = new LinkedList<>(repository.getAll());
        result.sort(comparator);
        return result;
    }

    public List<AbstractProduct> sortedByName() {
        return getSortedBy((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    }

    public List<AbstractProduct> sortedByPriceAsc() {
        return getSortedBy((o1, o2) -> o1.getPrice() - o2.getPrice());
    }

    public List<AbstractProduct> sortedByPriceDesc () {
        return getSortedBy((o1, o2) -> - (o1.getPrice() - o2.getPrice()));
    }

    public List<AbstractProduct> sortedByRating () {
        return getSortedBy((o1, o2)-> o1.getRating() - o2.getRating());
    }
}

