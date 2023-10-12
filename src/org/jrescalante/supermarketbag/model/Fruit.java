package org.jrescalante.supermarketbag.model;

public class Fruit extends Product {
    private double weight;
    private String color;

    public Fruit(String name, Double price, double weight, String color) {
        super(name,price);
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder("Weight: ").append(weight).append("\n")
                .append("Color: ").append(color);
        return sb.toString();
    }
}
