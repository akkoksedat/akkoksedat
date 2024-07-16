package org.example.Ders15;

public class Main {
    public static void main(String[] args) {

        SingletonClass singleton = SingletonClass.getInstance();
        singleton.showMessage();


        Product product = new Product.Builder()
                .setName("Laptop")
                .setPrice(1500.00)
                .setQuantity(5)
                .build();
        System.out.println(product);
    }
}
