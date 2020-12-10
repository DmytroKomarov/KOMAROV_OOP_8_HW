package pkg_task3;

import pkg_task2.Worker;

import java.util.Arrays;
import java.util.Comparator;

public class Price {
    private String product;
    private String store;
    private int price;

    public Price(String product, String store, int price) {
        this.product = product;
        this.store = store;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public String getStore() {
        return store;
    }

    public int getPrice() {
        return price;
    }



}
