package org.jrescalante.supermarketbag.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SuperMarketBag<T> implements Iterable<T> {
    List<T> products;
    public SuperMarketBag(){
        products = new ArrayList<>();
    }

    public SuperMarketBag<T> addProduct(T t){
        products.add(t);
        return this;
    }

    public List<T> getProducts(){
        return products;
    }

    @Override
    public Iterator<T> iterator() {
        return products.iterator();
    }
}
