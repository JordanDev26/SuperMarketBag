package org.jrescalante.supermarketbag.model;

import java.util.ArrayList;
import java.util.List;

public class SuperMarketBag<T> {
    List<T> products;
    public SuperMarketBag(){
        products = new ArrayList<>();
    }

    public void addProduct(T t){
        products.add(t);

    }

    public List<T> getProducts(){
        return products;
    }
}
