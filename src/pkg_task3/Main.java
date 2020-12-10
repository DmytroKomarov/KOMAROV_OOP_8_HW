package pkg_task3;

import pkg_task2.Worker;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Price[] prices = new Price[2];

        System.out.println("Enter a description of 2 products");
        for (int i = 0; i < prices.length ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Product #" + (i+1) + ", (product, store, price)");
            prices[i] = new Price(sc.nextLine(),sc.nextLine(),sc.nextInt());
            System.out.println();

        }

        Arrays.sort(prices, new Comparator<Price>() {
            public int compare(Price a, Price b) {
                return a.getStore().compareTo(b.getStore());
            }
        });

        System.out.println("Enter store");
        Scanner sc = new Scanner(System.in);
        String store = sc.nextLine();


        Exception exception = new Exception();
        boolean existsShop = false;
        try {
             for (Price price : prices) {
                if (store.equals(price.getStore())) {
                    System.out.println("Products of " + store + " store: " + price.getProduct() + ", " + price.getPrice());
                    existsShop = true;
                }
            }
            if (!existsShop) throw exception;
        } catch (Exception e) {
            System.out.println(store + " store doesn't exist");
        }

    }

}
