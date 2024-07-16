package org.example.Ders15;

public class Product {
    private String name;
    private double price;
    private int quantity;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.quantity = builder.quantity;
    }

    public static class Builder {
        private String name;
        private double price;
        private int quantity;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + '}';
    }
}
