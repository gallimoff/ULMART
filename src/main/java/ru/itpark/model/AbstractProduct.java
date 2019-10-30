package ru.itpark.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public abstract class AbstractProduct {
    private long id;
    private String category;
    private String name;
    private int price;
    private int rating;
}