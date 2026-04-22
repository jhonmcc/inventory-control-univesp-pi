package com.univesp.inventory.control.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

//    private String sku;
//    private Double costPrice;
//    private Double salePrice;
//    private Integer minStock;
//
//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private CategoryEntity category;
}
