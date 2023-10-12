package org.jrescalante.supermarketbag.model;

abstract public class Product {
    protected String name;
    protected Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Product: ").append("\n").append("Name: ").append(name)
                .append("\n").append("Price: ").append(price).append("\n");
        return sb.toString();
    }
}
