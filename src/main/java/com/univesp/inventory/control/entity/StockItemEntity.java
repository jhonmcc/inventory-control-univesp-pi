package com.univesp.inventory.control.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "stock_items")
public class StockItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ProductEntity product;

    private Integer quantity;
}
