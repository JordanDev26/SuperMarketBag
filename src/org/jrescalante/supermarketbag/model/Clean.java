package org.jrescalante.supermarketbag.model;

public class Clean extends Product{
    private String components;
    private double liters;


    public Clean(String name, Double price, String components, double liters) {
        super(name, price);
        this.components = components;
        this.liters = liters;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }
    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder("Components: ").append(components).append("\n")
                .append("Liters: ").append(liters);
        return sb.toString();
    }
}
