package com.gmail.zcamilxrd.deliverys.supermarket.entity;


import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
public class SupermarketEntity {
    private String seller,
            product;
    private int price,
            quantity;
    private UUID id;
    private Timestamp time;

    public SupermarketEntity(String seller, String product, int price, int quantity) {
        this.seller = seller;
        this.product = product;
        this.price = price;
        this.quantity = quantity;

        this.id = UUID.randomUUID();
        this.time = new Timestamp(System.currentTimeMillis());
    }
}
