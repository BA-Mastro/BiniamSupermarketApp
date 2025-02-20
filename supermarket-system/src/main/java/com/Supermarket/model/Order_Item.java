package com.Supermarket.model;

import jakarta.persistence.*;

@Entity
@Table(name= "order_items")

public class Order_Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Order order;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")

    private Product product;
    private  Integer quantity;
    private  Double price;

    public Order_Item(Order order, Product product, Integer quantity, Double price) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order_Item{" +
                "order=" + order +
                ", product=" + product +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
