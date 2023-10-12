package org.jrescalante.supermarketbag.model;

public class Non_Perishable extends Product {
    private int content;
    private int calories;

    public Non_Perishable(String name, Double price, int content, int calories) {
        super(name, price);
        this.content = content;
        this.calories = calories;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder("Content: ").append(content).append("\n")
                .append("Calories: ").append(calories);
        return sb.toString();
    }
}
