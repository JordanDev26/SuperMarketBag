package org.jrescalante.supermarketbag.model;

public class Dairy extends Product{
    private int amount;
    private int protein;

    public Dairy(String name, Double price, int amount, int protein) {
        super(name, price);
        this.amount = amount;
        this.protein = protein;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder("Amount: ").append(amount).append("\n")
                .append("Protein: ").append(protein);
        return sb.toString();
    }
}
